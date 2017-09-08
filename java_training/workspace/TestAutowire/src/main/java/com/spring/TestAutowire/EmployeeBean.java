package com.spring.TestAutowire;

public class EmployeeBean {
	
	private int empId;
	private String empName;
	private DepartmentBean department;
	
	public EmployeeBean() {
		super();
		
	}

	public EmployeeBean(int empId, String empName, DepartmentBean department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public DepartmentBean getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentBean department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", " + department + "]";
	}
	
	
	

}
