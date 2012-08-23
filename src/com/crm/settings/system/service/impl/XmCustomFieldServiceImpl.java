package com.crm.settings.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.crm.action.BaseController;
import com.crm.mapper.XmSequenceMapper;
import com.crm.model.XmEntityname;
import com.crm.model.XmField;
import com.crm.settings.system.mapper.XmBlocksMapper;
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
   	
   	XmSequenceMapper xmSequenceMapper;
	@Resource(name="xmSequenceMapper")
	public void setXmSequenceMapper(XmSequenceMapper xmSequenceMapper) {
		this.xmSequenceMapper = xmSequenceMapper;
	}
	
	XmBlocksMapper xmBlocksMapper;
	@Resource(name="settings.system.mapper.xmBlocksMapper")
	public void setXmBlocksMapper(XmBlocksMapper xmBlocksMapper) {
		this.xmBlocksMapper = xmBlocksMapper;
	}
	
	private int fieldid;

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
   		XmField xmField=new XmField();
   		this.insert(xmField, queryParams);
   		
   		JSONObject jo=JSONObject.fromObject(queryParams);
   		int tabid=jo.getInt("tabid");
   		String cfField=jo.getString("cfField");
   		cfField=" add cf"+(fieldid-1)+" "+cfField;
   		this.addCfField(this.getTableNameByTabid(tabid), cfField);
   		
   		
   	}
   	
   	
   	
   	
   	//获取模块对应的表名
   	@Override
   	public String getTableNameByTabid(int tabid) {
   		return this.xmFieldMapper.getTableNameByTabid(tabid);
   	}
   	
   	//插入模块的自定义信息包含的字段
   	public int insert(XmField xmField,String queryParams){
   		JSONObject jo=JSONObject.fromObject(queryParams);
   		int tabid=jo.getInt("tabid");
   		fieldid=this.getSequence("field");
   		String tablename=this.getTableNameByTabid(tabid);
   		xmField.setTabid(tabid);
   		xmField.setFieldid(fieldid);
   		xmField.setColumnname("cf"+(fieldid-1));
   		xmField.setTablename(tablename);
   		xmField.setGeneratedtype(2);
   		xmField.setUitype(jo.getString("uitype"));
   		xmField.setFieldname("cf"+(fieldid-1));
   		xmField.setFieldlabel(jo.getString("fieldlabel"));
   		xmField.setReadonly(0);
   		xmField.setPresence(0);
   		xmField.setSelected(0);
   		xmField.setMaximumlength(100);
   		xmField.setSequence(this.getSequence("field")+1);
   		xmField.setBlock(this.xmBlocksMapper.getBlockIdByTabId(tabid));
   		xmField.setDisplaytype(1);
   		xmField.setTypeofdata(jo.getString("typeofdata"));
   		xmField.setQuickcreate(1);
   		xmField.setQuickcreatesequence(0);
   		xmField.setInfoType("BAS");
   		return this.xmFieldMapper.insert(xmField);
   	}
   	
   	//获取xm_field的field主键
   	@Override
   	public int getSequence(String table) {
   		int sequence=this.xmSequenceMapper.getSequenceId(table);
   		int fieldid=sequence+2;
   		this.xmSequenceMapper.updateSeq(table, fieldid);
   		return fieldid;
   	}
   	
   	//在模块对应的表中增加自定义的字段
   	@Override
   	public int addCfField(String tablename, String cfField) {
   		return this.xmFieldMapper.addColumn(tablename, cfField);
   	}


}
