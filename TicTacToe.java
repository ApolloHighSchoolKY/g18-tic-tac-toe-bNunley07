//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;
//use CharAt()
	public TicTacToe()
	{
	mat = new char[3][3];
	for(int row = 0; row < mat.length; row++)
	{
		for(int col = 0; col < mat[0].length; col++)
		{
			if(col%2 ==0)
		mat[row][col] = 'X';

		mat[row][col] = 'O';
		}

	}

	}

	public TicTacToe(String game)
	{
		for(int row = 0; row < mat.length; row++)
		{
			for(int col = 0; col < mat[0].length; col++)
			{
				if(mat.CharAt(i))


			}

		}

//rowmajor order ehre

	}

	public String getWinner()
	{
		String winner = "";
		if(mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2]){
			return ""+ mat[0][0]+ " won";
		}
		else if(mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2]){
			return ""+ mat[1][0]+ " won";
		}
		else if(mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2]){
			return ""+ mat[2][0]+ " won";
		}
		else if(mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0]){
			return ""+ mat[0][0]+ " won";
		}
		else if(mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1]){
			return ""+ mat[0][1]+ " won";
		}
		else if(mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2]){
			return ""+ mat[0][2]+  " won";
		}
		else if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]){
			return ""+ mat[0][0]+  " won";
		}
		else if(mat[2][2] == mat[1][1] && mat[1][1] == mat[0][0]){
			return ""+ mat[2][2]+  " won";
		}
		else{
			return "cat tie game";
		}




		//return "";
	}

	public String toString()
	{
		String output="";


		System.out.println(mat);



		return output+"\n\n";
	}
}