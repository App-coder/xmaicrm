package com.crm.interceptor;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.Log4jConfigListener;

import com.crm.model.XmEntityname;
import com.crm.model.XmTab;
import com.crm.service.XmEntitynameService;
import com.crm.service.XmTabService;
import com.crm.util.CacheManager;
import com.crm.util.Constant;

public class BaseInterceptor implements HandlerInterceptor {
	
	XmEntitynameService xmEntitynameService;
	@Resource(name="xmEntitynameService")
	public void setXmEntitynameService(XmEntitynameService xmEntitynameService) {
		this.xmEntitynameService = xmEntitynameService;
	}
	
	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}
	// preHandle()方法在业务处理器处理请求之前被调用  
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {

		if(CacheManager.getFromCache(Constant.ENTITYNAME) == null){
			HashMap<String,XmEntityname> hmentityname = new HashMap<String,XmEntityname>();
			HashMap<String,XmEntityname> hmbyid = new HashMap<String,XmEntityname>();
			List<XmEntityname> ens = this.xmEntitynameService.getEntityname();
			for(int i=0;i<ens.size();i++){
				hmentityname.put(ens.get(i).getModulename().toLowerCase(), ens.get(i));
				hmbyid.put(ens.get(i).getEntityidfield(), ens.get(i));
			}
			CacheManager.putInCache(Constant.TABBYEID, hmbyid);
			CacheManager.putInCache(Constant.ENTITYNAME, hmentityname);
		}
		
		if(CacheManager.getFromCache(Constant.TAB) == null){
			HashMap<String,XmTab> hmentityname = new HashMap<String,XmTab>();
			HashMap<String,XmTab> hmlabtabs = new HashMap<String,XmTab>();
			List<XmTab> tabs = this.xmTabService.getAll();
			for(int i=0;i<tabs.size();i++){
				hmentityname.put(tabs.get(i).getName().toLowerCase(), tabs.get(i));
				hmlabtabs.put(tabs.get(i).getTablabel().toLowerCase(), tabs.get(i));
			}
			CacheManager.putInCache(Constant.TAB, hmentityname);
			CacheManager.putInCache(Constant.TABBYLAB, hmlabtabs);
		}

		//Logger.getLogger("").info("ttt");
		return true;
	}
	
	// afterCompletion()方法在DispatcherServlet完全处理完请求后被调用  
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj1, Exception e)
			throws Exception {
		
		
	}
	// postHandle()方法在业务处理器处理请求之后被调用  
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj, ModelAndView mod) throws Exception {
		
	}



}
