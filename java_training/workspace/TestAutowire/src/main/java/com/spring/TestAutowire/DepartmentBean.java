package com.spring.TestAutowire;

public class DepartmentBean {
	
	private int deptId;
	private String deptName;
	
	@Override
	public String toString() {
		return "deptId=" + deptId + ", deptName=" + deptName;
	}

	public DepartmentBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentBean(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
