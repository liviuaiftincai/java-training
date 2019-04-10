package com.oop.inheritance;

import java.util.Arrays;
import java.util.List;

public class InheritanceDemo {

	public static void main(String[] args) {
		Person person = new Person();
		Person professor = new Professor("Vasile", "Math");
		Person student = new Student("Andrei");

		List<Person> persons = Arrays.asList(person, professor, student);

		for (Person p : persons) {
			p.sayHello();
		}

		int specialization = ((Student) professor).getYearOfStudy();
		System.out.println(specialization);
	}

}
