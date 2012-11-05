package com.crm.service.settings.system.impl;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.crm.action.BaseController;
import com.crm.mapper.XmBlocksMapper;
import com.crm.mapper.XmDefOrgFieldMapper;
import com.crm.mapper.XmFieldMapper;
import com.crm.mapper.XmPicklistMapper;
import com.crm.mapper.XmSequenceMapper;
import com.crm.mapper.settings.basic.XmProfile2fieldMapper;
import com.crm.mapper.settings.basic.XmProfileMapper;
import com.crm.model.XmDefOrgField;
import com.crm.model.XmField;
import com.crm.model.XmPicklist;
import com.crm.model.XmProfile;
import com.crm.model.XmProfile2field;
import com.crm.service.settings.system.XmCustomFieldService;
import com.crm.util.FieldType;

@Service("xmCustomFieldService")
public class XmCustomFieldServiceImpl extends BaseController implements XmCustomFieldService  {
	
	XmFieldMapper xmFieldMapper;
   	@Resource(name="xmFieldMapper")
	public void setXmFieldMapper(XmFieldMapper xmFieldMapper) {
		this.xmFieldMapper = xmFieldMapper;
	}
   	
   	XmSequenceMapper xmSequenceMapper;
	@Resource(name="xmSequenceMapper")
	public void setXmSequenceMapper(XmSequenceMapper xmSequenceMapper) {
		this.xmSequenceMapper = xmSequenceMapper;
	}
	
	XmBlocksMapper xmBlocksMapper;
	@Resource(name="xmBlocksMapper")
	public void setXmBlocksMapper(XmBlocksMapper xmBlocksMapper) {
		this.xmBlocksMapper = xmBlocksMapper;
	}
	
	XmProfileMapper xmProfileMapper;
	@Resource(name="xmProfileMapper")
	public void setXmProfileMapper(XmProfileMapper xmProfileMapper) {
		this.xmProfileMapper = xmProfileMapper;
	}
	
	XmProfile2fieldMapper xmProfile2fieldMapper;
	@Resource(name="xmProfile2fieldMapper")
	public void setXmProfile2fieldMapper(XmProfile2fieldMapper xmProfile2fieldMapper) {
		this.xmProfile2fieldMapper = xmProfile2fieldMapper;
	}
	
	XmDefOrgFieldMapper xmDefOrgFieldMapper;
	@Resource(name="xmDefOrgFieldMapper")
	public void setXmDefOrgFieldMapper(XmDefOrgFieldMapper xmDefOrgFieldMapper) {
		this.xmDefOrgFieldMapper = xmDefOrgFieldMapper;
	}
	
	XmPicklistMapper xmPicklistMapper;
	@Resource(name="xmPicklistMapper")
	public void setXmPicklistMapper(XmPicklistMapper xmPicklistMapper) {
		this.xmPicklistMapper = xmPicklistMapper;
	}

	private int fieldid;
	private int tabid;
	
