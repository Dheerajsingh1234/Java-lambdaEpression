package com.lamdaExpression.java;

public class Person {
	private String name;
	private String LastName;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FirstName"+name+"LastName"+LastName+"Age"+age;
	}
	public Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.LastName = lastName;
		this.age = age;
	}
	
				
}
