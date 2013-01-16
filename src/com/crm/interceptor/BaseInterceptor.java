package com.crm.interceptor;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.crm.bean.crm.UserPermission;
import com.crm.model.XmUsers;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.service.system.CacheDataService;
import com.crm.service.system.UserService;
import com.crm.util.Constant;


public class BaseInterceptor implements HandlerInterceptor {
	
	XmUsersService xmUsersService;
	@Resource(name = "xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}

	UserService userService;
	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	CacheDataService cacheDataService;
	@Resource(name = "cacheDataService")
	public void setCacheDataService(CacheDataService cacheDataService) {
		this.cacheDataService = cacheDataService;
	}

	// preHandle()方法在业务处理器处理请求之前被调用  
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		/*
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
		*/
		if(request.getSession().getAttribute(Constant.USERPERMISSION)==null){
			XmUsers user = new XmUsers();
			user.setUserName("admin");
			user.setUserPassword("admin");
			XmUsers login = this.xmUsersService.validateUser(user);
			//用户的权限得到
			UserPermission userpermission = this.userService.getUserPermission(login);
			userpermission.setUser(login);
			request.getSession().setAttribute(Constant.USERPERMISSION, userpermission);
			// 缓存导航栏
			request.getSession().setAttribute("navbar", this.userService.getNavBar(login,request.getSession().getServletContext().getRealPath("WEB-INF/tpl"),userpermission));
		}else{
			//当用户的登入状态存在时候
			UserPermission userPermission = (UserPermission)request.getSession().getAttribute(Constant.USERPERMISSION);
			if(userPermission.getPingnum()<200){
				userPermission.setPingnum(userPermission.getPingnum()+1);
				request.getSession().setAttribute(Constant.USERPERMISSION, userPermission);
			}else{
				
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.MINUTE, 30);
				
				//设置用户登入的状态
				userPermission.setPingnum(0);
				this.userService.setUserStatus(userPermission.getUser().getId(),"1", calendar.getTime().getTime()/1000+"");
			}
			
		}
		
		return true;
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
