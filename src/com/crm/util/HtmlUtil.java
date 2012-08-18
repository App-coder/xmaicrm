package com.crm.util;

import java.util.List;

import com.crm.model.XmBlocks;
import com.crm.model.XmField;

public class HtmlUtil {
	public static String getMultSelect(List<XmBlocks> blocks,
			List<List<XmField>> fieldslist, String entitytype) {
		StringBuffer multSelectStr = new StringBuffer();
		multSelectStr.append("<option value=''>无</option>");
		if (blocks.size() >= 1) {
			for (int i = 0; i < blocks.size(); i++) {
				multSelectStr.append("<optgroup  label=\""
						+ blocks.get(i).getBlocklabel() + "\">");
				/*
				 * $columnlist = Array ($fieldlabel =>
				 * '$fieldtablename:$fieldcolname:$fieldname:$module_$fieldlabel1:$fieldtypeofdata',
				 * $fieldlabel1 =>
				 * '$fieldtablename1:$fieldcolname1:$fieldname1:$module_$fieldlabel11:$fieldtypeofdata1',
				 * | $fieldlabeln =>
				 * '$fieldtablenamen:$fieldcolnamen:$fieldnamen:$module_$fieldlabel1n:$fieldtypeofdatan')
				 * 
				 * 用于EASYUI展示 title field resizable
				 * 
				 * 用于数据后台获取处理 fromtab fromid jointab joinid type
				 */
				for (int j = 0; j < fieldslist.get(i).size(); j++) {
					// multSelectStr.append("<option value='{\"field\":\""+fieldslist.get(i).get(j).getFieldname()+"\",\"resizable\":false,\"title\":\""+fieldslist.get(i).get(j).getFieldlabel()+"\",\"table\":\""+fieldslist.get(i).get(j).getTablename()+"\",\"column\":\""+fieldslist.get(i).get(j).getColumnname()+"\",\"type\":\""+fieldslist.get(i).get(j).getTypeofdata()+"\"}' >"+fieldslist.get(i).get(j).getFieldlabel()+"</option>");
					multSelectStr.append("<option fid='"
							+ fieldslist.get(i).get(j).getFieldid()
							+ "' value='{" + "\"title\":\""
							+ fieldslist.get(i).get(j).getFieldlabel() + "\","
							+ "\"field\":\""
							+ fieldslist.get(i).get(j).getFieldname() + "\","
							+ "\"resizable\":false," + "\"fieldtabname\":\""
							+ fieldslist.get(i).get(j).getTablename() + "\","
							+ "\"fieldcolname\":\""
							+ fieldslist.get(i).get(j).getColumnname() + "\","
							+ "\"fieldname\":\""
							+ fieldslist.get(i).get(j).getFieldname() + "\","
							+ "\"entitytype\":\"" + entitytype + "\","
							+ "\"fieldlabel\":\""
							+ fieldslist.get(i).get(j).getFieldlabel() + "\","
							+ "\"fieldtypeofdata\":\""
							+ fieldslist.get(i).get(j).getTypeofdata() + "\""
							+ "}' >" + fieldslist.get(i).get(j).getFieldlabel()
							+ "</option>");
				}
				multSelectStr.append("</optgroup>");
			}
		}

		return multSelectStr.toString();
	}

	public static String getCollectSelect(List<XmBlocks> blocks,
			List<List<XmField>> fieldslist, String entitytype) {
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
						collectSelectStr.append("<option fid='"
								+ fieldslist.get(i).get(j).getFieldid()
								+ "' value='{" + "\"title\":\""
								+ fieldslist.get(i).get(j).getFieldlabel()
								+ "\"," + "\"field\":\""
								+ fieldslist.get(i).get(j).getFieldname()
								+ "\"," + "\"resizable\":false,"
								+ "\"fieldtabname\":\""
								+ fieldslist.get(i).get(j).getTablename()
								+ "\"," + "\"fieldcolname\":\""
								+ fieldslist.get(i).get(j).getColumnname()
								+ "\"," + "\"fieldname\":\""
								+ fieldslist.get(i).get(j).getFieldname()
								+ "\"," + "\"entitytype\":\"" + entitytype
								+ "\"," + "\"fieldlabel\":\""
								+ fieldslist.get(i).get(j).getFieldlabel()
								+ "\"," + "\"fieldtypeofdata\":\""
								+ fieldslist.get(i).get(j).getTypeofdata()
								+ "\"" + "}' >"
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

	public static String setColor(int index, int mo) {
		String[] colors = new String[]{"#FF0F00", "#FF6600", "#FF9E01",
				"#FCD202", "#F8FF01", "#B0DE09", "#04D215", "#0D8ECF", "#0D52D1", "#2A0CD0", "#8A0CCF", "#CD0D74",
				"#754DEB", "#DDDDDD", "#999999", "#333333", "#000000"};
		int color_index = colors.length + index;
		return colors[color_index % mo];
	}
	
	/**
	 * @return 用户编辑->用户状态的options
	 */
	public static String getUserStatus(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("<option value=\"Active\">激活</option>");
		stringBuffer.append("<option value=\"Inactive\">禁止</option>");
		return stringBuffer.toString();
	}
	
	/**
	 * @return 状态->激活，禁止
	 */
	public static String getActiveStatus(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("<option value=\"Active\">Active</option>");
		stringBuffer.append("<option value=\"Inactive\">Inactive</option>");
		return stringBuffer.toString();
	}

}
