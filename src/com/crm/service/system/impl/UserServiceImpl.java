package com.crm.service.system.impl;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.crm.MenuBar;
import com.crm.bean.crm.UserPermission;
import com.crm.model.XmProfile2globalpermissions;
import com.crm.model.XmProfile2standardpermissions;
import com.crm.model.XmRole;
import com.crm.model.XmTab;
import com.crm.model.XmUsers;
import com.crm.service.XmFieldService;
import com.crm.service.XmTabService;
import com.crm.service.system.UserService;
import com.crm.settings.basic.service.XmProfile2globalpermissionsService;
import com.crm.settings.basic.service.XmProfile2standardpermissionsService;
import com.crm.settings.basic.service.XmRole2profileService;
import com.crm.settings.basic.service.XmRoleService;
import com.crm.util.CacheManager;
import com.crm.util.Constant;
import com.crm.util.crm.PermissionUtil;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service("userService")
public class UserServiceImpl implements UserService {

	XmRoleService xmRoleService;
	@Resource(name="settings.basic.service.xmRoleService")
	public void setXmRoleService(XmRoleService xmRoleService) {
		this.xmRoleService = xmRoleService;
	}
	
	XmRole2profileService xmRole2profileService;
	@Resource(name="xmRole2profileService")
	public void setXmRole2profileService(XmRole2profileService xmRole2profileService) {
		this.xmRole2profileService = xmRole2profileService;
	}
	
	XmProfile2globalpermissionsService xmProfile2globalpermissionsService;
	@Resource(name="xmProfile2globalpermissionsService")
	public void setXmProfile2globalpermissionsService(
			XmProfile2globalpermissionsService xmProfile2globalpermissionsService) {
		this.xmProfile2globalpermissionsService = xmProfile2globalpermissionsService;
	}
	
	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}
	
	XmProfile2standardpermissionsService xmProfile2standardpermissionsService;
	@Resource(name="xmProfile2standardpermissionsService")
	public void setXmProfile2standardpermissionsService(
			XmProfile2standardpermissionsService xmProfile2standardpermissionsService) {
		this.xmProfile2standardpermissionsService = xmProfile2standardpermissionsService;
	}
	
	XmFieldService xmFieldService;
	@Resource(name="xmFieldService")
	public void setXmFieldService(XmFieldService xmFieldService) {
		this.xmFieldService = xmFieldService;
	}
	
	@Override
	public String getNavBar(XmUsers login,String tpl,UserPermission userpermission) {
		List<MenuBar> menubar = (List<MenuBar>) CacheManager.getFromCache(Constant.MENUBAR);
		
		Configuration cfg = new Configuration();
		cfg.setEncoding(Locale.CHINA, "UTF-8");
		try {
			cfg.setDirectoryForTemplateLoading(new File(tpl));
			Template temp = cfg.getTemplate("navbar.tpl");
			Map data = new HashMap();
			data.put("login", login);
			data.put("menubar", menubar);
			data.put("permission", userpermission);
			Writer out = new StringWriter();
			temp.process(data, out);
			out.flush();
			return out.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public UserPermission getUserPermission(XmUsers login) {
		UserPermission permission = new UserPermission();
		XmRole role = this.xmRoleService.getUserRole(login.getId());
		int profileid = this.xmRole2profileService.getProfileidByRoleId(role.getRoleid());
		//全局规则
		List<XmProfile2globalpermissions> globalpermissions = this.xmProfile2globalpermissionsService.getPermissionsByProfileid(profileid);
		permission.setGlobalpermissions(globalpermissions);
		//模块的权限规则，包括字段的权限
		List<XmTab> tabPermissions = this.xmTabService.getTabPermission(profileid);
		List<XmProfile2standardpermissions> standardpermissions = this.xmProfile2standardpermissionsService.getStandardPermissionsByProfileId(profileid);
		permission.setModulePermission(PermissionUtil.GenerateUserModulePerssion(tabPermissions,standardpermissions,this.xmFieldService));

		return permission;
	}

}
