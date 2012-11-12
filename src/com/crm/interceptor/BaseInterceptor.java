package com.crm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.crm.util.Constant;


public class BaseInterceptor implements HandlerInterceptor {
	


	// preHandle()方法在业务处理器处理请求之前被调用  
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		String servletpath = request.getServletPath();
		if(request.getSession().getAttribute(Constant.USERPERMISSION)!=null){
			if(servletpath.equals("/crm/welcome/index")||servletpath.equals("/crm/welcome/login")){
				response.sendRedirect("crm/module/home/index");
			}
			return true;
		}else{
			servletpath = request.getServletPath();
			if(servletpath.equals("/crm/welcome/index")||servletpath.equals("/crm/welcome/login")){
				return true;
			}
			request.getRequestDispatcher("/index.jsp").forward(request, response);  
			return false;
		}
	}
	
	// afterCompletion()方法在DispatcherServlet完全处理完请求后被调用  
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception e)
			throws Exception {
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj, ModelAndView mav) throws Exception {
	}
	
}
