package com.oop.inheritance;

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

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	
}
