package com.spring.TestInheritence;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;




@Entity
@Table(name="VEHICLE2")
@Inheritance(strategy=InheritanceType.JOINED)

public class Vehicle {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long vehicleId;

	@Column(name="name")
	private String name;
	
	@Column(name="mileage")
	private double mileage;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, double mileage) {
		super();
		this.name = name;
		this.mileage = mileage;
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", name=" + name + ", mileage=" + mileage + "]";
	}
	
	

}
