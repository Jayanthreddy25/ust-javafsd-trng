package com_2;

public class Pattern {
	public void display() {

		for (int i = 0; i < 10; i++) {

		System.out.print("*");

		}

		}

		// method with single parameter

		public void display(char symbol) {

		for (int i = 0; i < 10; i++) {

		System.out.print(symbol);

		}

		}

		}

		class Main7 {

		public static void main(String[] args) {

		Pattern d1 = new Pattern();

		// call method without any argument

		d1.display();

		System.out.println("\n");

		// call method with a single argument

		d1.display('#');

		}
}
