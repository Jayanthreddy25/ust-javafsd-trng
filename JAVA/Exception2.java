package Exceptions;

class Superexception{
	void display() {
		System.out.println("Display Test");
	}
}
public class Exception2 extends Superexception {

	public static void main(String args[]) {
		
		Superexception s=new Superexception();
		
		Exception2 e=new Exception2();
		Superexception s1=new Exception2();
				Exception2 e1=(Exception2) new Superexception();
	}
}
