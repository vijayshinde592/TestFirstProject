package com.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void m1()
	{
		//Map<Integer, String> map = new HashMap<>();
		Map map = new HashMap();
		map.put(10, "Java");
		map.put(5, "c");
		map.put(20, "Classes");
		System.out.println(map);/**{20=Classes, 5=c, 10=Java}*/
		map.put(5, "CJC");
		System.out.println(map);/**{20=Classes, 5=CJC, 10=Java}*/
		/**when we put any value on same key, then it will replace newest value 
		 * in above example we put cjc value on key 5 so it is replace on java value*/
		
		/**Iterator*/
		
		Set keys = map.keySet();
		System.out.println(keys);/**[20, 5, 10]*/
		
		Iterator itr = keys.iterator();
		while(itr.hasNext())
		{
			int key= (int) itr.next();
			//System.out.println(key);
			
			String val = (String) map.get(key);
			System.out.println(val);
		}
		
	}
	
	public static void main(String[] args) 
	{
		Example ex = new Example();
		ex.m1();
	}
}
