package com.oop.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		String[] array = {"H", "D", "T", "A", "C", "G"};
		
//		ArraySearch arraySearch = new ArraySearch();
		
		ArraySearch arraySearch = new ArrayBinarySearch();
		arraySearch.setArray(array);
		arraySearch.setKey("T");
		arraySearch.search();
		arraySearch.displayResult();
	}
	
}
