package com.crm.potentials.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.model.XmPotential;

@Controller
@RequestMapping(value = "potential")
public class XmPotentialController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(int page,int rows,int viewid,XmPotential potential){
		
		
		
		return "potential/index";
	}
	
}
