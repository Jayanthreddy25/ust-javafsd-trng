package com_2;

public class Animalll {
	protected void displayInfo() {

		System.out.println("I am an animal.");

		}

		}

		class Dog3 extends Animalll {

		public void displayInfo() {
			System.out.println("I am a dog.");

		}

		}

		class Main_3 {

		public static void main(String[] args) {

		Dog3 d1 = new Dog3();

		d1.displayInfo();

		}
		}

