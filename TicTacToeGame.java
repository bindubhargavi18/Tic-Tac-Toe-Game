package tictac;

import java.util.*;

public class TicTacToeGame 
{
	static final char board[]=new char[10];
	static char playerLetter,computerLetter,tossValue;
	int playerPosition,computerPosition;
	Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		TicTacToeGame tictac=new TicTacToeGame();
		tictac.playerComputerLetter();
		tictac.gameBoard();
		tictac.toss();
		for(int i=1;i<10;i++)
		{
			if(tossValue=='H')
			{
			tictac.playerGame();
			tictac.computerGame();
			}
			else
			{
				tictac.computerGame();
				tictac.playerGame();
			}
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
		//s.close();
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
	public void playerGame()
	{	
	    for(int i=1;i<10;i++)
	    {
			System.out.println("Enter position in which player wants to play: ");
			playerPosition=s.nextInt();	
			if(board[playerPosition]=='-')
			{
				board[playerPosition]='x';
				TicTacToeGame tictac=new TicTacToeGame();
				tictac.showBoard();
				break;
			}	
		}
	}
	public void computerGame()
	{
	    for(int i=1;i<10;i++)
	    {
			Random r=new Random();
			computerPosition=r.nextInt(8)+1;
			System.out.println("computer Position "+computerPosition);
			if(board[computerPosition]=='-')
			{
				board[computerPosition]='o';
				TicTacToeGame tictac=new TicTacToeGame();
				tictac.showBoard();
				break;
			}
			
		}    
	}
	public void toss()
	{
		double flip=Math.random();
		if(flip<0.5)
		{
			tossValue='H';
			System.out.println("player won toss, Player starts first");
		}
		
		else
		{
			tossValue='T';
			System.out.println("computer won toss, computer starts first");
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