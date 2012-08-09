package com.crm.action;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.model.XmField;
import com.crm.service.XmFieldService;

import java.util.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "field")
public class XmFieldController {
	
	
	XmFieldService xmFieldService;
	@Resource(name="xmFieldService")
	public void setXmFieldService(XmFieldService xmFieldService) {
		this.xmFieldService = xmFieldService;
	}


	@RequestMapping(value = "/getReportItems", method = RequestMethod.POST)
	@ResponseBody
	public String getReportItems(int tabid){
		List<XmField> reportitems = xmFieldService.getReportItems(tabid);
		StringBuffer sb = new StringBuffer();
		sb.append("<option value=\"count\" >记录数</option>");
		for(int i=0;i<reportitems.size();i++){
			String fieldtype = reportitems.get(i).getTypeofdata().substring(0,reportitems.get(i).getTypeofdata().indexOf("~"));
			Boolean isid = reportitems.get(i).getColumnname().substring(reportitems.get(i).getColumnname().length()-2).equals("id");
			if(!fieldtype.equals("V") && !isid &&!(fieldtype.equals("D"))){
				if ( !(fieldtype.equals("N")) || !( fieldtype.equals("NN") ) ){
					String item = "{\"fieldlabel\":\""+reportitems.get(i).getFieldlabel()+"\",\"fieldname\":\""+reportitems.get(i).getFieldname()+"\",\"fieldtablename\":\""+reportitems.get(i).getTablename()+"\",\"fieldcolname\":\""+reportitems.get(i).getColumnname()+"\"}";
					sb.append("<option value=\""+item+"\" >"+reportitems.get(i).getFieldlabel()+"</option>");
				}
			}
		}
		return sb.toString();
	}
	
	
	
}
