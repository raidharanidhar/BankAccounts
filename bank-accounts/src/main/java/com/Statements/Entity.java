package com.Statements;

import java.sql.Date;

public class Entity {
	
	private String accountHoldersName;
	private long accountNumber ;
	private String accountType;
	private Date statementDate;
	private long beginningBalance;
	private long endingBalance;
	public String getAccountHoldersName() {
		return accountHoldersName;
	}
	public void setAccountHoldersName(String accountHoldersName) {
		this.accountHoldersName = accountHoldersName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getStatementDate() {
		return statementDate;
	}
	public void setStatementDate(Date statementDate) {
		this.statementDate = statementDate;
	}
	public long getBeginningBalance() {
		return beginningBalance;
	}
	public void setBeginningBalance(long beginningBalance) {
		this.beginningBalance = beginningBalance;
	}
	public long getEndingBalance() {
		return endingBalance;
	}
	public void setEndingBalance(long endingBalance) {
		this.endingBalance = endingBalance;
	}
}
