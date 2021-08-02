package tictac;

import java.util.*;

public class TicTacToeGame 
{
	static final char board[]=new char[10];
	char playerLetter,computerLetter;
	int playerPosition,computerPosition;
	Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		TicTacToeGame tictac=new TicTacToeGame();
		tictac.playerComputerLetter();
		tictac.gameBoard();
		for(int i=1;i<10;i++)
		{
			tictac.desiredLocation();
			tictac.showBoard();
		}
	}	
	public void playerComputerLetter()
	{
		System.out.println("Choose a letter x or o:");	
		playerLetter=s.next().charAt(0);
		while(!(playerLetter=='x' || playerLetter=='o'))
		{
			System.out.println("Enter valid user input:");
			playerLetter=s.next().charAt(0);
		}
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
	public void desiredLocation()
	{
			
	    for(int i=1;i<10;i++)
	    {
			System.out.println("Enter position in which player wants to play: ");
			playerPosition=s.nextInt();	
			System.out.println("player position: "+playerPosition);
			Random r=new Random();
			computerPosition=r.nextInt(8)+1;
			System.out.println("computer Position "+computerPosition);	
		}    
	}
	public void showBoard()
	{
			System.out.println(board[1]+" "+board[2]+" "+board[3]);
			System.out.println(board[4]+" "+board[5]+" "+board[6]);
			System.out.println(board[7]+" "+board[8]+" "+board[9]);
		
	}
	public void gameBoard()
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

			
	


