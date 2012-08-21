package com.crm.service.settings.system.impl;


import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.mapper.XmFieldMapper;
import com.crm.mapper.XmSequenceMapper;
import com.crm.mapper.settings.system.XmProductfieldlistMapper;
import com.crm.model.XmProductfieldlist;
import com.crm.service.XmSequenceService;
import com.crm.service.settings.system.XmProductFieldService;

@Service("xmProductFieldService")
public class XmProductFieldServiceImpl implements XmProductFieldService {
	@Autowired
	XmFieldMapper xmFieldMapper;
	@Autowired
	XmProductfieldlistMapper xmProductfieldlistMapper;
	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}


	@Override
	public int submit(String module, String xmproduct) {
		JSONArray ja=JSONArray.fromObject(xmproduct);
		XmProductfieldlist xmProductfieldlist=new XmProductfieldlist();
		this.xmProductfieldlistMapper.deleteByModule(module);
		int sequence=this.xmSequenceService.getSequenceId("productfieldlist");
		for(int i=0;i<ja.size();i++){
			sequence=sequence+1;
			JSONObject jo=ja.getJSONObject(i);
			xmProductfieldlist.setId(sequence);
			xmProductfieldlist.setFieldname(jo.getString("fieldname"));
			xmProductfieldlist.setModule(module);
			xmProductfieldlist.setWidth(jo.getString("width"));
			this.xmProductfieldlistMapper.insert(xmProductfieldlist);
		}
		return 1;
	}

}
