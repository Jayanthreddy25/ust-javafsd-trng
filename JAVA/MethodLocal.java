package Enum;

public class MethodLocal {
void display() {
	int x=5;
	
	class MethodInner{
		void display1() {
			System.out.println("in method local");
			
		}
	}
	MethodInner i=new MethodInner();
	i.display1();
}//method ends
public static void main(String[] args) {
	MethodLocal n=new MethodLocal();
	n.display();
	System.out.println("outer class");
}
}
