package com.crm.service.portlets;

import java.util.List;

import com.crm.model.XmQuotes;

public interface XmQuotesService {

	/**
	 * 最新报价
	 * 
	 * @param id
	 * @return
	 */
	List<XmQuotes> getTopQuote(Integer id);

}
