package com.crm.util;

import java.util.List;

import com.crm.model.XmBlocks;
import com.crm.model.XmField;


public class HtmlUtil {
	public static String getMultSelect(List<XmBlocks> blocks,List<List<XmField>> fieldslist){
		StringBuffer multSelectStr = new StringBuffer();
		multSelectStr.append("<option value=''>无</option>");
		if(blocks.size()>=1){
			for(int i=0;i<blocks.size();i++){
				multSelectStr.append("<optgroup  label=\""+blocks.get(i).getBlocklabel()+"\">");
				for(int j=0;j<fieldslist.get(i).size();j++){
					multSelectStr.append("<option value='{\"field\":\""+fieldslist.get(i).get(j).getFieldname()+"\",\"resizable\":false,\"title\":\""+fieldslist.get(i).get(j).getColumnname()+"\"}' >"+fieldslist.get(i).get(j).getFieldlabel()+"</option>");
				}
				multSelectStr.append("</optgroup>");
			}
		}
		
		return multSelectStr.toString();
	}
	
	public static String getCollectSelect(List<XmBlocks> blocks,List<List<XmField>> fieldslist){
		StringBuffer collectSelectStr = new StringBuffer();
		collectSelectStr.append("<option value=''>无</option>");
		if(blocks.size()>=1){
			for(int i=0;i<blocks.size();i++){
				boolean exist = false;
				
				for(int j=0;j<fieldslist.get(i).size();j++){
					if(fieldslist.get(i).get(j).getTypeofdata().equalsIgnoreCase("N~O")){
						if(exist == false){
							collectSelectStr.append("<optgroup label=\""+blocks.get(i).getBlocklabel()+"\">");
						}
						exist = true;
						collectSelectStr.append("<option value='{\"field\":\""+fieldslist.get(i).get(j).getFieldname()+"\",\"resizable\":false,\"title\":\""+fieldslist.get(i).get(j).getColumnname()+"\"}' >"+fieldslist.get(i).get(j).getFieldlabel()+"</option>");
					}
				}
				if(exist==true){
					collectSelectStr.append("</optgroup>");
				}
			}
		}
		return collectSelectStr.toString();
	}
	
	public static String getSearchFields(List<XmField> fieldslist){
		StringBuffer searchFields = new StringBuffer();
		for(int i=0;i<fieldslist.size();i++){
			searchFields.append("<option value='{\"field\":\""+fieldslist.get(i).getFieldname()+"\",\"resizable\":false,\"title\":\""+fieldslist.get(i).getColumnname()+"\"}'>"+fieldslist.get(i).getTablabel()+"-"+fieldslist.get(i).getFieldlabel()+"</option>");
		}
		return searchFields.toString();
	}
	
	public static String getFilter(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("<option value=\"\">无</option>");
		stringBuffer.append("<option value=\"e\">等于</option>");
		stringBuffer.append("<option value=\"n\">不等于</option>");
		stringBuffer.append("<option value=\"s\">开始为</option>");
		stringBuffer.append("<option value=\"c\">包含</option>");
		stringBuffer.append("<option value=\"k\">不包含</option>");
		stringBuffer.append("<option value=\"l\">小于</option>");
		stringBuffer.append("<option value=\"g\">大于</option>");
		stringBuffer.append("<option value=\"m\">小于等于</option>");
		stringBuffer.append("<option value=\"h\">大于等于</option>");
		return stringBuffer.toString();
	}
	
}
