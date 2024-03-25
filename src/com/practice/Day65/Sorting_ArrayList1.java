package com.practice.Day65;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_ArrayList1 {
	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(430);
	      list.add(220);
	      list.add(112);
	      list.add(677);
	      list.add(439);
	      list.add(905);
	      System.out.println("Before Sorting : " + list);
	      
	      // sorting in ascending order
	      Collections.sort(list);
	      System.out.println("Sorting  in ascending order: " + list);
	      
	      // sorting in descending order
	      Collections.sort(list, Collections.reverseOrder());
	      System.out.println("Sorting  in descending order: " + list);
	}
}
