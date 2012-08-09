package com.crm.report.service.impl;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.crm.model.XmCangkuInfo;
import com.crm.model.XmIntegradedModel;
import com.crm.model.XmSalesTotal;
import com.crm.model.XmStaffMonthly;
import com.crm.model.XmUsersalesinforeport;
import com.crm.report.mapper.XmIntegradedreportsMapper;
import com.crm.report.service.XmIntegradedreportsService;

/**
 * 
 * @author zhangjun
 * @time:2012-09-17 00:58
 */

@Service("xmIntegradedreportsService")
public class XmIntegradedreportsServiceImpl implements XmIntegradedreportsService {
	
	public static final String SALES_ORDERS="合同";
	public static final String SALES_GATHERS="回款";
	public static final String SALES_EXPENSES="合同";
	
	@Autowired
	@Qualifier("xmIntegradedreportsMapper")
	XmIntegradedreportsMapper xmIntegradedreportsMapper;
	
	@Override
	public List<XmCangkuInfo> queryCangkuTotal() {
		return this.xmIntegradedreportsMapper.queryCangkuTotal();
	};
	
	@Override
	public List<XmCangkuInfo> getCangkuFooter() {
		return this.xmIntegradedreportsMapper.getCangkuFooter();
	};
	
	@Override
	public List<Object> getReportFooter(int id, String duedate) {
        return this.xmIntegradedreportsMapper.getReportFooter(id, duedate);
	}
	
	@Override
	public List<Object> queryIntegradedreport(int id,String duedate) {
		return this.xmIntegradedreportsMapper.queryIntegradedreport(id,duedate);
	}

	@Override
	public List<Object> getMerge(int id, String duedate) {
		return this.xmIntegradedreportsMapper.getMerge(id, duedate);
	}
	
	@Override
	public int getTotal(int id,String duedate) {
		return this.xmIntegradedreportsMapper.getTotal(id,duedate);
	}
	
	@Override
	/**
	 *  type:1:合同 2：回款  3：所花费用
	 */
	public List<XmStaffMonthly> staffMonthly() {
		List<XmSalesTotal> salesTotal=xmIntegradedreportsMapper.querySalesTotal();
		List<XmStaffMonthly> list=new ArrayList<XmStaffMonthly>();
		XmStaffMonthly sm1=new XmStaffMonthly();
		XmStaffMonthly sm2=new XmStaffMonthly();
		XmStaffMonthly sm3=new XmStaffMonthly();
		for(XmSalesTotal st:salesTotal){
			switch(st.getType()){
			case 1:
				sm1.setName(SALES_ORDERS);
				setter(sm1,st.getDuedate(), st.getSumactualamount(), float.class);
				break;
			case 2:
				sm2.setName(SALES_GATHERS);
				setter(sm2,st.getDuedate(), st.getSumactualamount(), float.class);
				break;
			case 3:
				sm3.setName(SALES_EXPENSES);
				setter(sm3,st.getDuedate(), st.getSumactualamount(), float.class);
				break;
			}
		}
		list.add(sm2);
		list.add(sm1);
		list.add(sm3);
		return list;
	} 
	
	/**
	Object obj：要操作的对象
	String att：要操作的属性
	Object value：要设置的属性内容
	Class<?> type：要设置的属性类型
    */
	public static void setter(Object obj,String att,Object value,Class<?> type){
		try{
			Method met = obj.getClass().getMethod("set"+att,type) ;
			met.invoke(obj,value) ;	
		}catch(Exception e){
			e.printStackTrace() ;
		}
	}

}
