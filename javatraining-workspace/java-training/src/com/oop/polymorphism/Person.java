package com.oop.polymorphism;

public class Person {

	private String name;

	public Person() {
		this("Popescu");
	}

	public Person(String name) {
		super();
		this.setName(name);
	}
	
	public void sayHello() {
		System.out.println("Hello! I am a " + this.getClass().getSimpleName().toLowerCase() + " and my name is " + this.name + ".");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
