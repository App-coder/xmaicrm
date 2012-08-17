package com.crm.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crm.model.XmAccount;
import com.crm.model.XmBlocks;
import com.crm.model.XmContactdetails;
import com.crm.model.XmEntityname;
import com.crm.model.XmField;
import com.crm.model.XmPicklist;
import com.crm.model.XmUsers;
import com.crm.service.XmCustomViewService;
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

	public static String getFieldHtml(XmField xmField,XmPicklistService xmPicklistService,XmUsersService xmUsersService, Map obj, XmCustomViewService xmCustomViewService) {
		String fieldstr = "";
		String uitype = xmField.getUitype();
		String[] tds = xmField.getTypeofdata().split("~");
		boolean isrel = xmField.getTypeofdata().indexOf("::") != -1;
		
		//输入框
		if(tds[0].equals("V") && !isrel){
			
			if(xmField.getUitype().equals("53")){
				fieldstr += "<select class=\"easyui-combotree text2 \" id=\"cbo_"+xmField.getColumnname()+"\" name=\""+xmField.getColumnname()+"\" style=\"width:250px;\" data-options=\"url:'crm/relation/users/getSmowners'\"  ></select>";
				fieldstr +="<script>bind_cbo_onBeforeSelect('cbo_"+xmField.getColumnname()+"',"+getMapVal(obj,xmField.getColumnname())+")</script>";
			}else if(xmField.getUitype().equals("19")){
				fieldstr +="<textarea class=\"fullarea\" name=\""+xmField.getColumnname()+"\" >"+getMapVal(obj,xmField.getColumnname())+"</textarea>";
			}else if(xmField.getUitype().equals("15")||xmField.getUitype().equals("16")||xmField.getUitype().equals("111")||xmField.getUitype().equals("33")){
				//使用PICKLIST
				List<XmPicklist> plist = xmPicklistService.getPickListValue(xmField.getFieldname());
				fieldstr +="<select name=\""+xmField.getColumnname()+"\" class=\"text2\" >";
				for(int i=0;i<plist.size();i++){
					fieldstr +="<option value="+plist.get(i).getColvalue()+">"+plist.get(i).getColvalue()+"</option>";
				}
				fieldstr +="</select>";
			}else if(xmField.getTabid().equals("16")&&xmField.getFieldname().equals("salutationtype")){
				//使用PICKLIST
				List<XmPicklist> plist = xmPicklistService.getPickListValue(xmField.getFieldname());
				fieldstr +="<select name=\""+xmField.getColumnname()+"\" class=\"text2\" >";
				for(int i=0;i<plist.size();i++){
					fieldstr +="<option value="+plist.get(i).getColvalue()+">"+plist.get(i).getColvalue()+"</option>";
				}
				fieldstr +="</select>";
			}else if(xmField.getUitype().equals("51")){
				HashMap<String, XmEntityname> hm_noline = (HashMap<String, XmEntityname>)CacheUtil.getFromCache(Constant.ENTITYNAME_NOLINE);
				if(!xmField.getFieldname().equals("activityid")){
					XmEntityname et = hm_noline.get(xmField.getFieldname().replace("_", ""));
					fieldstr +="<input type=\"hidden\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"text2\"  />";
					fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"_text\"  onfocus=\"rendRel(\'"+xmField.getColumnname()+"\',this)\"  class=\"text2\" value=\""+getText(getMapVal(obj,xmField.getColumnname()),et,xmCustomViewService)+"\" readonly=\"readonly\" />";
					fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"查询\" data-options=\"iconCls:'icon-search'\" href=\"javascript:showOptionPanel('"+et.getModulename()+"','"+xmField.getColumnname()+"','"+xmField.getFieldlabel()+"')\" ></a>";
					fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"清空\" data-options=\"iconCls:'icon-clear'\" ></a>";
				}
			}else if(xmField.getUitype().equals("57")){
				//设置Option,设置选中的值
				HashMap<String, XmEntityname> hm_noline = (HashMap<String, XmEntityname>)CacheUtil.getFromCache(Constant.ENTITYNAME_NOLINE);
				XmEntityname et = hm_noline.get(xmField.getFieldname().replace("_", ""));
				
				String mv = getMapVal(obj,xmField.getColumnname());
				if(mv !="" && !mv.equals("0") ){
					int accountid = xmCustomViewService.getAccountByContactid(mv);
					List<XmContactdetails> details = xmCustomViewService.getContactdetailsByAccountid(accountid);
					
					StringBuffer opstr = new StringBuffer();  
					if(details.size()>0){
						for(int i=0;i<details.size();i++){
							if(mv.equals(details.get(i).getContactid())){
								opstr.append("<option value='"+details.get(i).getContactid()+"' selected='selected' >"+details.get(i).getLastname()+"</option>");
							}else{
								opstr.append("<option value='"+details.get(i).getContactid()+"'>"+details.get(i).getLastname()+"</option>");
							}
						}
					}
					
					fieldstr +="<select class=\"text2\"  name=\""+xmField.getColumnname()+"\"  >"+opstr.toString()+"</select>";
				}else{
					fieldstr +="<select class=\"text2\"  name=\""+xmField.getColumnname()+"\"  ></select>";
				}
				
			}else{
				//两个条件的情况
				if(tds.length==2){
					if(tds[1].equals("M")){
						fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"easyui-validatebox text2\" data-options=\"required:true\" /><span class=\"must\">*</span>";	
					}else{
						fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"text2\"  />";
					}
				}else if(tds.length>2){
					String len = tds[3];
					//多个条件的情况，长度设置
					if(tds[1].equals("M")){
						fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"easyui-validatebox text2\" data-options=\"required:true,validType:length[0,"+len+"]\" /><span class=\"must\">*</span>";	
					}else{
						fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"text2\" />";
					}
				}
			}
			
		}else if(tds[0].equals("V") && isrel){
			//两级级联的菜单 V~O~::3 例如：国家-省份-城市
		}else if(tds[0].equals("D")){
			if(tds[1].equals("M")){
				fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"easyui-datebox \"  style=\"width:250px\" formatter=\"dateboxformatter\" data-options=\"required:true\" /><span class=\"must\">*</span>";	
			}else{
				fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"easyui-datebox \"  style=\"width:250px\" formatter=\"dateboxformatter\" />";
			}
		}else if(tds[0].equals("DT")){
			if(tds[1].equals("M")){
				fieldstr += "<input type=\"text\" readonly=\"readonly\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"easyui-datetimebox\"  style=\"width:250px\" formatter=\"datetimeboxFormatter\" data-options=\"required:true\" /><span class=\"must\">*</span>";	
			}else{
				fieldstr += "<input type=\"text\" readonly=\"readonly\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"easyui-datetimebox\"  style=\"width:250px\" formatter=\"datetimeboxFormatter\" />";
			}
		}else if(tds[0].equals("N")){
			if(tds.length==2){
				if(tds[1].equals("M")){
					fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-numberbox text2\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" data-options=\"precision:0,required:true\" ></input><span class=\"must\">*</span>";
				}else{
					fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-numberbox text2\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" data-options=\"precision:0\" ></input>";
				}
			}else{
				String[] cond = tds[2].split(",");
				String len = cond[0];
				String pre = cond[1];
				if(tds[1].equals("M")){
					fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-numberbox text2\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" data-options=\"precision:"+pre+",required:true,validType:length[0,"+len+"]\" ></input><span class=\"must\">*</span>";
				}else{
					fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-numberbox text2\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" data-options=\"precision:"+pre+",validType:length[0,"+len+"]\" ></input>";
				}
			}
		}else if(tds[0].equals("E")){
			if(tds[1].equals("M")){
				fieldstr += "<input type=\"text\"  name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\"  class=\"easyui-validatebox text2 \" data-options=\"required:true,validType:'email'\" /><span class=\"must\">*</span>";
			}else{
				fieldstr += "<input type=\"text\"  name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\"  class=\"easyui-validatebox text2\" data-options=\"validType:'email'\" />";
			}
		}else if(tds[0].equals("P")){
			if(tds[1].equals("M")){
				fieldstr += "<input type=\"text\"  name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\"  class=\"easyui-validatebox text2\" data-options=\"required:true\" /><span class=\"must\">*</span>";
			}else{
				fieldstr += "<input type=\"text\"  name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\"  class=\"easyui-validatebox text2\" />";
			}
		}else if(tds[0].equals("NN")){
			if(tds[1].equals("M")){
				fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-numberbox text2\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" data-options=\"precision:2,required:true\" ></input><span class=\"must\">*</span>";
			}else{
				fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-numberbox text2\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" data-options=\"precision:2\" ></input><span class=\"must\">*</span>";
			}
		}else if(tds[0].equals("I")){
			if(xmField.getUitype().equals("51")){
				
				if(tds[1].equals("M")){
					HashMap<String, XmEntityname> hm_noline = (HashMap<String, XmEntityname>)CacheUtil.getFromCache(Constant.ENTITYNAME_NOLINE);
					if(!xmField.getFieldname().equals("activityid")){
						XmEntityname et = hm_noline.get(xmField.getFieldname().replace("_", ""));
						fieldstr +="<input type=\"hidden\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"text2\"  />";
						fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"_text\" class=\"text2 easyui-validatebox\" data-options=\"required:true\" value=\""+getText(getMapVal(obj,xmField.getColumnname()),et,xmCustomViewService)+"\" readonly=\"readonly\" />";
						fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"查询\" data-options=\"iconCls:'icon-search'\" href=\"javascript:showOptionPanel('"+et.getModulename()+"','"+xmField.getColumnname()+"','"+xmField.getFieldlabel()+"')\" ></a>";
						fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"清空\" data-options=\"iconCls:'icon-clear'\" ></a><span class=\"must\">*</span>";
					}
				}else{
					HashMap<String, XmEntityname> hm_noline = (HashMap<String, XmEntityname>)CacheUtil.getFromCache(Constant.ENTITYNAME_NOLINE);
					if(!xmField.getFieldname().equals("activityid")){
						XmEntityname et = hm_noline.get(xmField.getFieldname().replace("_", ""));
						fieldstr +="<input type=\"hidden\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"text2\"  />";
						fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"_text\" class=\"text2\" value=\""+getText(getMapVal(obj,xmField.getColumnname()),et,xmCustomViewService)+"\" readonly=\"readonly\" />";
						fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"查询\" data-options=\"iconCls:'icon-search'\" href=\"javascript:showOptionPanel('"+et.getModulename()+"','"+xmField.getColumnname()+"','"+xmField.getFieldlabel()+"')\" ></a>";
						fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"清空\" data-options=\"iconCls:'icon-clear'\" ></a>";
					}
				}
				
			}else if(xmField.getUitype().equals("57")){
				HashMap<String, XmEntityname> hm_noline = (HashMap<String, XmEntityname>)CacheUtil.getFromCache(Constant.ENTITYNAME_NOLINE);
				XmEntityname et = hm_noline.get(xmField.getFieldname().replace("_", ""));
				fieldstr +="<select class=\"text2\"  name=\""+xmField.getColumnname()+"\"  ><option value=\""+getMapVal(obj,xmField.getColumnname())+"\">"+getText(getMapVal(obj,xmField.getColumnname()),et,xmCustomViewService)+"</option></select>";
			}else if(xmField.getUitype().equals("76")){
				if(tds[1].equals("M")){
					HashMap<String, XmEntityname> hm_noline = (HashMap<String, XmEntityname>)CacheUtil.getFromCache(Constant.ENTITYNAME_NOLINE);
					if(!xmField.getFieldname().equals("activityid")){
						XmEntityname et = hm_noline.get(xmField.getFieldname().replace("_", ""));
						fieldstr +="<input type=\"hidden\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"text2\"  />";
						fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"_text\" class=\"text2 easyui-validatebox\" data-options=\"required:true\" value=\""+getText(getMapVal(obj,xmField.getColumnname()),et,xmCustomViewService)+"\" readonly=\"readonly\" />";
						fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"查询\" data-options=\"iconCls:'icon-search'\" href=\"javascript:showOptionPanel('"+et.getModulename()+"','"+xmField.getColumnname()+"','"+xmField.getFieldlabel()+"')\" ></a>";
						fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"清空\" data-options=\"iconCls:'icon-clear'\" ></a><span class=\"must\">*</span>";
					}
				}else{
					HashMap<String, XmEntityname> hm_noline = (HashMap<String, XmEntityname>)CacheUtil.getFromCache(Constant.ENTITYNAME_NOLINE);
					if(!xmField.getFieldname().equals("activityid")){
						XmEntityname et = hm_noline.get(xmField.getFieldname().replace("_", ""));
						fieldstr +="<input type=\"hidden\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"text2\"  />";
						fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"_text\" class=\"text2\" value=\""+getText(getMapVal(obj,xmField.getColumnname()),et,xmCustomViewService)+"\" readonly=\"readonly\" />";
						fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"查询\" data-options=\"iconCls:'icon-search'\" href=\"javascript:showOptionPanel('"+et.getModulename()+"','"+xmField.getColumnname()+"','"+xmField.getFieldlabel()+"')\" ></a>";
						fieldstr +="<a class=\"easyui-linkbutton mgl_10\" title=\"清空\" data-options=\"iconCls:'icon-clear'\" ></a>";
					}
				}
			}else{
				//还需要根据字段是否是REL字段进行区分操作
				if(tds[1].equals("M")){
					fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-numberbox text2\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" data-options=\"precision:0,required:true\" ></input><span class=\"must\">*</span>";
				}else{
					fieldstr +="<input type=\"text\" name=\""+xmField.getColumnname()+"\" class=\"easyui-numberbox text2\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" data-options=\"precision:0\" ></input><span class=\"must\">*</span>";
				}
			}
			
		}else if(tds[0].equals("T")){
			if(tds[1].equals("M")){
				fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"easyui-datetimebox\"  style=\"width:250px\" formatter=\"datetimeboxFormatter\" data-options=\"required:true\" /><span class=\"must\">*</span>";	
			}else{
				fieldstr += "<input type=\"text\" name=\""+xmField.getColumnname()+"\" value=\""+getMapVal(obj,xmField.getColumnname())+"\" class=\"easyui-datetimebox\"  style=\"width:250px\" formatter=\"datetimeboxFormatter\" />";
			}
		}
		return fieldstr;
	}
	
	private static String getText(String mapVal, XmEntityname et,XmCustomViewService xmCustomViewService) {
		if(mapVal!=""&&!mapVal.equals("0")){
			String text = xmCustomViewService.getFieldValue(et,mapVal);
			if(text!=null){
				return text;
			}
		}
		return "";
	}

	public static String getMapVal(Map map,String key){
		if(map!=null){
			if(map.get(key)!=null){
				return map.get(key).toString();
			}
		}
		return "";
	}
	
	/**
	 * 
	 * 根据PICKLIST设置成select
	 * 
	 * @param xmField
	 * @param objs
	 * @param tds 
	 * @param val 
	 * @return
	 */
	public static String getSelectHtml(XmField xmField,List<XmPicklist> objs, String[] tds, String val){
		StringBuffer sb = new StringBuffer();
		sb.append("<select name=\""+xmField.getColumnname()+"\" >");
		for(int i=0;i<objs.size();i++){
			if(val.equals(objs.get(i).getColvalue())){
				sb.append("<option selected=\"selected\" >"+objs.get(i).getColvalue()+"</option>");
			}else{
				sb.append("<option>"+objs.get(i).getColvalue()+"</option>");
			}
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
	 * @param val 
	 * @return
	 */
	public static String getUserSelect(XmField xmField,List<XmUsers> users, String[] tds, String val){
		StringBuffer sb = new StringBuffer();
		sb.append("<select name=\""+xmField.getColumnname()+"\" >");
		for(int i=0;i<users.size();i++){
			if(val.equals(users.get(i).getId())){
				sb.append("<option value=\""+users.get(i).getId()+"\" selected=\"selected\" >"+users.get(i).getUserName()+"</option>");
			}else{
				sb.append("<option value=\""+users.get(i).getId()+"\">"+users.get(i).getUserName()+"</option>");
			}
		}
		sb.append("</select>");
		if(tds[1].equals("M")){
			sb.append("<span class=\"must\">*</span>");
		}
		return sb.toString();
	}

	
	
	
}
