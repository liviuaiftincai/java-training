package com.oop.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PersonServiceImpl implements PersonService {

	private List<Person> persons = new ArrayList<Person>();

	@Override
	public boolean addPerson(Person person) {
		if (getPerson(person.getId()) != null) {
			System.err.println("Person with id " + person.getId() + " already exists");
			return false;
		}
		return persons.add(person);
	}

	@Override
	public Person getPerson(int id) {
		Person result = null;
		try {
			result = persons.stream().filter(person -> person.getId() == id).findFirst().get();
		} catch (NoSuchElementException e) {
			return null;
		}
		return result;
	}

	@Override
	public List<Person> getPersons() {
		return persons;
	}

	@Override
	public boolean updatePerson(Person person) {
		for (int i = 0; i < persons.size(); i++) {
			Person currentPerson = persons.get(i);
			if (currentPerson.getId() == person.getId() && !currentPerson.equals(person)) {
				persons.set(i, person);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delelePerson(int id) {
		return persons.removeIf(person -> person.getId() == id);
	}

}
