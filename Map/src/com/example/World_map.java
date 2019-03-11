package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class World_map 
{
	Map<String, Map<String, List<String>>> world = new LinkedHashMap<>();
	
	public void putData()
	{
		/**India*/
		
		List<String> mh = new ArrayList<String>();
		mh.add("Jalgaon");
		mh.add("Dhuke");
		mh.add("Pune");
		
		List<String> up = new ArrayList<>();
		up.add("Lucknow");
		up.add("Banaras");
		up.add("Kanpur");
		
		Map<String, List<String>> india = new HashMap<>();
		india.put("Maharashtra", mh);
		india.put("Uttar Pradesh", up);
		
		/**Usa*/
		
		List<String> sa = new ArrayList<String>();
		sa.add("Las Vegas");
		sa.add("Texas");
		sa.add("New york");
		
		List<String> na = new ArrayList<String>();
		na.add("California");
		na.add("chicago");
		na.add("philadelphia");
		
		Map<String, List<String>> usa = new HashMap<>();
		usa.put("South America", sa);
		usa.put("North America", na);
		
		/**World*/
		world.put("India", india);
		world.put("USA", usa);
	}
	public void getData()
	{
		Set<String> countrys = world.keySet();
		
		Iterator<String> itr= countrys.iterator();
		
		while(itr.hasNext())
		{
			String country = itr.next();
			System.out.println("**********"+country+"**********");
			
			Map<String, List<String>> state = world.get(country);
			
			Set<String> stateKeys = state.keySet();
			
			for (String statekey : stateKeys)
			{
				System.out.println("---------"+statekey+"----------");
				List<String> cities = state.get(statekey);
				
				for (String city : cities) 
				{
					System.out.println(city);
				}
				System.out.println("");
			}
			
		}
	}
	public static void main(String[] args) 
	{
		World_map wm = new World_map();
		wm.putData();
		wm.getData();
	}
}
