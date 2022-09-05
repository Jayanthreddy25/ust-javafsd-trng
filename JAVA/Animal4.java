package com_1;

public class Animal4 {
	Animal4() {

		System.out.println("I am an animal");

		}
	Animal4(String type) {

		System.out.println("Type: "+type);

		}

		}

		class Dog5 extends Animal4 {

		// default constructor

		Dog5() {

		// calling parameterized constructor of the superclass

		super("Animal");

		System.out.println("I am a dog");

		}

		}

		class Main6 {

		public static void main(String[] args) {

		Dog dog5 = new Dog();

		}
}
