import org.junit.jupiter.api.Test;
//this is functional interface

@FunctionalInterface

interface MyInterface{

//abstract method

double getPiValue();

}
public class Main {
	public static void main(String args[]) {
	

			MyInterface ref;

			// lambda expression

			ref = () -> 3.1415;

			System.out.println("Value of Pi = " + ref.getPiValue());

		}
	}


