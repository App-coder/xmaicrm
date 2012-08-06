package com.crm.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.Hometemplates;
import com.crm.bean.crm.Message;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.crm.hometemplates.TemplatesStuff;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmHomestuff;
import com.crm.model.XmHometemplates;
import com.crm.model.XmHometemplatesrole;
import com.crm.model.XmParenttab;
import com.crm.model.XmRole;
import com.crm.service.XmHomestuffService;
import com.crm.service.XmHometemplatesService;
import com.crm.service.XmHometemplatesroleService;
import com.crm.service.module.XmRoleService;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;
import com.crm.util.JsonUtil;
import com.crm.util.crm.CustomViewUtil;

@Controller
@RequestMapping(value = "crm/hometemplates")
@SessionAttributes(Constant.USERPERMISSION)
public class XmHometemplatesController {
	
	XmHometemplatesroleService xmHometemplatesroleService;
	@Resource(name="xmHometemplatesroleService")
	public void setXmHometemplatesroleService(
			XmHometemplatesroleService xmHometemplatesroleService) {
		this.xmHometemplatesroleService = xmHometemplatesroleService;
	}

	XmHometemplatesService xmHometemplatesService;
	@Resource(name="xmHometemplatesService")
	public void setXmHometemplatesService(
			XmHometemplatesService xmHometemplatesService) {
		this.xmHometemplatesService = xmHometemplatesService;
	}
	
	XmHomestuffService xmHomestuffService;
	@Resource(name="xmHomestuffService")
	public void setXmHomestuffService(XmHomestuffService xmHomestuffService) {
		this.xmHomestuffService = xmHomestuffService;
	}
	
	XmRoleService xmRoleService;
	@Resource(name="com.crm.service.module.impl.xmRoleService")
	public void setXmRoleService(XmRoleService xmRoleService) {
		this.xmRoleService = xmRoleService;
	}

	@RequestMapping(value = "/loadlist", method = RequestMethod.POST)
	@ResponseBody
	public String loadlist(int page,int rows){
		ListBean bean = new ListBean();
		
		int total = this.xmHometemplatesService.getTotal();
		List<XmHometemplates> templates = this.xmHometemplatesService.loadlist(page,rows);
		List<XmHometemplates> newtemplates = new ArrayList<XmHometemplates>();
		List<XmHometemplatesrole> hroles = this.xmHometemplatesroleService.loadAll();
		for(int i=0;i<templates.size();i++){
			newtemplates.add(getRoles(templates.get(i).getHometemplatesid(),hroles,templates.get(i)));
		}
		
		bean.setTotal(total);
		bean.setRows(newtemplates);
		
		return JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
	}
	
