package com.ust;

public class Casting {
public static void main(String args[]) {
	int x=5;
	float y=5.5f;
	long l=10;
	double d=7.5;
	
	
	l=x; //up casting-implicitly done
	x=(int)l; //down casting
	y=(float)d; 
	d=y;
	
}
}
