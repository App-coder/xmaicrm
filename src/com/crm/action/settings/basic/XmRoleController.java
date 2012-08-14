package com.crm.action.settings.basic;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.crm.Permission;
import com.crm.bean.crm.permission.ModulePermission;
import com.crm.bean.easyui.ComboTree;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmDefOrgField;
import com.crm.model.XmProfile;
import com.crm.model.XmProfile2globalpermissions;
import com.crm.model.XmProfile2standardpermissions;
import com.crm.model.XmRole;
import com.crm.model.XmTab;
import com.crm.service.XmDefOrgFieldService;
import com.crm.service.XmFieldService;
import com.crm.service.XmTabService;
import com.crm.service.settings.basic.XmProfile2globalpermissionsService;
import com.crm.service.settings.basic.XmProfile2standardpermissionsService;
import com.crm.service.settings.basic.XmProfileService;
import com.crm.service.settings.basic.XmRole2profileService;
import com.crm.service.settings.basic.XmRoleService;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.util.crm.PermissionUtil;

/**
 * 
 * 基本设置-角色权限
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:11:55
 */
@Controller("settings.basic.action.XmRoleController")
@RequestMapping(value = "crm/settings/role")
public class XmRoleController extends BaseController {
	
	XmRoleService xmRoleService;
	@Resource(name="xmRoleService")
	public void setXmRoleService(XmRoleService xmRoleService) {
		this.xmRoleService = xmRoleService;
	}
	
	XmUsersService xmUsersService;
	@Resource(name="xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}
	
	XmRole2profileService xmRole2profileService;
	@Resource(name="xmRole2profileService")
	public void setXmRole2profileService(XmRole2profileService xmRole2profileService) {
		this.xmRole2profileService = xmRole2profileService;
	}
	
	XmProfileService xmProfileService;
	@Resource(name="xmProfileService")
	public void setXmProfileService(XmProfileService xmProfileService) {
		this.xmProfileService = xmProfileService;
	}
	
	XmProfile2globalpermissionsService xmProfile2globalpermissionsService;
	@Resource(name="xmProfile2globalpermissionsService")
	public void setXmProfile2globalpermissionsService(
			XmProfile2globalpermissionsService xmProfile2globalpermissionsService) {
		this.xmProfile2globalpermissionsService = xmProfile2globalpermissionsService;
	}
	
	XmFieldService xmFieldService;
	@Resource(name="xmFieldService")
	public void setXmFieldService(XmFieldService xmFieldService) {
		this.xmFieldService = xmFieldService;
	}

	//标准接口的操作
	XmProfile2standardpermissionsService xmProfile2standardpermissionsService;
	@Resource(name="xmProfile2standardpermissionsService")
	public void setXmProfile2standardpermissionsService(
			XmProfile2standardpermissionsService xmProfile2standardpermissionsService) {
		this.xmProfile2standardpermissionsService = xmProfile2standardpermissionsService;
	}

	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}
	
	XmDefOrgFieldService xmDefOrgFieldService;
	@Resource(name="xmDefOrgFieldService")
	public void setXmDefOrgFieldService(XmDefOrgFieldService xmDefOrgFieldService) {
		this.xmDefOrgFieldService = xmDefOrgFieldService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/basic/role";
	}
	
	@RequestMapping(value = "/getRolesByParent", method = RequestMethod.POST)
	@ResponseBody
	public String getRolesByParent(@RequestParam("id") String id){
		List<Object> roles = null;
		if(id.equals("0")){
			roles = this.xmRoleService.getRolesByParent("H1",0);
		}else{
			XmRole role = xmRoleService.getRoleById(id);
			roles = this.xmRoleService.getRolesByParent(role.getParentrole(),role.getDepth()+1);
		}

		return JSON.toJSONString(roles);
	}
	
