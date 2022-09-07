package com_3;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistiterator {
	public static void main(String[] args) {


		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);

		numbers.add(3);

		numbers.add(2);

		System.out.println("ArrayList: " + numbers);


		Iterator<Integer> iterate = numbers.iterator();


		int number = iterate.next();

		System.out.println("Accessed Element: " + number);


		iterate.remove();

		System.out.println("Removed Element: " + number);

		System.out.print("Updated ArrayList: ");

		
		while(iterate.hasNext()) {


		iterate.forEachRemaining((value) -> System.out.print(value + ", "));

		}

		}
}
