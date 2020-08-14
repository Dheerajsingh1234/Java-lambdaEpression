package com.lamdaExpression.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class personlist {
	public static void main(String []args)
	{
		List<Person> list=Arrays.asList(
							new Person("dheeraj","singh",21),
							new Person("krishna","singh",15),
							new Person("neha","Chouhan",13),
							new Person("raghu","chomu",22),
							new Person("pratika","dadhich",23));
		
		/*Collections.sort(list,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
					
					//o1.getLastName().cha
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		
		});*/
		
		Collections.sort(list,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		 lastnamefromstartwithc(list,p->true);   
		System.out.println("LastName start from  c");
		
		  /* lastnamefromstartwithc(list,new Condition()
				   {
			   				@Override
						   public boolean test(Person p) {
							   
						  return  p.getLastName().startsWith("c");
						   }
				   }
		   );*/
		  lastnamefromstartwithc(list,p->p.getLastName().startsWith("c"));
		   System.out.println("first name start from  k");
			
		  /* lastnamefromstartwithc(list,new Condition()
				   {
			   				@Override
						   public boolean test(Person p) {
							   
						  return  p.getName().startsWith("k");
						   }
				   }
		   );*/
		   lastnamefromstartwithc(list,p->p.getName().startsWith("k"));
		
			
	}

	private static void lastnamefromstartwithc(List<Person> list, Condition condition) {
		
		for(Person p:list)
		{
			
			if(condition.test(p))
			{
				System.out.println(p);
			}
		}
		// TODO Auto-generated method stub
		
	}

	
	interface Condition
	{

		boolean test(Person p);
		
	}
	

}