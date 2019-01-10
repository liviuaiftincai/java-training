package com.oop.abstraction;

public abstract class ArraySearch {

	private String[] array;
	private String key;
	private boolean keyFound;

	public abstract void search();

	public void displayResult() {
		if (keyFound) {
			System.out.println("The key was found in the array");
		} else {
			System.out.println("The key was not found in the array");
		}
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isKeyFound() {
		return keyFound;
	}

	public void setKeyFound(boolean keyFound) {
		this.keyFound = keyFound;
	}

}
