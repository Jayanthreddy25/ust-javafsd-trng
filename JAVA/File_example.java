package Exceptions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_example {

	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\ustjavafsdb204\\ABC.txt");
		
				try
				{
					
					byte[] b= "This iam writing to file.".getBytes();
					if(f.createNewFile())
					{
						FileOutputStream fstm=new FileOutputStream(f);
						System.out.println("New file created");
						fstm.write(b);
					}
					else {
						System.out.println("File exist.");
					}
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
	}
}

