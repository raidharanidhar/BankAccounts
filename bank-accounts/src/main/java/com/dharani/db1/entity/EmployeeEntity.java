package com.dharani.db1.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class EmployeeEntity {
	
	
	private int employeeid;
	
	private String employeename;
	private String employeesurname;
	private String employeedepartment;
	private Date createddate;
	private Date modifyDate;
	private int balance;
	

}
