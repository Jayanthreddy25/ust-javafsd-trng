package Exceptions;

import java.io.FileReader;

public class FileReader_example {

	public static void main(String[] args) {

		char[] array = new char[100];

		try {

		// Creates a reader using the FileReader

		FileReader input = new FileReader("C:\\Users\\ustjavafsdb204\\input.txt");

		// Reads characters

		input.read(array);

		System.out.println("Data in the file:");
		
		System.out.println(array);

		// Closes the reader

		input.close();

		}

		catch(Exception e) {

		e.getStackTrace();

		}

		}
}
