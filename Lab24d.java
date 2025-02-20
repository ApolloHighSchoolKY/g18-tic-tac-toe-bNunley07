//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));
		int x = file.nextInt();
		file.nextLine();
	
		for(int i = 0; i <x;i++)
		if(!file.hasNext())
		TicTacToe game = new TicTacToe(file.nextLine());
		 
	}

		//read how many times you should read
		//tiktak only wants file.nextLine()
		//make object for each

	}
	



