package com.oop.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// Create a person object
		Person person = new Person();
		person.setName("Scarlett Johansson");
//		person.setAge(34);
		person.setGender(Gender.FEMALE);
		person.setMarried(false);
		person.setStreet("Madison");
		person.setStreetNumber(57);
		person.setCity("New York");

		// Play with the person
		System.out.println(person.getName());
		person.setMarried(true);
		System.out.println(person.getName() + " has the following address: " + person.getAddress());
		person.setMarried(false);
		try {
			person.setAge(150);
		} catch (InvalidAgeException e) {
			System.out.println("Error occured!");
		}
		System.out.println(person.getName() + " is " + person.getAge() + " years old.");

	}

}
