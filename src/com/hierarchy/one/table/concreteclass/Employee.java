package com.hierarchy.one.table.concreteclass;

import java.util.Date;

public class Employee extends Person {

	private Date joiningDate;
	private String departmentName;

	public Employee(String firstname, String lastname, String departmentName, Date date) {
		super(firstname, lastname);
		this.departmentName = departmentName;
		this.joiningDate = date;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}