package Enum;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Jasonreador {

	public static void main(String[] args) {
		JSONParser p = new JSONParser();
		try 
		{
		Object o=p.parse(new FileReader("C:\\Users\\ustjavafsdb204\\Downloads\\student.json"));
		JSONObject obj=(JSONObject)o;
		String name=(String)obj.get("Name");
		long age=(long)obj.get("Age");
		System.out.println(name+"\n"+age);
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
}

}
