package com.practice.Day91;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class External_Sorting_project {
	public static void main(String[] args) {
		// code will start from main method
		String inputFileName = "numbers.txt"; // Replace with the actual input file name
		String outputFileName = "sorted_numbers.txt"; // Replace with the desired output file name

		ArrayList<Integer> numbers = readNumbersFromFile(inputFileName);
		if (numbers != null) {
			Collections.sort(numbers);
			if (writeNumbersToFile(outputFileName, numbers)) {
				System.out.println("Sorted numbers written to " + outputFileName);
			} else {
				System.out.println("Failed to write sorted numbers to file.");
			}
		} else {
			System.out.println("Failed to read numbers from file.");
		}
	}

	private static ArrayList<Integer> readNumbersFromFile(String fileName) {
		ArrayList<Integer> numbers = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				try {
					int number = Integer.parseInt(line);
					numbers.add(number);
				} catch (NumberFormatException e) {
					System.err.println("Invalid number found: " + line);
				}
			}
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
			return null;
		}

		return numbers;
	}

	private static boolean writeNumbersToFile(String fileName, ArrayList<Integer> numbers) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
			for (int number : numbers) {
				bw.write(Integer.toString(number));
				bw.newLine();
			}
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
			return false;
		}

		return true;
	}
}