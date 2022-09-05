package com_1;

public class Animal2 {

	protected String type="animal";

	}

	class Dog2 extends Animal2 {

	public String type="mammal";

	public void printType1() {

	System.out.println("I am a " + type);

	System.out.println("I am an " + super.type);

	}

	}
	
	class Main4 {

		public static void main(String[] args) {

		Dog2 dog1 = new Dog2();

		dog1.printType1();

		}
}
