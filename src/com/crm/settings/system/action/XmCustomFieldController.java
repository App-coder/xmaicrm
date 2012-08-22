package com.crm.settings.system.action;

import java.util.List;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.bean.crm.Message;
import com.crm.model.XmField;
import com.crm.settings.system.service.XmCustomFieldService;


/**
 * 系统设置-自定义字段
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:36:23
 */
@Controller
@RequestMapping(value = "settings/customfield")
public class XmCustomFieldController extends BaseController {
	
	@Autowired
	XmCustomFieldService xmCustomFieldService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/customfield";
	}
	
	
	@RequestMapping(value="/getFieldsByTabid",method=RequestMethod.POST)
	@ResponseBody
	public String getFieldsByTabid(ModelMap modelMap,int tabid,int page,int rows){
		List<XmField> list=this.xmCustomFieldService.getFieldsByTabid(tabid, page, rows);
		return arrayToJson(list);
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	@ResponseBody
	public String execute(ModelMap modelMap,String action,String queryParams){
		int affectrows  = 0;
		if(action.equals("add"))
			affectrows=this.xmCustomFieldService.insertCustomField(queryParams);
		/*else if(action.equals("update"))
			affectrows=this.xmCustomBlockService.updateByPrimaryKey(xmBlocks);
		else 
			affectrows=this.xmCustomBlockService.deleteByPrimaryKey(blockid);*/
		
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("编辑成功！");
			msg.setType(true);
		}else{
			msg.setMessage("编辑时发生异常！");
			msg.setType(false);
		}
		return objToJson(msg);
	}
	
	
	
	

}
