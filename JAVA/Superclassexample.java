package com_2;

public class Superclassexample {
	public void eat() {

		System.out.println("I can eat");

		}

		}

		// Dog inherits Animal

		class Dog_6 extends Superclassexample {

		// overriding the eat() method

		@Override

		public void eat() {

		// call method of superclass

		super.eat();

		System.out.println("I eat dog food");

		}

		// new method in subclass

		public void bark() {

		System.out.println("I can bark");

		}

		}

		class Main_5 {

		public static void main(String[] args) {

		// create an object of the subclass

		Dog_6 labrador = new Dog_6();

		// call the eat() method

		labrador.eat();

		labrador.bark();
}
		}