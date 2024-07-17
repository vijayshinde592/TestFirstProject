package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class India_map
{
	public void m1()
	{
		/**Adding and Putting*/
		List<String> mh = new ArrayList<String>();
		mh.add("pune");
		mh.add("Mumbai");
		mh.add("Amalner");
		mh.add("Dhule");
		
		List<String> up = new ArrayList<String>();
		up.add("Lucknow");
		up.add("Banaras");
		up.add("kanpur");
		
		Map<String, List<String>> State = new HashMap<String, List<String>>();
		State.put("Maharashtra", mh);
		State.put("Uttar Pradesh", up);
		
		Map<String, Map<String, List<String>>> country = new HashMap<String, Map<String,List<String>>>();
		country.put("India", State);
		
		/**Iterator*/
		
		Set<String> keys = country.keySet();
		
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println("....."+key+"....."+key+"....."+key+"....."+key+".....");
			System.out.println("");
			
			Map<String, List<String>> m1 = country.get(key); 
			
			Set<String> keys1= m1.keySet();
			
			Iterator<String> itr1 = keys1.iterator();
			while(itr1.hasNext())
			{
				String key1 = itr1.next();
				List<String> li = m1.get(key1);
				System.out.println("....."+key1+".....");
				for (String city : li)
				{
					System.out.println(city);
				}
				System.out.println("");
			}
			
			
		}
	}
	
	public static void main(String[] args) 
	{
		India_map im = new India_map(); 
		im.m1();
	}
}
