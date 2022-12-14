package com_3;
import java.util.Map;
import java.util.TreeMap;
public class Treemap_example {
	public static void main(String[] args) {

		// Creating Map using TreeMap

		Map<String, Integer> values = new TreeMap<>();

		// Insert elements to map

		values.put("Second", 2);

		values.put("First", 1);

		System.out.println("Map using TreeMap: " + values);
		
		values.replace("First", 11);

		values.replace("Second", 22);

		System.out.println("New Map: " + values);

		// Remove elements from the map

		int removedValue = values.remove("First");

		System.out.println("Removed Value: " + removedValue);

		}
}
