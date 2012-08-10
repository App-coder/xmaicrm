package com.crm.potentials.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.model.XmCustomview;
import com.crm.model.XmCvcolumnlist;
import com.crm.model.XmPotential;
import com.crm.service.XmCustomViewService;
import com.crm.service.XmCvcolumnlistService;

@Controller
@RequestMapping(value = "potential")
public class XmPotentialController {
	
	XmCustomViewService xmCustomViewService;
	@Resource(name="xmCustomViewService")
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}
	
	XmCvcolumnlistService xmCvcolumnlistService;
	@Resource(name="xmCvcolumnlistService")
	public void setXmCvcolumnlistService(XmCvcolumnlistService xmCvcolumnlistService) {
		this.xmCvcolumnlistService = xmCvcolumnlistService;
	}



	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		List<XmCustomview> views = this.xmCustomViewService.queryByEntityType("Potentials");
		modelMap.addAttribute("views",views);
		
		//取默认的view
		int viewid = this.xmCustomViewService.getDefault("Potentials");
		
		List<XmCvcolumnlist> columns = this.xmCvcolumnlistService.getXmCvcolumnlistByCvid(viewid);
		
		return "potential/index";
	}
	
}
