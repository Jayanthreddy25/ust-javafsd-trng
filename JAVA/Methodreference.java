package Methodreference;

interface Sayable{

void say();

}


public class Methodreference {
	
	
		public static void saySomething(){

		System.out.println("Hello, this is static method.");

		}

		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

			// Referring static method

			Sayable sayable = Methodreference::saySomething;

			// Calling interface method

			sayable.say();

			}

	}


