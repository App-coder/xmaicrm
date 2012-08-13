package com.crm.potentials.service;

import java.util.List;

import com.crm.model.XmQuotes;

/**
 * 报价单的接口
 * 
 * User: zhujun
 * Date: 2012-8-13
 * Time: 下午3:31:56
 */
public interface XmQuotesService {

	int getTotal(int viewid);

	List<XmQuotes> loadList(int page, int rows, int viewid);

}
