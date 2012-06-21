package com.crm.service.settings.system.impl;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.mapper.XmFieldMapper;
import com.crm.mapper.XmSequenceMapper;
import com.crm.mapper.settings.system.XmRelmodfieldlistMapper;
import com.crm.model.XmProductfieldlist;
import com.crm.model.XmRelmodfieldlist;
import com.crm.service.settings.system.XmRelmodFieldService;

@Service("xmRelmodFieldService")
public class XmRelmodFieldServiceImpl implements XmRelmodFieldService {
	@Autowired
	XmFieldMapper xmFieldMapper;
	@Autowired
	XmRelmodfieldlistMapper xmRelmodfieldlistMapper;
	@Autowired
	XmSequenceMapper xmSequenceMapper;

	
	@Override
	public int submit(String module, String xmrelmod) {
		JSONArray ja=JSONArray.fromObject(xmrelmod);
		XmRelmodfieldlist xmRelmodfieldlist=new XmRelmodfieldlist();
		this.xmRelmodfieldlistMapper.deleteByModule(module);
		int sequence=this.xmSequenceMapper.getSequenceId("relmodfieldlist");
		for(int i=0;i<ja.size();i++){
			sequence=sequence+1;
			JSONObject jo=ja.getJSONObject(i);
			xmRelmodfieldlist.setId(sequence);
			xmRelmodfieldlist.setFieldname(jo.getString("fieldname"));
			xmRelmodfieldlist.setModule(module);
			xmRelmodfieldlist.setWidth(jo.getString("width"));
			this.xmRelmodfieldlistMapper.insert(xmRelmodfieldlist);
		}
		this.xmSequenceMapper.updateSeq("relmodfieldlist", sequence);
		return 1;
	}

}
