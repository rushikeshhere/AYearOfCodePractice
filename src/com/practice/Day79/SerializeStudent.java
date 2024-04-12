package com.practice.Day79;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeStudent implements Serializable {

	public static void main(String[] args) {

		Student st = new Student(15, "Rushikesh", "dkd");
		try {
			FileOutputStream fis = new FileOutputStream("F:\\file1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(st);
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
