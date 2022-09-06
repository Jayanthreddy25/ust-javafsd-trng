package com_2;

public class Thisexample {

	int a;
	int b;
	
	Thisexample()
	{
		a=10;
		b=20;
		
	}
	Thisexample get()
	{
		return this;
	}
	
	void display()
	{
		System.out.println("a="+a+"b="+b);
	}
	public static void main(String args[]) {
		Thisexample object = new Thisexample();
		object.get().display();
	}
}
