package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BRClass {
	public void read(int a) throws IOException
	{String s;int b = 0;
	File f=new File("../DThub/src/input.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	while((s=br.readLine())!=null)
	{    b=b+1;
	if(b==a)
	{
		System.out.println(s);
	}}
	}
	public static void main(String[] args) throws IOException {
		BRClass obj=new BRClass();
		obj.read(3);
	}

}
