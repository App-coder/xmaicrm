package com.crm.action.portlets;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.ServletContextAware;

import com.crm.bean.crm.UserPermission;
import com.crm.util.Constant;
import com.crm.util.FileUtil;

@Controller
@RequestMapping(value = "crm/portlets/note_pad")
@SessionAttributes({Constant.USERPERMISSION})
public class NotePadController implements ServletContextAware {

	private ServletContext servletContext;
	public void setServletContext(ServletContext servletContext) { // 实现接口中的setServletContext方法
		this.servletContext = servletContext;
	}
	
	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/notepad";
	}
	
	@RequestMapping(value = "/getNote",method= RequestMethod.POST)
	@ResponseBody
	public String getNote(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission) throws IOException{
		
		String filepath = this.servletContext.getRealPath("note/"+userPermission.getUser().getId()+".txt");
		
		return FileUtil.getString(filepath);
	}
	
	@RequestMapping(value = "/saveNote",method= RequestMethod.POST)
	@ResponseBody
	public String saveNote(@RequestParam("note") String note,@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission) throws IOException{
		
		String filepath = this.servletContext.getRealPath("note/"+userPermission.getUser().getId()+".txt");
		FileUtil.writeFile(filepath,note);
		
		return "true";
	}
	
}
