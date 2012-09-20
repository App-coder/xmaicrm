package com.crm.util;

import java.util.List;

import com.crm.model.XmBlocks;
import com.crm.model.XmField;

public class HtmlUtil {
	public static String getMultSelect(List<XmBlocks> blocks,
			List<List<XmField>> fieldslist,String entitytype) {
		StringBuffer multSelectStr = new StringBuffer();
		multSelectStr.append("<option value=''>无</option>");
		if (blocks.size() >= 1) {
			for (int i = 0; i < blocks.size(); i++) {
				multSelectStr.append("<optgroup  label=\""
						+ blocks.get(i).getBlocklabel() + "\">");
				/*
				 * $columnlist = Array ($fieldlabel =>'$fieldtablename:$fieldcolname:$fieldname:$module_$fieldlabel1:$fieldtypeofdata',
				  $fieldlabel1 =>'$fieldtablename1:$fieldcolname1:$fieldname1:$module_$fieldlabel11:$fieldtypeofdata1',
				  |
				  $fieldlabeln =>'$fieldtablenamen:$fieldcolnamen:$fieldnamen:$module_$fieldlabel1n:$fieldtypeofdatan')
				 * 
				 * 用于EASYUI展示 title field resizable
				 * 
				 * 用于数据后台获取处理 fromtab fromid jointab joinid type
				 */
				for (int j = 0; j < fieldslist.get(i).size(); j++) {
					// multSelectStr.append("<option value='{\"field\":\""+fieldslist.get(i).get(j).getFieldname()+"\",\"resizable\":false,\"title\":\""+fieldslist.get(i).get(j).getFieldlabel()+"\",\"table\":\""+fieldslist.get(i).get(j).getTablename()+"\",\"column\":\""+fieldslist.get(i).get(j).getColumnname()+"\",\"type\":\""+fieldslist.get(i).get(j).getTypeofdata()+"\"}' >"+fieldslist.get(i).get(j).getFieldlabel()+"</option>");
					multSelectStr.append("<option value='{"
							+"\"title\":\""+fieldslist.get(i).get(j).getFieldlabel()+"\","
							+"\"field\":\""+fieldslist.get(i).get(j).getFieldname()+"\","
							+"\"resizable\":false,"
							+"\"fieldtabname\":\""+fieldslist.get(i).get(j).getTablename()+"\","
							+"\"fieldcolname\":\""+fieldslist.get(i).get(j).getColumnname()+"\","
							+"\"fieldname\":\""+fieldslist.get(i).get(j).getFieldname()+"\","
							+"\"entitytype\":\""+entitytype+"\","
							+"\"fieldlabel\":\""+fieldslist.get(i).get(j).getFieldlabel()+"\","
							+"\"fieldtypeofdata\":\""+fieldslist.get(i).get(j).getTypeofdata()+"\""
							+"}' >"
							+ fieldslist.get(i).get(j).getFieldlabel()
							+ "</option>");
				}
				multSelectStr.append("</optgroup>");
			}
		}

		return multSelectStr.toString();
	}

	public static String getCollectSelect(List<XmBlocks> blocks,
			List<List<XmField>> fieldslist) {
		StringBuffer collectSelectStr = new StringBuffer();
		collectSelectStr.append("<option value=''>无</option>");
		if (blocks.size() >= 1) {
			for (int i = 0; i < blocks.size(); i++) {
				boolean exist = false;

				for (int j = 0; j < fieldslist.get(i).size(); j++) {
					if (fieldslist.get(i).get(j).getTypeofdata()
							.equalsIgnoreCase("N~O")) {
						if (exist == false) {
							collectSelectStr.append("<optgroup label=\""
									+ blocks.get(i).getBlocklabel() + "\">");
						}
						exist = true;
						collectSelectStr.append("<option value='{\"field\":\""
								+ fieldslist.get(i).get(j).getFieldname()
								+ "\",\"resizable\":false,\"title\":\""
								+ fieldslist.get(i).get(j).getFieldlabel()
								+ "\",\"table\":\""
								+ fieldslist.get(i).get(j).getTablename()
								+ "\",\"column\":\""
								+ fieldslist.get(i).get(j).getColumnname()
								+ "\",\"type\":\""
								+ fieldslist.get(i).get(j).getTypeofdata()
								+ "\"}' >"
								+ fieldslist.get(i).get(j).getFieldlabel()
								+ "</option>");
					}
				}
				if (exist == true) {
					collectSelectStr.append("</optgroup>");
				}
			}
		}
		return collectSelectStr.toString();
	}

	public static String getSearchFields(List<XmField> fieldslist) {
		StringBuffer searchFields = new StringBuffer();
		for (int i = 0; i < fieldslist.size(); i++) {
			searchFields.append("<option value='{\"field\":\""
					+ fieldslist.get(i).getFieldname()
					+ "\",\"resizable\":false,\"title\":\""
					+ fieldslist.get(i).getFieldlabel() + "\",\"table\":\""
					+ fieldslist.get(i).getTablename() + "\",\"column\":\""
					+ fieldslist.get(i).getColumnname() + "\"}'>"
					+ fieldslist.get(i).getTablabel() + "-"
					+ fieldslist.get(i).getFieldlabel() + "</option>");
		}
		return searchFields.toString();
	}

	public static String getFilter() {
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
