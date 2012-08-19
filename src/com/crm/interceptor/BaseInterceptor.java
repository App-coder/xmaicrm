package com.crm.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.crm.service.system.CacheDataService;
import com.crm.util.Constant;


public class BaseInterceptor implements HandlerInterceptor {
	
	CacheDataService cacheDataService;
	@Resource(name="cacheDataService")
	public void setCacheDataService(CacheDataService cacheDataService) {
		this.cacheDataService = cacheDataService;
	}

	// preHandle()方法在业务处理器处理请求之前被调用  
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		if(request.getSession().getAttribute(Constant.USER)!=null){
			this.cacheDataService.initData();
			return true;
		}else{
			String servletpath = request.getServletPath();
			if(servletpath.equals("/crm/welcome/index")||servletpath.equals("/crm/welcome/login")){
				return true;
			}
			
			request.getRequestDispatcher("/index.jsp").forward(request, response);  
			return true;
		}
	}
	
	// afterCompletion()方法在DispatcherServlet完全处理完请求后被调用  
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
	}
	
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}
	
}
