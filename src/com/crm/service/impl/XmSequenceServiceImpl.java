package com.crm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmSequenceMapper;
import com.crm.service.XmSequenceService;
@Service("xmSequenceService")
public class XmSequenceServiceImpl implements XmSequenceService {

	XmSequenceMapper xmSequenceMapper;
	@Resource(name="xmSequenceMapper")
	public void setXmSequenceMapper(XmSequenceMapper xmSequenceMapper) {
		this.xmSequenceMapper = xmSequenceMapper;
	}


	@Override
	public int getSequenceId(String table) {
		int now_seq = this.xmSequenceMapper.getSequenceId(table);
		this.xmSequenceMapper.updateSeq(table,now_seq+1);
		return now_seq+1;
	}

}
