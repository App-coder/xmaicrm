package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.mapper.XmPicklistMapper;
import com.crm.mapper.XmSequenceMapper;
import com.crm.model.XmPicklist;
import com.crm.service.XmPicklistService;
import com.crm.service.XmSequenceService;
@Service("xmPicklistService")
public class XmPicklistServiceImpl implements XmPicklistService {
	
	XmPicklistMapper xmPicklistMapper;
	@Resource(name="xmPicklistMapper")
	public void setXmPicklistMapper(XmPicklistMapper xmPicklistMapper) {
		this.xmPicklistMapper = xmPicklistMapper;
	}
	
	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}


	@Override
	public List<Object> getPickList(String pickfieldcolname) {
		return this.xmPicklistMapper.getPickList(pickfieldcolname);
	}


	@Override
	public List<XmPicklist> getPicks(String fieldname) {
		return this.xmPicklistMapper.getPicks(fieldname);
	}
	
	@Override
	public List<Object> getPickListName(int tabid,int page,int rows) {
		int offset = (page-1)*rows;
		return this.xmPicklistMapper.getPickListName(tabid,offset,rows);
	}
	
	@Override
	public int getTotal(int tabid) {
		return this.xmPicklistMapper.getTotal(tabid);
	}
	
	@Override
	public List<XmPicklist> getPickListValue(String colname) {
		return this.xmPicklistMapper.getPickListValue(colname);
	}
	
	@Override
	public int updatePickListValue(String colname,String arrpick) {
		this.xmPicklistMapper.deleteByColname(colname);
		int sequence=0;
    	XmPicklist xp=new XmPicklist();
    	String[] pick=arrpick.split(",");
    	sequence=this.xmSequenceService.getSequenceId("picklist");
    	for(int i=0;i<pick.length;i++){
    		xp.setId(sequence);
    		xp.setColvalue(pick[i]);
    		xp.setColname(colname);
    		xp.setSequence(i);
    		this.xmPicklistMapper.insert(xp);
    	}
		return 1;
	}

}
