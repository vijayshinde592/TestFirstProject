package com.comparator;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1
{
	public static void main(String[] args)
	{
		Map<Integer, Student> map = new HashMap<>();
		
		Student s = new Student();
		s.setRolllno(1);
		s.setName("Vijay");
		
		Student s1 = new Student();
		s1.setRolllno(2);
		s1.setName("Yogesh");
		
		Student s2 = new Student();
		s2.setRolllno(1);
		s2.setName("Sultan");
		
		map.put(1, s);
		map.put(2, s1);
		map.put(3, s2);
		
		List<Map.Entry<Integer, Student>> list = new LinkedList<>(map.entrySet());
		System.out.println(list);
		Collections.sort(list, new SortName());
		
		Map<Integer, Student> sortMap = new LinkedHashMap<>();
		for (Entry<Integer, Student> entry : list) 
		{
			sortMap.put(entry.getKey(), entry.getValue());
		}
		
		Set<Integer> set = sortMap.keySet();
		for (Integer i : set) 
		{
			
			Student stu = map.get(i); 
			System.out.println(i+" "+stu.getName());
		}
	}
}
