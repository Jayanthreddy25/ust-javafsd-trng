package com_3;
import java.util.ArrayList;

public class Liststring_example {
public static void main(String args[]) {
	ArrayList<String>languages=new ArrayList<>();
	
	languages.add("Java");
	languages.add("kotlin");
	languages.add("c++");
	System.out.println("ArrayList:"+languages);
	languages.set(2, "JavaScript");
	System.out.println("modified Arraylist:"+languages);
}
}
