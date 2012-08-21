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
		String now_seq = this.xmSequenceMapper.getSequenceId(table);
		Integer newseq = 0;
		if(now_seq!=null){
			newseq = Integer.parseInt(now_seq);
		}
		this.xmSequenceMapper.clearSeq(table);
		this.xmSequenceMapper.updateSeq(table,newseq+1);
		return newseq+1;
	}


	@Override
	public int getMaxAddOne(String tablename, String key) {
		int max = this.xmSequenceMapper.getMax(tablename,key);
		return max+1;
	}

}
