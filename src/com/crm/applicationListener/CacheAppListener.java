package com.crm.applicationListener;

import javax.annotation.Resource;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.crm.service.system.CacheDataService;
@Component
public class CacheAppListener implements ApplicationListener {

	CacheDataService cacheDataService;
	@Resource(name = "cacheDataService")
	public void setCacheDataService(CacheDataService cacheDataService) {
		this.cacheDataService = cacheDataService;
	}
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		this.cacheDataService.initData();
	}
	
}
