package com.crm.service.settings.system.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.mapper.XmEntitynameMapper;
import com.crm.mapper.settings.system.XmApprove2userMapper;
import com.crm.mapper.settings.system.XmApproveMapper;
import com.crm.mapper.settings.system.XmApprovelogMapper;
import com.crm.model.XmApprove;
import com.crm.model.XmApprove2user;
import com.crm.model.XmEntityname;
import com.crm.service.settings.system.XmApproveService;

@Service("xmApproveService")
public class XmApproveServiceImpl implements XmApproveService {
	
	XmApproveMapper xmApproveMapper;
	@Resource(name="xmApproveMapper")
	public void setXmApproveMapper(XmApproveMapper xmApproveMapper) {
		this.xmApproveMapper = xmApproveMapper;
	}
	
	@Autowired
	XmApprove2userMapper xmApprove2userMapper;
	@Autowired
	XmEntitynameMapper xmEntitynameMapper;
	@Autowired
	XmApprovelogMapper xmApprovelogMapper;


	@Override
	public List<XmApprove> getApproveList(int tabid) {
		return this.xmApproveMapper.getApproveList(tabid);
	}
	
	@Override
	public List<Object> getApproveRole(int approveid) {
		return this.xmApproveMapper.getApproveRole(approveid);
	}
	
	@Override
	public int updateMultiApprove(XmApprove xmApprove, int approveid,
			String userArr) {
		int affect=this.xmApproveMapper.updateByPrimaryKeySelective(xmApprove);
		this.xmApprove2userMapper.delete(approveid);
		XmApprove2user xmApprove2user=new XmApprove2user();
		for(String userid:userArr.split(",")){
			xmApprove2user.setUserid(userid);
			xmApprove2user.setApproveid(approveid);
			this.xmApprove2userMapper.insert(xmApprove2user);
		}
		return affect;
	}
	
	//判断流程是否正在使用
	@Override
	public int getApproveUsed(int approveid) {
		String modulename=this.xmApproveMapper.getApproveRelatedModule(approveid);
		XmEntityname modulerel=this.xmEntitynameMapper.getEntityByModule(modulename);
		String tablename=modulerel.getTablename();
		String fieldid=modulerel.getEntityidfield();
		return this.xmApprovelogMapper.getApproveUsed(tablename, fieldid, approveid);
	}
	
	

}
