package com.crm.util;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class CacheUtil {
	public static String cachekey;
	public static CacheManager manager = CacheManager.create();
	public static String cachename = "syscache";
	
	public static String getTransform(String key){
		return StringUtil.getBase64(key.getBytes());
	}
	
	public static String getKey(){
		if(cachekey==null){
			StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
			cachekey = stacks[3].getClassName() + "." + stacks[3].getMethodName();
		}
		return cachekey;
	}

	public static void putInCache(String key, Object content) {
		Element element = new Element(key, content);
		Cache cache = manager.getCache(cachename);
		cache.put(element);
	}

	public static Object getFromCache(String cachekey) {
		Cache cache = manager.getCache(cachename);
		Element element = cache.get(cachekey);
		if(element!=null){
			return element.getObjectValue();
		}
		return null;
	}
	
	
	public static void removeCache(String key) {
		Cache cache = manager.getCache(cachename);
		cache.remove(key);
	}


	public static void putKeyCache(String key, Object content) {
		key = getKey() + key;
		key = getTransform(key);
		Cache cache = manager.getCache(cachename);
		Element element = new Element(key, content);
		cache.put(element);
	}
	
	public static void removeKeyCache(String key){
		key = getKey() + key;
		key = getTransform(key);
		Cache cache = manager.getCache(cachename);
		cache.remove(key);
	}

	public static void resetKey(String key, Object object) {
		key = getTransform(key);
		Cache cache = manager.getCache(cachename);
		cache.remove(key);
		Element element = new Element(key, object);
		cache.put(element);
	}
}
