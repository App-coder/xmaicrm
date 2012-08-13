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
					sb.append("'");
					sb.append(objs.get(i).toString());	
					sb.append("'");
				}else{
					sb.append(",");	
					sb.append("'");
					sb.append(objs.get(i).toString());
					sb.append("'");
				}
			}
		}
		return sb.toString();
	}
	
	public static  String arrayToJoinStr(String[] objs){
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<objs.length;i++){
			if(i==0){
				sb.append("'");
				sb.append(objs[i]);
				sb.append("'");
			}else{
				sb.append(",");	
				sb.append("'");
				sb.append(objs[i]);
				sb.append("'");
			};
		}
		
		return sb.toString();
	}
	
	
}
