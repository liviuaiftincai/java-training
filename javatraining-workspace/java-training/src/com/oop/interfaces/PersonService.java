package com.oop.interfaces;

import java.util.List;

public interface PersonService {

	boolean addPerson(Person person);

	Person getPerson(int id);

	List<Person> getPersons();

	boolean updatePerson(Person person);

	boolean delelePerson(int id);

}