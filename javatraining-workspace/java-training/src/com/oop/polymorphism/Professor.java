package com.oop.polymorphism;

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

	@Override
	public void sayHello() {
		System.out.println("Hello! I am a " + this.getSpecialization() + " professor and my name is " + this.getName() + ".");
	}
	
	@Override
	public String getName() {
		return "prof. " + super.getName();
	}
	
	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
	
}
