package com.oop.abstraction;

public class ArrayClassicSearch extends ArraySearch {

	@Override
	public void search() {
		String[] sourceArray = super.getArray();
		for (int i = 0; i < sourceArray.length; i++) {
			if (sourceArray[i].equals(super.getKey())) {
				setKeyFound(true);
				return;
			}
		}
		setKeyFound(false);
	}
	
}
