package com.crm.action.settings.system;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.Message;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmParenttab;
import com.crm.model.XmParenttabrel;
import com.crm.model.XmTab;
import com.crm.service.XmTabService;
import com.crm.service.settings.system.XmParenttabService;
import com.crm.service.settings.system.XmParenttabrelService;
import com.crm.service.system.CacheDataService;
import com.crm.util.Constant;
import com.crm.util.JsonUtil;

/**
 * 系统定制-主菜单
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:30:12
 */
@Controller
@RequestMapping(value = "crm/settings/parenttab")
public class XmParenttabController {
	
	XmParenttabService xmParenttabService;
	@Resource(name="xmParenttabService")
	public void setXmParenttabService(XmParenttabService xmParenttabService) {
		this.xmParenttabService = xmParenttabService;
	}
	
	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}
	
	XmParenttabrelService xmParenttabrelService; 
	@Resource(name="xmParenttabrelService")
	public void setXmParenttabrelService(XmParenttabrelService xmParenttabrelService) {
		this.xmParenttabrelService = xmParenttabrelService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/parenttab";
	}
	
	CacheDataService cacheDataService;
	@Resource(name = "cacheDataService")
	public void setCacheDataService(CacheDataService cacheDataService) {
		this.cacheDataService = cacheDataService;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(){
		
		List<XmParenttab> tabs = this.xmParenttabService.getAll();

		ListBean bean = new ListBean();
		bean.setTotal(tabs.size());
		bean.setRows(tabs);
		
		return JSON.toJSONString(bean);
	}
	
	/**
	 * @return 得到TAB的所有部分
	 */
	@RequestMapping(value = "/parenttabList", method = RequestMethod.POST)
	@ResponseBody
	public String parenttabList(ModelMap modelmap){
		
		List<XmTab> alltabs =  this.xmTabService.getParentTabAll();
		
		return JSON.toJSONString(alltabs);
	}
	
	
	/**
	 * 得到已经存在的module
	 * 
	 * @param parenttabid
	 * @return
	 */
	@RequestMapping(value = "/existParenttabList", method = RequestMethod.POST)
	@ResponseBody
	public String existParenttabList(int parenttabid){
		List<XmTab> existTabs = this.xmTabService.existParenttabList(parenttabid);
		if(existTabs.size()>0&&existTabs.get(0)!=null){
			return JSON.toJSONString(existTabs);
		}else{
			return "[]";
		}
	}
	
	/**
	 * 
	 * 得到隐藏的module
	 * 
	 * @param parenttabid
	 * @return
	 */
	@RequestMapping(value = "/hiddenParenttabList", method = RequestMethod.POST)
	@ResponseBody
	public String hiddenParenttabList(int parenttabid){
		
		String existtabids = this.xmTabService.getExistTabids(parenttabid);
		List<XmTab> hiddentabs;
		if(existtabids!=null){
			hiddentabs = this.xmTabService.getHiddenParenttabs(existtabids);
		}else{
			hiddentabs = this.xmTabService.getParentTabAll();
		}
		
		return JSON.toJSONString(hiddentabs);
	}
	
	/**
	 * 根据ID获取，parenttab,主菜单
	 * 
	 * @param id 
	 * @return
	 */
	@RequestMapping(value = "/getParenttab", method = RequestMethod.POST)
	@ResponseBody
	public String getParenttab(int id){
		XmParenttab parenttab = this.xmParenttabService.getParenttab(id);
		return JSON.toJSONString(parenttab);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@ResponseBody
	public String edit(XmParenttab parenttab,String tabrel,HttpServletRequest request){
		int keyid;
		if(parenttab.getParenttabid()==null){
			//添加
			parenttab.setVisible(0);
			keyid = this.xmParenttabService.insertParenttab(parenttab);
			
		}else{
			this.xmParenttabService.update(parenttab);
			//修改
			keyid = parenttab.getParenttabid();
		}
		
		this.xmParenttabrelService.clearRelByParentid(keyid);
		if(tabrel!=null && tabrel!=""){
			//设置rel
			List<XmParenttabrel> rels = JsonUtil.getList4Json(tabrel, XmParenttabrel.class);
			for(int i=0;i<rels.size();i++){
				rels.get(i).setParenttabid(keyid);
				this.xmParenttabrelService.insert(rels.get(i));
			}
		}
		
		this.cacheDataService.initMenuBar();
		
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("主菜单设置成功！");
		return JSON.toJSONString(msg);
	}
	
	
	/**
	 * 
	 * 删除主菜单，清理关联
	 * 
	 * @param parenttabid
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(int parenttabid){
		
		this.xmParenttabService.deleteById(parenttabid);
		this.xmParenttabrelService.clearRelByParentid(parenttabid);
		
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("主菜单编辑成功！");
		
		return JSON.toJSONString(msg);
	}
	
	
}
