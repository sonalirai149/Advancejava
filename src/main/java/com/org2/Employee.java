package com.org2;
import java.util.Date;

public class Employee {
	private int EmployeeId;
    private String Employeename;
    private String createdBy;
    private Date createdDate;
	public int getEmployeeId() {
		return EmployeeId;
	}
	public  void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeename() {
		return Employeename;
	}
	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
