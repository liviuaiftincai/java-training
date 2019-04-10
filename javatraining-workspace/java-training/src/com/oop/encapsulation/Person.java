package com.oop.encapsulation;

public class Person {

	private String name;
	private int age;
	private Gender gender;
	private boolean married;
	private String street;
	private int streetNumber;
	private String city;

	public Person() {
		super();
	}

	public Person(String name, int age, Gender gender, boolean married, String street, int streetNumber, String city)
			throws InvalidAgeException {
		super();
		setName(name);
		setAge(age);
		setGender(gender);
		setStreet(street);
		setStreetNumber(streetNumber);
		setCity(city);
	}
	
	

	// You can change the returned value
	public String getName() {
		String title = "";
		if (this.age >= 30) {
			switch (gender) {
			case MALE:
				title = "Mr. ";
				break;
			case FEMALE:
				title = this.isMarried() ? "Mrs. " : "Miss";
				break;
			default:
				break;
			}
		}
		return title + " " + name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	// You can perform validation
	public void setAge(int age) throws InvalidAgeException {
		if (age >= 130) {
			throw new InvalidAgeException("The oldest person ever lived for 122 years old. "
					+ "It's imposible for this person to have the age of " + String.valueOf(age));
		} else if (age < 0) {
			throw new InvalidAgeException("Inserted argument is invalid. Age cannot have negative values.");
		}
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isMarried() {
		return married;
	}

	// When you realize you need to do more than just set and get the value
	public void setMarried(boolean married) {
		if (!this.married && married) {
			System.out.println("Congratulations " + name + "!");
		} else if (this.married && !married) {
			System.out.println("I am sorry " + name + "!");
		}
		this.married = married;
	}

	// You can hide the internal representation
	public String getAddress() {
		return street + " " + streetNumber + " " + city;
	}

	// You can change value being set
	public void setStreet(String street) {
		this.street = street + " Street";
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
