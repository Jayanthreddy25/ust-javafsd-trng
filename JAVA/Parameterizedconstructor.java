package com_2;

public class Parameterizedconstructor {
	Parameterizedconstructor() {

		System.out.println("I am an animal");

		}

		// parameterized constructor

	Parameterizedconstructor(String type) {

		System.out.println("Type: "+type);

		}

		}

		class Dog7 extends Parameterizedconstructor {

		// default constructor

		Dog7() {

		// calling parameterized constructor of the superclass

		super("Animal");

		System.out.println("I am a dog");

		}

		}

		class Main8 {

		public static void main(String[] args) {

		Dog7 dog1 = new Dog7();

		}
}
