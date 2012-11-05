package com.crm.util;

import java.util.HashMap;
import java.util.List;

import com.crm.model.XmBlocks;
import com.crm.model.XmEntityname;
import com.crm.model.XmField;
import com.crm.model.XmPicklist;
import com.crm.model.XmUsers;
import com.crm.service.XmPicklistService;
import com.crm.service.settings.basic.XmUsersService;

/**
 * User: zhujun
 * Date: 2012-8-2
 * Time: 下午11:17:59
 */
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

	public static String getFieldHtml(String columnname, String typeofdata) {
		
		String[] tds = typeofdata.split("~");
		String htmlstr = "";
		
		if(tds[0].equals("C")){
			htmlstr = "<input type=\"checkbox\" class=\"text2\" name=\""+columnname+"\"/>";
		}else if(tds[0].equals("D")){
			htmlstr = "<input type=\"text\" name=\""+columnname+"\" class=\"easyui-datebox text2\" />";
		}else if(tds[0].equals("DT")){
			htmlstr = "<input type=\"text\" class=\"easyui-datetimebox text2\" name=\""+columnname+"\"   >";
		}else if(tds[0].equals("E")){
			htmlstr = "<input type=\"text\" name=\""+columnname+"\"   >";
		}else if(tds[0].equals("I")){
			htmlstr = "<input type=\"text\" class=\"easyui-numberbox text2\" name=\""+columnname+"\"  data-options=\"precision:0\"  >";
		}else if(tds[0].equals("N")){
			String limit = "";
			String precision = "";
			if(tds.length>2){
				String[] numlimit = tds[2].split(",");
				int max = Integer.parseInt(numlimit[0]);
				for(int i=0;i<max;i++){
					limit +="9";
				}
				precision = numlimit[1];
			}
			if(limit!=""&&precision!=""){
				htmlstr = "<input type=\"text\" class=\"easyui-numberbox text2\" name=\""+columnname+"\"  data-options=\"max:"+limit+",precision:"+precision+"\"  >";
			}else{
				htmlstr = "<input type=\"text\" class=\"easyui-numberbox text2\" name=\""+columnname+"\"   >";
			}
		}else if(tds[0].equals("NN")){
			//负数
			htmlstr = "<input type=\"text\" class=\"easyui-numberbox text2\" name=\""+columnname+"\"  data-options=\"max:0\"  >";
		}else if(tds[0].equals("P")){
			htmlstr = "<input type=\"password\" class=\"text2\" name=\""+columnname+"\"    >";
		}else if(tds[0].equals("T")){
			htmlstr = "<input name=\""+columnname+"\" class=\"easyui-timespinner \" data-options=\"showSeconds:true\" ></input>";
		}else if(tds[0].equals("V")){
			htmlstr = "<input type=\"text\" name=\""+columnname+"\" class=\"text2\" />";
		}
		
		return htmlstr;
	}

	public static String getFieldHtml(XmField xmField,XmPicklistService xmPicklistService,XmUsersService xmUsersService) {
		String fieldstr = "";
		String uitype = xmField.getUitype();
		String[] tds = xmField.getTypeofdata().split("~");
		
		if(uitype.equals("1")){
			fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"text2 easyui-validatebox\" />";
		}else if(uitype.equals("2")){
			if(tds[1].equals("M")){
				fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-validatebox text2\" data-options=\"required:true\" /><span class=\"must\">*</span>";
			}else{
				fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-validatebox text2\"  />";
			}
		}else if(uitype.equals("15")){
			List<XmPicklist> picks = xmPicklistService.getPicks(xmField.getFieldname());
			fieldstr +=getSelectHtml(xmField,picks,tds);
		}else if(uitype.equals("5")){
			if(tds[1].equals("M")){
				fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-datebox text2\" class=\"easyui-validatebox text2\" data-options=\"required:true\" /><span class=\"must\">*</span>";	
			}else{
				fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-datebox text2\" />";
			}
			
		}else if(uitype.equals("53")){
			List<XmUsers> users = xmUsersService.getOptionsUser();
			fieldstr += getUserSelect(xmField,users,tds);
		}else if(uitype.equals("59")){
			HashMap<String, XmEntityname> hm_noline = (HashMap<String, XmEntityname>)CacheManager.getFromCache(Constant.ENTITYNAME_NOLINE);
			XmEntityname et = hm_noline.get(xmField.getFieldname().replace("_", ""));
			//关联可选的字段
			fieldstr +="<input type=\"hidden\" name=\""+xmField.getColumnname()+"\" class=\"text2\"  />";
			fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"_text\" class=\"text2\" readonly=\"readonly\" />";
			fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"查询\" data-options=\"iconCls:'icon-search'\" href=\"javascript:showOptionPanel('"+et.getModulename()+"','"+xmField.getColumnname()+"','"+xmField.getFieldlabel()+"')\" ></a>";
			fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"清空\" data-options=\"iconCls:'icon-clear'\" ></a>";
		}else if(uitype.equals("9")){
			fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"text2 easyui-numberbox\" data-options=\"min:0,precision:2\" />";
		}else if(uitype.equals("19")){
			fieldstr +="<textarea name=\""+xmField.getColumnname()+"\" ></textarea>";
		}
		
		return fieldstr;
	}
	
	/**
	 * 
	 * 根据PICKLIST设置成select
	 * 
	 * @param xmField
	 * @param objs
	 * @param tds 
	 * @return
	 */
	public static String getSelectHtml(XmField xmField,List<XmPicklist> objs, String[] tds){
		StringBuffer sb = new StringBuffer();
		sb.append("<select name=\""+xmField.getColumnname()+"\" >");
		for(int i=0;i<objs.size();i++){
			sb.append("<option>"+objs.get(i).getColvalue()+"</option>");
		}
		sb.append("</select>");
		if(tds[1].equals("M")){
			sb.append("<span class=\"must\">*</span>");
		}
		return sb.toString();
	}
	
	
	/**
	 * 用户信息的select
	 * 
	 * @param xmField
	 * @param users
	 * @return
	 */
	public static String getUserSelect(XmField xmField,List<XmUsers> users, String[] tds){
		StringBuffer sb = new StringBuffer();
		sb.append("<select name=\""+xmField.getColumnname()+"\" >");
		for(int i=0;i<users.size();i++){
			sb.append("<option value=\""+users.get(i).getId()+"\">"+users.get(i).getUserName()+"</option>");
		}
		sb.append("</select>");
		if(tds[1].equals("M")){
			sb.append("<span class=\"must\">*</span>");
		}
		return sb.toString();
	}
	

}
