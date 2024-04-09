package com.practice.Day77;

class Person{
	private String name;
	private Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
public class Encapsulation_Example {
	
	public static void main(String[] args) {
	Person p= new Person();
	p.setName("Rajiv");
	p.setId(1);
	System.out.println(p.getId()+" "+p.getName());
	}
}
