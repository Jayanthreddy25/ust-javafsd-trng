package com_1;

public class FinalDemo3 {
	public final void display() {

		System.out.println("This is a final method.");

		}

		}

		class Main_5 extends FinalDemo3 {

		// try to override final method

		public final void display1() {

		System.out.println("The final method is overridden.");

		}
		public static void main(String[] args) {

			Main_5 obj = new Main_5();

			obj.display1();

			}
}
