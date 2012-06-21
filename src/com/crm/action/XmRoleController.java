package com.crm.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.bean.easyui.Combobox;
import com.crm.model.XmRole;
import com.crm.service.module.XmRoleService;

@Controller
@RequestMapping(value = "crm/role")
public class XmRoleController extends BaseController {
	
	XmRoleService xmRoleService;
	@Resource(name="com.crm.service.module.impl.xmRoleService")
	public void setXmRoleService(XmRoleService xmRoleService) {
		this.xmRoleService = xmRoleService;
	}


	@RequestMapping(value = "/getroles", method = RequestMethod.GET)
	@ResponseBody
	public String getroles(){
		List<XmRole> roles = this.xmRoleService.loadAll();
		List<Combobox> cbos = new ArrayList<Combobox>();
		if(roles.size()>=1){
			for(int i=0;i<roles.size();i++){
				Combobox cbo = new Combobox();
				cbo.setId(roles.get(i).getRoleid());
				cbo.setText(roles.get(i).getRolename());
				cbos.add(cbo);
			}
		}
		return arrayToJson(cbos);
	}
	
}
