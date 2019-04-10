package com.oop.interfaces;

import java.util.Collections;
import java.util.List;

public class InterfaceDemo {

	private static PersonService personService = new PersonServiceImpl();

	public static void main(String[] args) {
		Person person1 = new Person(248, "Cristiano Ronaldo");
		Person person2 = new Person(195, "Joe Black");
		Person person3 = new Person(327, "Johnny Bravo");

		personService.addPerson(person1);
		personService.addPerson(person2);
		personService.addPerson(person3);

		Person person4 = new Person(195, "Viorica Dancila");
		personService.updatePerson(person4);

		

//		Person thePerson = personService.getPerson(195);
//		System.out.println("The person you get is: " + thePerson);

//		personService.delelePerson(195);

		List<Person> persons = personService.getPersons();
		Collections.sort(persons);
		listPersons();

	}

	private static void listPersons() {
		List<Person> persons = personService.getPersons();
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