	@Override
	public int updateByPrimaryKeySelective(String  queryParams) {
		XmField xmField=new XmField();
		JSONObject jo=JSONObject.fromObject(queryParams);
		fieldid=jo.getInt("fieldid");
		xmField.setFieldid(fieldid);
		xmField.setFieldlabel(jo.getString("fieldlabel"));
		xmField.setTypeofdata(jo.getString("typeofdata"));
		this.xmFieldMapper.updateByPrimaryKeySelective(xmField);
		String arrpick=jo.getString("arrpick");
   		if(!arrpick.equals("undefined")){
   			this.xmPicklistMapper.deleteByColname(jo.getString("columnname"));
   			this.insertPickList(arrpick);
   		}
		return 1;
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
   	public int getTotal(int tabid) {
   		return this.xmFieldMapper.getTotal(tabid);
   	}
   	
   	@Override
   	public int insertCustomField(String queryParams) {
   		XmField xmField=new XmField();
   		this.insert(xmField, queryParams);
   		this.setSequence("field");
   		
   		JSONObject jo=JSONObject.fromObject(queryParams);
   		String cfField=jo.getString("cfField");
   		cfField=" add cf"+(fieldid-1)+" "+cfField;
   		this.addCfField(this.getTableNameByTabid(tabid), cfField);
   		this.insertProfile2field();
   		int affect=this.insertDefOrgField();//undefined
   		String arrpick=jo.getString("arrpick");
   		if(!arrpick.equals("undefined"))
   			this.insertPickList(arrpick);
   		return affect;
   	}
   	
   	//删除自定义字段信息
   	
   	@Override
   	public int deleteCustomField(String queryParams) {
   		JSONObject jo=JSONObject.fromObject(queryParams);
   		fieldid=jo.getInt("fieldid");
   		String tablename=jo.getString("tablename");
   		String columnname=jo.getString("columnname");
   		String uitype=jo.getString("uitype");
   		String cfField="drop column "+columnname+" ";
   		this.xmFieldMapper.deleteByPrimaryKey(fieldid);
   		this.xmFieldMapper.deleteColumn(tablename, cfField);
   		this.xmProfile2fieldMapper.deleteByFieldId(fieldid);
   		int deletenum=this.xmDefOrgFieldMapper.deleteByPrimaryKey(fieldid);
   		if(uitype.equals("下拉框") || uitype.equals("多选框"))
   			this.xmPicklistMapper.deleteByColname(columnname);
   		return deletenum;
   	}
   	
   	//获取模块对应的表名
   	@Override
   	public String getTableNameByTabid(int tabid) {
   		return this.xmFieldMapper.getTableNameByTabid(tabid);
   	}
   	
   	//插入模块的自定义信息包含的字段
   	@Override
   	public int insert(XmField xmField,String queryParams){
   		JSONObject jo=JSONObject.fromObject(queryParams);
   		tabid=jo.getInt("tabid");
   		fieldid=this.getSequence("field")+2;
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
   		xmField.setSequence(this.xmFieldMapper.getMaxSequence(tabid)+1);
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
   		return this.xmSequenceMapper.getSequenceId(table);
   	}
   	
   	public void setSequence(String table){
   		this.xmSequenceMapper.updateSeq(table, fieldid);
   	}
   	
   	
   	//在模块对应的表中增加自定义的字段
   	@Override
   	public int addCfField(String tablename, String cfField) {
   		return this.xmFieldMapper.addColumn(tablename, cfField);
   	}
   	
   	//在权限字段表中插入自定义字段
    public void insertProfile2field() {
    	List<XmProfile> xmProfile=this.xmProfileMapper.selectProfileid();
    	XmProfile2field xmProfile2field=new XmProfile2field();
    	for(XmProfile xp:xmProfile){
    		int profileid=xp.getProfileid();
    		xmProfile2field.setProfileid(profileid);
    		xmProfile2field.setTabid(tabid);
    		xmProfile2field.setFieldid(fieldid);
    		xmProfile2field.setVisible(0);
    		xmProfile2field.setReadonly(1);
    		this.xmProfile2fieldMapper.insert(xmProfile2field);
    	}
    }
    
    public int insertDefOrgField(){
    	XmDefOrgField xmDefOrgField=new XmDefOrgField();
    	xmDefOrgField.setTabid(tabid);
    	xmDefOrgField.setFieldid(fieldid);
    	xmDefOrgField.setVisible(0);
    	xmDefOrgField.setReadonly(1);
    	return this.xmDefOrgFieldMapper.insert(xmDefOrgField);
    }
   	
    //下拉列表框
    public void insertPickList(String arrpick){
    	int sequence=0;
    	XmPicklist xp=new XmPicklist();
    	String[] pick=arrpick.split(",");
    	sequence=this.xmSequenceMapper.getSequenceId("picklist");
    	for(int i=0;i<pick.length;i++){
    		sequence+=1;
    		xp.setId(sequence);
    		xp.setColvalue(pick[i]);
    		xp.setColname("cf"+(fieldid-1));
    		xp.setSequence(i);
    		this.xmPicklistMapper.insert(xp);
    	}
    	this.xmSequenceMapper.updateSeq("picklist", sequence);
    }

}
