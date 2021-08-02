package tictac;

import java.util.Scanner;

public class TicTacToeGame 
{
	static final char board[]=new char[10];
	public static void main(String[] args) 
	{
		TicTacToeGame tictac=new TicTacToeGame();
		tictac.playerComputerLetter();
		tictac.showBoard();
	}	
	public void playerComputerLetter()
	{
		char playerLetter,computerLetter;
		Scanner s=new Scanner(System.in);
		System.out.println("Choose a letter x or o:");	
		playerLetter=s.next().charAt(0);
		while(!(playerLetter=='x' || playerLetter=='o'))
		{
			System.out.println("Enter valid user input:");
			playerLetter=s.next().charAt(0);
		}
		s.close();
		if(playerLetter=='x')
		{
			computerLetter='o';
			System.out.println("computer letter: "+computerLetter+" \nPlayer Letter: "+playerLetter);
		}
		else if(playerLetter=='o')
		{
			computerLetter='x';
			System.out.println("computer letter: "+computerLetter+" \nPlayer Letter: "+playerLetter);
		}	
	}
	public void showBoard()
	{
		int i;
		for(i=1;i<10;i++)
		{
		  board[i]='-';
		}
		System.out.println(board[1]+" "+board[2]+" "+board[3]);
		System.out.println(board[4]+" "+board[5]+" "+board[6]);
		System.out.println(board[7]+" "+board[8]+" "+board[9]);
	}
}

			
	


