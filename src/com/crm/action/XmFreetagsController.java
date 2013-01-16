package com.crm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.Message;
import com.crm.model.XmFreetags;
import com.crm.service.XmFreetagsService;

/**
 * 
 * 标签控制器
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 下午8:20:40
 */
@Controller
@RequestMapping(value = "crm/freetags")
public class XmFreetagsController {
	
	XmFreetagsService xmFreetagsService;
	@Resource(name="xmFreetagsService")
	public void setXmFreetagsService(XmFreetagsService xmFreetagsService) {
		this.xmFreetagsService = xmFreetagsService;
	}


	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String add(String tag,String module,Integer objectid){
		
		int tagid = this.xmFreetagsService.add(tag,module,objectid);
		
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage(tagid+"");
		return JSON.toJSONString(msg);
	}
	
	@RequestMapping(value = "/loadlist", method = RequestMethod.GET)
	@ResponseBody
	public String loadlist(int recordid,String module){
		
		List<XmFreetags> freetags = this.xmFreetagsService.getModuleTags(module,recordid); 
		
		return JSON.toJSONString(freetags);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	public String delete(int id){
		
		Message msg = new Message();
		boolean res = this.xmFreetagsService.deleteById(id);
		if(res){
			msg.setType(true);
			msg.setMessage("删除成功！");
		}else{
			msg.setType(false);
			msg.setMessage("删除异常！");
		}
		return JSON.toJSONString(msg);
	}
	
	
	
}
