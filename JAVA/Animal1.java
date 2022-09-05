package com_1;

public class Animal1 {
	public void display(){

		System.out.println("I am an animal");

		}

		}

		class Dog1 extends Animal {

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

		class Main3 {

		public static void main(String[] args) {

		Dog dog1 = new Dog();

		dog1.printMessage();

		}
}
