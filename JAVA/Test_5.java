package com.ust;

public class Test_5 {
public static void main(String args[]) {
	byte a=126;
	
	//byte is 8 bit value
	System.out.println(a);
	
	a++;
	System.out.println(a);
	
	//it over flows because byte can hold valus from -126 to 127
	a++;
	System.out.println(a);
	
	//Looping back within the range
	a++;
	System.out.println(a);
}
}
