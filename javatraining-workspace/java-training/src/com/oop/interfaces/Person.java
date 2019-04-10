package com.oop.interfaces;

public class Person implements Comparable<Person> {

	private int id;
	private String name;

	public Person() {
		this(1, "Popescu");
	}

	public Person(int id, String name) {
		super();
		this.setId(id);
		this.setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [id = " + id + ", name = " + name + "]";
	}

	@Override
	public int compareTo(Person o) {
		if (this.id > o.getId()) {
			return 1;
		} else if (this.id < o.getId()) {
			return -1;
		}
		return 0;
	}

}
