package assembler;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndParse 
{
	private ArrayList<String> code = new ArrayList<String>();
	
	public ReadAndParse() 
	{
	}
	
	public void Read(String fileName)
	{
		try
		{
			File file = new File(fileName);
			Scanner fileReader = new Scanner(file);
			
			while(fileReader.hasNext())
			{
				code.add(fileReader.next());
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		for(String value : code)
		{
			System.out.println(value);
		}
	}

}
