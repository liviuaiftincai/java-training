package com.oop.inheritance;

public class Professor extends Person {

	private String specialization;

	public Professor() {
		super();
	}

	public Professor(String name) {
		super(name);
	}
	
	public Professor(String name, String specialization) {
		super(name);
		this.setSpecialization(specialization);
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
	
}
