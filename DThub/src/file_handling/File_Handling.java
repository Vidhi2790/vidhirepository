package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Handling 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("../DThub/src/input.txt");
		FileReader fr =new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
		
		
	}
}
