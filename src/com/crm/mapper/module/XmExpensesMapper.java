package com.crm.mapper.module;

import org.apache.ibatis.annotations.Param;

import com.crm.bean.portlets.salesyearinfo.ExpensesStat;
import com.crm.model.XmExpenses;

public interface XmExpensesMapper {
    int deleteByPrimaryKey(Integer expensesid);

    int insert(XmExpenses record);

    int insertSelective(XmExpenses record);

    XmExpenses selectByPrimaryKey(Integer expensesid);

    int updateByPrimaryKeySelective(XmExpenses record);

    int updateByPrimaryKeyWithBLOBs(XmExpenses record);

    int updateByPrimaryKey(XmExpenses record);

	ExpensesStat getExpensesStat(@Param("year") String year);
}