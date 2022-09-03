package com.ust;

public class Example {
public static void main(String args[]) {
	//declaring character
	char a='G';
	
	//integer data type is generally used for numeric values
	int i=89;
	
	//use byte and short if memory is a constraint
	byte b=4;
	
	//this will give error as number is larger than byte range
	//byte b1=7888888955;
	
	short s=56;
	
	//this will give error as number is shorter than short range
	//short s1=87878787878;
	
	//by default fraction value is double in java
	double d=4.355453532;
	
	//for float use f as suffix
	float f=4.7333434f;
	
	System.out.println("char:"+ a);
	System.out.println("int:"+ i);
	System.out.println("bite:"+ b);
	System.out.println("short:"+ s);
	System.out.println("double:"+ d);
	System.out.println("float:"+ f);
	
}
}
