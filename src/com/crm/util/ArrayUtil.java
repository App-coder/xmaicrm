package com.crm.util;

import java.util.List;

public class ArrayUtil {
	
	public static String arrayToJoinStr(List<Object> objs,String join,boolean isint){
		StringBuffer sb = new StringBuffer();
		if(isint){
			for(int i=0;i<objs.size();i++){
				if(i==0){
					sb.append(objs.get(i).toString());	
				}else{
					sb.append(",");	
					sb.append(objs.get(i).toString());	
				}
			}	
		}else{
			for(int i=0;i<objs.size();i++){
				if(i==0){
					sb.append(objs.get(i).toString());	
				}else{
					sb.append(",");	
					sb.append(objs.get(i).toString());	
				}
			}
		}
		return sb.toString();
	}
	
	
	
}
