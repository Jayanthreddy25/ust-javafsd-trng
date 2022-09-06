package com_2;

public class Protected {
	protected String name;

	protected void display() {

	System.out.println("I am an animal.");

	}

	}

	class Dog9 extends Protected {

	public void getInfo() {

	System.out.println("My name is " + name);

	}

	}

	class Main_7 {

	public static void main(String[] args) {

	// create an object of the subclass

	Dog9 labrador = new Dog9();

	// access protected field and method

	// using the object of subclass

	labrador.name = "Rocky";

	labrador.display();

	labrador.getInfo();

	}
}
