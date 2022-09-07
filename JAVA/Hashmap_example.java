package com_3;
import java.util.Map;
import java.util.HashMap;

public class Hashmap_example {
public static void main(String args[]) {
	Map<String, Integer> numbers=new HashMap<>();
	numbers.put("One", 2);
	numbers.put("Two", 2);
	System.out.println("map:"+numbers);
	System.out.println("values:"+numbers.values());
	System.out.println("Entries:"+numbers.entrySet());
	int value=numbers.remove("Two");
	System.out.println("Removed value:"+ value);
}
}
