package com.example1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Reference_map 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setData()
	{
		Student s1 = new Student();
		s1.setRollno(111);
		s1.setName("Vijay");
		
		Student s2 = new Student();
		s2.setRollno(222);
		s2.setName("Dhananjay");
		
		Employee e1 = new Employee();
		e1.setEmpid(1001);
		e1.setEmpname("Mukul Sir");
		
		Employee e2 = new Employee();
		e2.setEmpid(2002);
		e2.setEmpname("Umakant Sir");
		

		List li = new ArrayList();
		li.add(s1);
		li.add(s2);
		li.add(e1);
		li.add(e2);
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("reference", li);
		
		Set<String> keys = map.keySet();
		
		Iterator<String> itr = keys.iterator();
		
		while(itr.hasNext())
		{
			String key = itr.next();
			//System.out.println(key);
			
			List l1 = map.get(key);
			int count = 0;
			int count1 =0;
			for (Object obj : l1)
			{
				
				if (obj instanceof Student) 
				{
					
					
					if(count == 0)
					{
						count++;
					System.out.println("......Student......");
					}
					Student stu = (Student)obj;
					System.out.println(stu.getRollno());
					System.out.println(stu.getName());
					
				}
				else if (obj instanceof Employee)
				{
					
					if(count1 == 0)
					{
						count1++;
					System.out.println("......Employee.....");
					}
					Employee emp = (Employee)obj;
					System.out.println(emp.getEmpid());
					System.out.println(emp.getEmpname());
					
				}
				System.out.println("");
			}

		}
		
		
	}
	
	public static void main(String[] args)
	{
		Reference_map rm = new Reference_map();
		
		rm.setData();
		//rm.getData();
		
	}
}
