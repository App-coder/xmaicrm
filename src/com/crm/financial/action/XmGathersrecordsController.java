package com.crm.financial.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCharges;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;
/**
 * 
 * 收款单控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午3:02:06
 */
@Controller
@RequestMapping(value = "gathersrecords")
public class XmGathersrecordsController extends BaseController {

}
