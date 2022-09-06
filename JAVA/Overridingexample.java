package com_2;

public class Overridingexample {
	public void display(){

		System.out.println("I am an animal");

		}

		}

		class Dog4 extends Overridingexample {

		// overriding method

		@Override

		public void display(){

		System.out.println("I am a dog");

		}

		public void printMessage(){

		// this calls overriding method

		display();

		// this calls overridden method

		super.display();

		}

		}

		class Main4 {

		public static void main(String[] args) {

		Dog4 dog1 = new Dog4();

		dog1.printMessage();

		}
}
