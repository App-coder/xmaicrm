package com.crm.thread;

import com.crm.util.CacheUtil;
import com.crm.util.Constant;
import com.crm.util.LogUtil;

public class CacheThread extends Thread {
	
	
	public void clearCache(){
		//刷新缓存，每小时刷新一次。
		CacheUtil.removeCache(Constant.USERPERMISSION);
		LogUtil.logger.info("系统清理缓存");
	}
	
	public void run() {
		while(true){
			this.clearCache();
			try {
				this.sleep(1000*60*60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
