package com_3;

public class Generics1<T> {
	
	T t;
	public T GET()
	{
		return t;
	}
	
	public void set(T t)
	{
		this.t=t;
	}
	
public static void main(String args[]) {
	
	
	Generics1<String> g=new Generics1<>();
	g.set("hi");
	System.out.println(g.GET());
	
	Generics1<Integer> gi=new Generics1<>();
	gi.set(100);
	System.out.println(gi.GET());
	
}
}

