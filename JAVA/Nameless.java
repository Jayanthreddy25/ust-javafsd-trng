package Enum;
//Anonymous class example
abstract class Animal{
	abstract void Sound();
	
}
public class Nameless {

	public static void main(String[] args) {
		
		Animal a=new Animal() {
			
			void Sound() {
				System.out.println("Animal sound");
			}
		};
	
	a.Sound();
}
}
