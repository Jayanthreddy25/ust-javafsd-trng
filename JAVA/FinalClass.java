package com_1;

public class FinalClass {
	public void display() {

		System.out.println("This is a final method.");

		}

		}

		// try to extend the final class

		class Main_6 extends FinalClass {

		public void display() {

		System.out.println("The final method is overridden.");

		}

		public static void main(String[] args) {

		Main_6 obj = new Main_6();

		obj.display();

		}
}
