package com_1;

public class This_construct {
	int val1;

	int val2;

	//Default constructor

	This_construct()

	{

	this(10, 20);

	System.out.println("Default constructor \n");

	}

	//Parameterized constructor

	This_construct(int val1, int val2)

	{

	this.val1 = val1;

	this.val2 = val2;

	System.out.println("Parameterized constructor");

	}

	}

	class Main_4{

	public static void main(String[] args)

	{

	This_construct object = new This_construct();
}
}