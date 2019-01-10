package com.oop.abstraction;

import java.util.Arrays;

public class ArrayBinarySearch extends ArraySearch {

	@Override
	public void search() {
		String[] array = super.getArray();
		Arrays.sort(array);
		setKeyFound(binarySearch(array, 0, array.length-1, getKey()) != -1);
	}

	private int binarySearch(String[] array, int firstIndex, int lastIndex, String key) {
		if (lastIndex >= firstIndex) {
			int mid = firstIndex + (lastIndex - firstIndex) / 2;
			if (array[mid].equals(key)) {
				return mid;
			} else if (array[mid].compareTo(key) >= 1) {
				return binarySearch(array, firstIndex, mid - 1, key);
			} else {
				return binarySearch(array, mid + 1, lastIndex, key);
			}
		}
		return -1;
	}

}
