package com.crm.settings.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.crm.action.BaseController;
import com.crm.model.XmEntityname;
import com.crm.model.XmField;
import com.crm.settings.system.mapper.XmFieldMapper;
import com.crm.settings.system.service.XmCustomFieldService;
import com.crm.util.FieldType;

@Service("xmCustomFieldService")
public class XmCustomFieldServiceImpl extends BaseController implements XmCustomFieldService  {
	
	XmFieldMapper xmFieldMapper;
   	@Resource(name="settings.system.mapper.xmFieldMapper")
	public void setXmFieldMapper(XmFieldMapper xmFieldMapper) {
		this.xmFieldMapper = xmFieldMapper;
	}

   	@Override
   	public List<XmField> getFieldsByTabid(int tabid,int page,int rows) {
   		int offset = (page-1)*rows;
   		List<XmField> ls=this.xmFieldMapper.getFieldsByTabid(tabid,offset,rows);
   		for(XmField xmField:ls){
   			xmField.setUitype(FieldType.getUiType(xmField.getUitype()));
   		}
   		return ls;
   	}
   	
   	@Override
   	public int insertCustomField(String queryParams) {
   		JSONObject jo=JSONObject.fromObject(queryParams);
   		int tabid=jo.getInt("tabid");
   		String cfField=jo.getString("cfField");
   		List<XmEntityname> entitys=this.xmFieldMapper.getTableNameByTabid(tabid);
   		String tablename=entitys.get(0).getTablename();
   		return this.xmFieldMapper.addColumn(tablename, cfField);
   	}


}
