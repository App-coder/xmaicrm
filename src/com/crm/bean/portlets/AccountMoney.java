package com.crm.bean.portlets;

import java.math.BigDecimal;

/*
 * 应收款，应付款客户汇总
 */
public class AccountMoney {
	
	int countofuser;
	BigDecimal countOfMoney;
	
	public AccountMoney(int countofuser, BigDecimal countOfMoney) {
		super();
		this.countofuser = countofuser;
		this.countOfMoney = countOfMoney;
	}
	public int getCountofuser() {
		return countofuser;
	}
	public void setCountofuser(int countofuser) {
		this.countofuser = countofuser;
	}
	public BigDecimal getCountOfMoney() {
		return countOfMoney;
	}
	public void setCountOfMoney(BigDecimal countOfMoney) {
		this.countOfMoney = countOfMoney;
	}
	
	
	
	
}
