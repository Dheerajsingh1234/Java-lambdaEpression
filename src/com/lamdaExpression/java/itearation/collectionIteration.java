package com.lamdaExpression.java.itearation;

import java.util.Arrays;
import java.util.List;

import com.lamdaExpression.java.Person;

public class collectionIteration  {
	public static void main(String []args)
	{
		List<Person> list=Arrays.asList(
							new Person("dheeraj","singh",21),
							new Person("krishna","singh",15),
							new Person("neha","Chouhan",13),
							new Person("raghu","chomu",22),
							new Person("pratika","dadhich",23));
		System.out.println("print using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("using for each");
		for(Person p:list)
		{
			System.out.println(p);
		}
		System.out.println("using lamda expression");
		list.forEach(p->System.out.println(p));
		System.out.println("using method expression");
		list.forEach(System.out::println);
	
	}
	
	
}
