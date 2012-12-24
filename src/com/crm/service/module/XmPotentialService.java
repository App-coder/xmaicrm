package com.crm.service.module;

import java.util.List;

import com.crm.model.XmPotential;

public interface XmPotentialService{

	List<XmPotential> getTopPotential();

	String getSalesCountByPick(String colvalue, List<Object> ids,String firstday,String lastday);

	int getPotentialOfUserAndLast(Integer id, String start, String end);

	int getTotalForOpportunities(int crmid);

	List<XmPotential> getOpportunities(int page, int rows, int crmid);

}
