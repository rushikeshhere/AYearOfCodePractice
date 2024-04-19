package com.practice.Day84;

public class Static_Variables {
	int id;
	String name;
	static String clgName = "Yeshwant collage Nanded";

	public Static_Variables(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("Id : " + id + ", Student Name : " + name + ", Collage Name : " + clgName);
	}

	public static void main(String[] args) {
		Static_Variables sv = new Static_Variables(111, "Somesh");
		Static_Variables sv1 = new Static_Variables(222, "Rakesh");
		sv.display();
		sv1.display();
	}	
}