	/**
	 * 得到权限的Tree树
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getRoleTree", method = RequestMethod.POST)
	@ResponseBody
	public String getRoleTree(){
		List<XmRole> roles = this.xmRoleService.getAll();
		
		List<ComboTree> cbotrees = new ArrayList<ComboTree>();
		ComboTree root = new ComboTree();

		root.setId("H1");
		for(int i=0;i<roles.size();i++){
			if(roles.get(i).getRoleid().equals("H1")&&roles.get(i).getDepth()==0){
				root.setText(roles.get(i).getRolename());
				root.setAttributes(roles.get(i));
				root.setChildren(getChild(roles, roles.get(i).getParentrole(), roles.get(i).getDepth()));
				cbotrees.add(root);
			}
		}
		
		return JSON.toJSONString(cbotrees);
	}
	
	//设置ComboTree的childs
	public List<ComboTree> getChild(List<XmRole> roles,String parentrole,int depth){
		List<ComboTree> trees = new ArrayList<ComboTree>();
		for(int i=0;i<roles.size();i++){
			if(roles.get(i).getParentrole().indexOf(parentrole+"::")!=-1&&roles.get(i).getDepth() == depth+1){
				
				ComboTree item = new ComboTree();
				item.setId(roles.get(i).getRoleid());
				item.setText(roles.get(i).getRolename());
				item.setAttributes(roles.get(i));
				item.setChildren(getChild(roles, roles.get(i).getParentrole(), roles.get(i).getDepth()));
				trees.add(item);
			}
		}
		return trees;
	}
	
	@RequestMapping(value = "/getRoleAuthority", method = RequestMethod.POST)
	@ResponseBody
	public String getRoleAuthority(String roleid){
		Permission permission = new Permission();
		
		int profileid = this.xmRole2profileService.getProfileidByRoleId(roleid);
		XmProfile profile = this.xmProfileService.getProfile(profileid);
		permission.setProfile(profile);
		
		//全局权限 
		List<XmProfile2globalpermissions>  globalpermissions = this.xmProfile2globalpermissionsService.getPermissionsByProfileid(profileid);
		permission.setProfile2globalpermissions(globalpermissions);
		
		//模块的权限规则
		List<XmTab> tabPermissions = this.xmTabService.getTabPermission();
		List<XmProfile2standardpermissions> standardpermissions = this.xmProfile2standardpermissionsService.getStandardPermissionsByProfileId(profileid);
		List<ModulePermission> modulePermission = PermissionUtil.GenerateModulePerssion(tabPermissions,standardpermissions,this.xmFieldService,profileid,xmDefOrgFieldService);
		ListBean beanPermission = new ListBean();
		beanPermission.setRows(modulePermission);
		beanPermission.setTotal(modulePermission.size());
		permission.setModulePermission(beanPermission);
		
		return JSON.toJSONString(permission);
	}
	
	@RequestMapping(value = "/getRelUser", method = RequestMethod.POST)
	@ResponseBody
	public String getRelUser(@RequestParam("page") int page,@RequestParam("rows") int rows,@RequestParam("roleid") String roleid){
		List<Object> users = this.xmUsersService.getRelUser(page,rows,roleid);
		int total = this.xmUsersService.getTotalRelUser(roleid);

		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(users);
		
		return JSON.toJSONString(bean);
	}
	
	/**
	 * 添加角色
	 * 
	 * @return
	 */
	@RequestMapping(value = "/showAdd", method = RequestMethod.GET)
	public String showAdd(@RequestParam("parentroleid") String parentroleid,ModelMap modelMap){
		
		XmRole parentRole = this.xmRoleService.getRoleById(parentroleid);
		modelMap.addAttribute("parentRole",parentRole);
		modelMap.addAttribute("depth",parentRole.getDepth()+1);
		
		if(!parentroleid.equals("H1")){
			int profileid = this.xmRole2profileService.getProfileidByRoleId(parentroleid);
			XmProfile profile = this.xmProfileService.getProfile(profileid);
			
			//全局权限 
			List<XmProfile2globalpermissions>  globalpermissions = this.xmProfile2globalpermissionsService.getPermissionsByProfileid(profileid);
			modelMap.addAttribute("globalpermissions",globalpermissions);
			
			//模块的信息
			List<XmTab> tabPermissions = this.xmTabService.getTabPermission(profileid);
			List<XmProfile2standardpermissions> standardpermissions = this.xmProfile2standardpermissionsService.getStandardPermissionsByProfileId(profileid);
			List<ModulePermission> modulePermission = PermissionUtil.GenerateModulePerssion(tabPermissions,standardpermissions,this.xmFieldService,profileid,xmDefOrgFieldService);
			modelMap.addAttribute("modulePermission",modulePermission);
		}
		
		return "settings/basic/role/showAdd";
	}
	
	@RequestMapping(value = "/showEdit", method = RequestMethod.GET)
	public String showEdit(String roleid,ModelMap modelMap){
		
		XmRole role = this.xmRoleService.getRoleById(roleid);
		modelMap.addAttribute("role",role);
		
		int profileid = this.xmRole2profileService.getProfileidByRoleId(roleid);
		XmProfile profile = this.xmProfileService.getProfile(profileid);
		modelMap.addAttribute("profile",profile);
		
		//全局权限 
		List<XmProfile2globalpermissions>  globalpermissions = this.xmProfile2globalpermissionsService.getPermissionsByProfileid(profileid);
		modelMap.addAttribute("globalpermissions",globalpermissions);
		
		//模块的信息
		List<XmTab> tabPermissions = this.xmTabService.getTabPermission(profileid);
		List<XmProfile2standardpermissions> standardpermissions = this.xmProfile2standardpermissionsService.getStandardPermissionsByProfileId(profileid);
		List<ModulePermission> modulePermission = PermissionUtil.GenerateModulePerssion(tabPermissions,standardpermissions,this.xmFieldService,profileid,xmDefOrgFieldService);
		modelMap.addAttribute("modulePermission",modulePermission);
		
		return "settings/basic/role/showEdit";
	}
	
}