	public XmHometemplates getRoles(int hid,List<XmHometemplatesrole> hroles,XmHometemplates templates){
		StringBuffer sb = new StringBuffer();
		StringBuffer roleids = new StringBuffer();
		for(int i=0;i<hroles.size();i++){
			if(hid == hroles.get(i).getHometemplatesid()){
				sb.append(","+hroles.get(i).getRolename());
				roleids.append(","+hroles.get(i).getRoleid());
			}
		}
		templates.setRelRoles(sb.toString().replaceFirst(",",""));
		templates.setRelRoleIds(roleids.toString().replaceFirst(",",""));
		return templates;
	}
	
	
	/**
	 * 
	 * 组件模版编辑
	 * 
	 * @param hometemplatesid
	 * @param hometemplatesname
	 * @param stufftype
	 * @param roleid
	 * @return
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@ResponseBody
	public String edit(int hometemplatesid,String hometemplatesname,String templatesstuffs,String[] roleid,@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		List<TemplatesStuff> stuffs = new ArrayList<TemplatesStuff>();
		if(!templatesstuffs.equals("")){
			stuffs =  JsonUtil.getList4Json(templatesstuffs,TemplatesStuff.class);
		}
		
		Message msg = new Message();
		
		//编辑
		if(hometemplatesid>0){
			
			XmHometemplates template = new XmHometemplates();
			template.setHometemplatesid(hometemplatesid);
			template.setHometemplatesname(hometemplatesname);
			this.xmHometemplatesService.update(template);
			
			//设置关联的角色 1.删除关联 2添加关联
			this.xmHometemplatesroleService.deleteRel(hometemplatesid);
			this.xmHometemplatesroleService.insertRel(hometemplatesid,roleid);
			
			
			//1删除stuff,2添加stuff
			this.xmHomestuffService.deleteByStuffId(hometemplatesid);
			for(int i=0;i<stuffs.size();i++){
				XmHomestuff stuff = new XmHomestuff();
				stuff.setStuffid(hometemplatesid);
				stuff.setStuffsequence(i);
				stuff.setStufftitle(stuffs.get(i).getStufftitle());
				stuff.setStufftype(stuffs.get(i).getStufftype());
				stuff.setUserid(userPermission.getUser().getId());
				stuff.setVisible(0);
				this.xmHomestuffService.insert(stuff);
			}
			
			
		}else{
			
			//新增
			XmHometemplates template = new XmHometemplates();
			template.setHometemplatesid(hometemplatesid);
			template.setHometemplatesname(hometemplatesname);
			template.setCreatedtime(new Date());
			template.setDeleted(0);
			template.setModifiedby(userPermission.getUser().getId());
			template.setModifiedtime(new Date());
			template.setSmcreatorid(userPermission.getUser().getId());
			int stuffid = this.xmHometemplatesService.insert(template);
			
			//关联角色
			this.xmHometemplatesroleService.insertRel(stuffid, roleid);
			
			//设置stuff
			List<XmHomestuff> stfArray = new ArrayList<XmHomestuff>();
			for(int i=0;i<stuffs.size();i++){
				XmHomestuff stuff = new XmHomestuff();
				stuff.setStuffid(stuffid);
				stuff.setStuffsequence(i);
				stuff.setStufftitle(stuffs.get(i).getStufftitle());
				stuff.setStufftype(stuffs.get(i).getStufftype());
				stuff.setUserid(userPermission.getUser().getId());
				stuff.setVisible(0);
				this.xmHomestuffService.insert(stuff);
			}
		}
		
		msg.setMessage("组件模版编辑成功！");
		msg.setType(true);
		
		return JSON.toJSONString(msg);
	}
	

	
	/**
	 * 组件模版删除
	 * 
	 * @param hometemplatesid
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	public String delete(int hometemplatesid){
		
		this.xmHometemplatesService.deleteById(hometemplatesid);
		this.xmHometemplatesroleService.deleteRel(hometemplatesid);
		this.xmHomestuffService.deleteByStuffId(hometemplatesid);
		
		Message msg = new Message();
		msg.setMessage("组件模版删除成功！");
		msg.setType(true);
		
		return JSON.toJSONString(msg);
	}
	
	/**
	 * 
	 * 组件模版预览
	 * 
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(int hometemplatesid,String roleid,ModelMap modelmap){
		
		XmHometemplates hometemplates = this.xmHometemplatesService.getById(hometemplatesid);
		modelmap.addAttribute("hometemplates",hometemplates);
		
		List<XmHomestuff> stuffs = this.xmHomestuffService.getStuffByRole(roleid);
		modelmap.addAttribute("stuffs",stuffs);
		return "hometemplates/view";
	}
	
	
	/**
	 * 用户组件模版修改的查询信息
	 * 
	 * @param hometemplatesid 组件模版ID
	 * @return
	 */
	@RequestMapping(value = "/getHometemplates", method = RequestMethod.GET)
	@ResponseBody
	public String getHometemplates(int hometemplatesid){
		XmHometemplates hometemplates = this.xmHometemplatesService.getById(hometemplatesid);
		List<XmHomestuff> homestuffs = this.xmHomestuffService.getByStuffId(hometemplatesid);
		List<XmHometemplatesrole> templatesrole = this.xmHometemplatesroleService.getByHometemplatesid(hometemplatesid);
		List<XmRole> relroles = this.xmRoleService.getTemplatesRelRole(hometemplatesid);
		
		//重新组织ROLE
		for(int i=0;i<relroles.size();i++){
			relroles.get(i).setRelTemplate(setRel(relroles.get(i), templatesrole));
		}
		
		Hometemplates templates = new Hometemplates();
		templates.setHomestuffs(homestuffs);
		templates.setRelRoles(relroles);
		templates.setHometemplatesroles(templatesrole);
		templates.setXmHometemplates(hometemplates);
		
		return JSON.toJSONString(templates);
	}
	
	public Boolean setRel(XmRole role,List<XmHometemplatesrole> templaterole){
		Boolean rel = false;
		for(int i=0;i<templaterole.size();i++){
			if(role.getRoleid().equals(templaterole.get(i).getRoleid())){
				rel = true;
				break;
			}
		}
		return rel;
	}
	
	/**
	 * 得到组件模版的组件
	 * 
	 * @param hometemplatesid
	 * @return
	 */
	@RequestMapping(value = "/getStuff", method = RequestMethod.POST)
	@ResponseBody
	public String getStuff(int hometemplatesid){
		List<XmHomestuff> stuffs = this.xmHomestuffService.getByStuffId(hometemplatesid);
		ListBean bean = new ListBean();
		bean.setRows(stuffs);
		bean.setTotal(stuffs.size());
		return JSON.toJSONString(bean);
	}
	
	@RequestMapping(value = "/changeStuffOrder", method = RequestMethod.POST)
	@ResponseBody
	public String changeStuffOrder(String changerows){
		
		Message msg = new Message();
		
		List<XmHomestuff> stuffs = JsonUtil.getList4Json(changerows, XmHomestuff.class);
		if(stuffs.size()>0){
			
			for(int i=0;i<stuffs.size();i++){
				this.xmHomestuffService.changeSeq(stuffs.get(i));
			}
			
			msg.setType(true);
			msg.setMessage("序列修改成功！");
		}else{
			msg.setType(false);
			msg.setMessage("没有改变的行！");
		}
		
		return JSON.toJSONString(msg);
	}
	
	
}
