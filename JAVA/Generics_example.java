package com_3;

public class Generics_example<T,U> {
	T obj1;
	U obj2;
	
	Generics_example(T obj1,U obj2)
	{
		
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void print()
	{
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
	}

class Main{
	public static void main(String args[]) {
		Generics_example<String,Integer>obj=new Generics_example<String,Integer>("GfG",15);
		
		obj.print();
		}
}
