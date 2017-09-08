package com.spring.HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
@NamedQueries({
	
	@NamedQuery(name="getTotalSalary",query="Select SUM(empSalary) from Employee")
	
})
public class Employee {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="EMPID")
	private Long empId;

	@Column(name="EMPNAME")
	private String empName;
	
	@Column(name="EMPCITY")
	private String empCity;
	
	@Column(name="EMPSALARY")
	private Long empSalary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String empCity, Long empSalary) {
		super();
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
	}

	public Employee(Long empId, String empName, String empCity, Long empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public Long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Long empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", empSalary=" + empSalary
				+ "]";
	}
	
	
}
