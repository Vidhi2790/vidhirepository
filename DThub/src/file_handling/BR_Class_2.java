package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BR_Class_2 {
	public void readDatafromrange(int a,int c) throws IOException
	{String s;int b = 0;
	File f=new File("../DThub/src/input.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	while((s=br.readLine())!=null)
	{    b=b+1;
	if(b==a || b<=c)
	{
				
			System.out.println(s);
		
		
	}}
	}
	public static void main(String[] args) throws IOException {
		BR_Class_2 obj=new BR_Class_2();
		obj.readDatafromrange(2, 5);
	}

}

