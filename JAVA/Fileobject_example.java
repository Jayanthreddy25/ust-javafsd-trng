package Exceptions;

import java.io.File;

public class Fileobject_example {

	public static void main(String[] args) {


		File file = new File("C:\\Users\\Guest User\\Desktop\\Java File\\List Method");

		
		String[] fileList = file.list();

		for(String str : fileList) {

		System.out.println(str);

		}

		}
}
