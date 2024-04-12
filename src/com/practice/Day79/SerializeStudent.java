package com.practice.Day79;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeStudent implements Serializable {
	int id;
	String name;
	String address;
	
	
	public SerializeStudent(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public static void main(String[] args) {
		
		SerializeStudent s= new SerializeStudent(15,"Rushikesh","dkd");
		try {
			FileOutputStream fis= new FileOutputStream("F:\\file.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fis);
			oos.writeObject(s);
			System.out.println("Success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
