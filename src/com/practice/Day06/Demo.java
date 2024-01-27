package com.practice.Day06;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		//create Obj of linkedList
				LinkedList<String>list=new LinkedList<>();
				list.add("Java");
				list.add("Python");
				list.add("C++");
				list.add("Ruby");
				System.out.println("Programming languages are :: "+list);
				
				list.add(0, "Scala");
				System.out.println("Programming languages are :: "+list);

	}

}
