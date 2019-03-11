package com.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SortName implements Comparator<Map.Entry<Integer, Student>>
{

	@Override
	public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2)
	{
		// Vijay Shinde Project
		return o1.getValue().getName().compareTo(o2.getValue().getName());
	}


}
