package com.spring.TestInheritence;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="BIKE")
@PrimaryKeyJoinColumn(name="ID")
public class Bike extends Vehicle{
	
	@Column
	private double cc;

	public Bike() {
		super();
		
	}

	public Bike(String name, double mileage,double cc) {
		super(name, mileage);
		this.cc=cc;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Bike [cc=" + cc + "]";
	}
	
	

}
