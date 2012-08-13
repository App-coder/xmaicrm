package com.crm.action.settings.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.easyui.Column;
import com.crm.model.XmField;
import com.crm.model.XmTab;
import com.crm.service.XmFieldService;
import com.crm.service.XmTabService;
import com.crm.util.ArrayUtil;
import com.crm.util.CacheManager;
import com.crm.util.Constant;
import com.crm.util.crm.RecyclebinUtil;
/**
 * 
 * 其他设置-回收站
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:54:14
 */
@Controller
@RequestMapping(value = "crm/settings/recyclebin")
public class XmRecyclebinController extends BaseController {
	
	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}

	XmFieldService xmFieldService;
	@Resource(name="xmFieldService")
	public void setXmFieldService(XmFieldService xmFieldService) {
		this.xmFieldService = xmFieldService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		String[] skip_modules = new  String[]{ "Users", "Events", "Calendar", "Downloads", "Dashboard", "Home", "Webmails", "Recyclebin", "Rss", "Portal", "Reports", "Workflows", "Maillists", "Qunfas", "Messages", "Emails", "Leads", "Balances", "Funnels", "Prdtnums", "Bsteps", "Fsteps", "Isteps", "Ssteps", "Catalogs", "Ureports", "Performances", "Inboundsearchs", "Integradedreports" };
		List skipids = new ArrayList();
		
		
		HashMap<String, XmTab> tabOfName =(HashMap<String, XmTab>) CacheManager.getFromCache(Constant.TAB);
		for(int i=0;i<skip_modules.length;i++){
			if(tabOfName.get(skip_modules[i].toLowerCase())!=null){
				skipids.add(tabOfName.get(skip_modules[i].toLowerCase()).getTabid());
			}
		}
		
		String skipstr = ArrayUtil.arrayToJoinStr(skipids, ",", true);
		List<XmTab> recyclemodules = this.xmTabService.getRecyclebinModule(skipstr);
		modelMap.addAttribute("recyclemodules",recyclemodules);
		
		//默认的第一个columns的集合
		String[] columns = RecyclebinUtil.getListColumn(recyclemodules.get(0).getName());
		
		List<XmField> fields = this.xmFieldService.getRecycleBinFields(recyclemodules.get(0).getTabid(),columns);
		
		List<Column> cols = new ArrayList<Column>();
		for(int i=0;i<fields.size();i++){
			Column col = new Column();
			col.setField(fields.get(i).getColumnname());
			col.setTitle(fields.get(i).getFieldlabel());
			cols.add(col);
		}
		modelMap.addAttribute("cols",JSON.toJSON(cols));
		
		return "settings/other/recyclebin";
	}
	
}
