package demo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainApp {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
//		performConditionally(persons, p -> true, p -> System.out.println(p));

//		performConditionally(persons, person -> person.getFirstName().startsWith("C"), p -> System.out.println(p));
//		performConditionally(persons, person -> person.getLastName().startsWith("C"), p -> System.out.println(p.getFirstName()));

		persons.forEach(System.out::println);
//		System.out.println(integers.get());
	}

	public static void performConditionally(List<Person> persons, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : persons) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

	public static void print(Person person) {
		System.out.println(person);
	}

}
