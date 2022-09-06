package com_2;

abstract public class Barkbark {
	abstract void makeSound();

	public void eat() {

	System.out.println("I can eat.");

	}

	}

	class Dog_8 extends Barkbark {

	// provide implementation of abstract method

	public void makeSound() {

	System.out.println("Bark bark");

	}

	}

	class Main_8 {

	public static void main(String[] args) {

	// create an object of Dog class

	Dog_8 d1 = new Dog_8();

	d1.makeSound();

	d1.eat();

	}
}
