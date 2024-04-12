package com.practice.Day79;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializeStudent {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("F:\\file1.txt");
			ObjectInputStream ois= new ObjectInputStream(fis);
			Object o = ois.readObject();
			Student st= (Student)o;
			System.out.println(st.id);
			System.out.println(st.name);
			System.out.println(st.address);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
