package com.practice.Day79;

import java.io.Serializable;

public class Student  implements Serializable{
	int id;
	String name;
	String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	

}
