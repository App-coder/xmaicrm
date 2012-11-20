package com.crm.action.cache;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.service.system.CacheDataService;

@Controller
@RequestMapping(value = "crm/cache")
public class CacheController {
	
	CacheDataService cacheDataService;
	@Resource(name = "cacheDataService")
	public void setCacheDataService(CacheDataService cacheDataService) {
		this.cacheDataService = cacheDataService;
	}

	@RequestMapping(value = "/initCache", method = RequestMethod.GET)
	@ResponseBody
	public String initCache(){
		// 初始化系统缓存
		this.cacheDataService.initData();
		return "true";
	}
	
}
