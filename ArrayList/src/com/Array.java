package com;

import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		numbers.remove(2);
		numbers.set(1, 100);
		
		System.out.println("Elements in the ArrayList:");
		for (int num : numbers) {
			System.out.println(num);
		}
	}
}

