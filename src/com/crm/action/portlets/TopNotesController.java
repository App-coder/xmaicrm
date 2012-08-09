package com.crm.action.portlets;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmGathers;
import com.crm.model.XmNotes;
import com.crm.service.portlets.XmNotesService;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;

/**
 * 
 * 最近联系记录
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 上午9:38:58
 */
@Controller
@RequestMapping(value = "crm/portlets/top_notes")
@SessionAttributes(Constant.USERPERMISSION)
public class TopNotesController {
	
	XmNotesService xmNotesService;
	@Resource(name="com.crm.service.portlets.impl.xmNotesService")
	public void setXmNotesService(XmNotesService xmNotesService) {
		this.xmNotesService = xmNotesService;
	}


	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		ListBean bean = new ListBean();
		List<XmNotes> gathers = this.xmNotesService.getTopNotes(userPermission.getUser().getId());
		bean.setRows(gathers);
		bean.setTotal(gathers.size());
		
		String cachestr = JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
		CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		
		return cachestr;
	}
	
}
