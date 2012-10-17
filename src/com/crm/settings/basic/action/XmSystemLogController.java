package com.crm.settings.basic.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;

import com.alibaba.fastjson.JSON;
import com.crm.action.tools.file.LastModifiedComprator;
import com.crm.bean.easyui.ListBean;

@Controller
@RequestMapping(value = "settings/systemlog")
public class XmSystemLogController implements ServletContextAware {

	private ServletContext servletContext;
	public void setServletContext(ServletContext servletContext) { // 实现接口中的setServletContext方法
		this.servletContext = servletContext;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		return "settings/basic/systemlog";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list() {
		String logpath = this.servletContext.getRealPath("WEB-INF/logs");
		File folder = new File(logpath);
		File[] fs = folder.listFiles();
		Arrays.sort(fs, new LastModifiedComprator());
		List<Object> logs = new ArrayList<Object>();
		ListBean bean = new ListBean();
		for (int i = fs.length-1; i >= 0; i--) {
			HashMap<String,Object> filedesc = new HashMap<String, Object>();
			filedesc.put("filename", fs[i].getName());
			filedesc.put("filemodified", new Date(fs[i].lastModified()));
			logs.add(filedesc);
		}
		bean.setRows(logs);
		bean.setTotal(logs.size());
		return JSON.toJSONStringWithDateFormat(bean, "yyyy-MM-dd");
	}

}
