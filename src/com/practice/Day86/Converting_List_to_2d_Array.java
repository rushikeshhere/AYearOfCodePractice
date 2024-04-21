package com.practice.Day86;

import java.util.Arrays;
import java.util.List;

public class Converting_List_to_2d_Array {
	public static void main(String[] args) {
		List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(7, 8, 5), Arrays.asList(4, 3, 22),
				Arrays.asList(4, 3, 7));

		int[][] array = listOfList.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray())
				.toArray(int[][]::new);

		System.out.println("2D array: " + Arrays.deepToString(array));
	}
}
