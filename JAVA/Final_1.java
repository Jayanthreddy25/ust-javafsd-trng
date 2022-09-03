package com.ust;

public class Final_1 extends Super1 {
final int x=5;
int y;

/**void display() {
	System.out.println("in final");
	)
}*/
public static void main(String args[]) {
	Final_1 s=new Final_1();
	//s.x=7;
	s.y=10;
	System.out.println(s.z);
	//System.out.println(s.display());
	s.display();
}
}




class Super1{
	final int z=10;
	final void display() {
		System.out.println("in display");
		
	}

void display(int x) {
	System.out.println("*");
	
}
}