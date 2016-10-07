package assembler;

import java.util.Scanner;

public class Main {

	public Main() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		ReadAndParse read  = new ReadAndParse();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter file name: ");
		read.Read(input.nextLine());

	}

}
