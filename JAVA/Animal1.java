package com_2;

public class Animal1 {
	protected String type="animal";

	}

	class Dog6 extends Animal1 {

	public String type="mammal";

	public void printType() {

	System.out.println("I am a " + type);

	System.out.println("I am an " + super.type);

	}

	}

	class Main6 {

	public static void main(String[] args) {

	Dog6 dog1 = new Dog6();

	dog1.printType();

	}
}
