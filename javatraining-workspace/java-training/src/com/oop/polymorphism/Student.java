package com.oop.polymorphism;

public class Student extends Person {

	private int yearOfStudy;
	
	public Student() {
		super();
		this.setYearOfStudy(1);
	}

	public Student(String name) {
		this(name, 1);
	}
	
	public Student(String name, int yearOfStudy) {
		super(name);
		this.yearOfStudy = yearOfStudy;
	}

	@Override
	public void sayHello() {
		System.out.println("Hello! I am a student in year " + this.getYearOfStudy() + " and my name is " + this.getName() + ".");
	}
	
	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	
}
