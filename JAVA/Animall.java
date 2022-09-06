package com_2;

public class Animall {
	public void displayInfo() {

		System.out.println("I am an animal.");

		}

		}

		class Dogg extends Animall {

		public void displayInfo() {

		super.displayInfo();

		System.out.println("I am a dog.");

		}

		}

		class Main_2 {

		public static void main(String[] args) {

		Dogg d1 = new Dogg();

		d1.displayInfo();

		}
		
}
