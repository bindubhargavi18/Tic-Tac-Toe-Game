package tictac;

import java.util.*;

public class TicTacToeGame 
{
	static char board[]=new char[10];
	//static String line=null;
	static char playerLetter,computerLetter,tossValue;
	static char r;
	static int playerPosition,computerPosition,flag=0;
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
			tictac.winner();
			//System.out.println(flag);
				if(flag==1)
				{
					System.out.println("Congratulations " + r + " won");
					break;
				}
					tictac.computerGame();
					tictac.winner();
					if(flag==1)
					{
						System.out.println("Congratulations " +r+ " won");
						break;
					}
					
			}
			else
			{
				tictac.computerGame();
				tictac.winner();
				if(flag==1)
				{
					System.out.println("Congratulations " +r+ " won");
					break;
				}
				tictac.playerGame();
				tictac.winner();
				if(flag==1)
				{
					System.out.println("Congratulations " +r+ " won");
					break;
				}
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
				board[playerPosition]=playerLetter;
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
				board[computerPosition]=computerLetter;
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
	public void winner()
	{
		
		if((board[1]=='x'&&board[2]=='x' &&board[3]=='x')||
				(board[1]=='o'&&board[2]=='o'&&board[3]=='o'))
		{
			r=board[1];
			flag=1;
		}	
		else if((board[4]=='x'&&board[5]=='x'&&board[6]=='x')||
				(board[4]=='o'&&board[5]=='o'&&board[6]=='o'))
		{
			r=board[4];
			flag=1;
		}
		else if((board[7]=='x'&&board[8]=='x'&&board[9]=='x')||
				(board[7]=='o'&&board[8]=='o'&&board[9]=='o'))
		{
			r=board[7];
			flag=1;
		}
		else if((board[1]=='x'&&board[4]=='x'&&board[7]=='x')||
				(board[1]=='o'&&board[4]=='o'&&board[7]=='o'))
		{
			r=board[1];
			flag=1;
		}
		else if((board[2]=='x'&&board[5]=='x'&&board[8]=='x')||(board[2]=='o'&&board[5]=='o'&&board[8]=='o'))
		{
			r=board[2];
			flag=1;
		}
		else if((board[3]=='x'&&board[6]=='x'&&board[9]=='x')||(board[3]=='o'&&board[6]=='o'&&board[9]=='o'))
		{
			r=board[3];
			flag=1;
		}
		else if((board[1]=='x'&&board[5]=='x'&&board[9]=='x')||(board[1]=='o'&&board[5]=='o'&&board[9]=='o'))
		{
			r=board[1];
			flag=1;
		}
		else if((board[3]=='x'&&board[5]=='x'&&board[7]=='x')||(board[3]=='o'&&board[5]=='o'&&board[7]=='o'))
		{
			r=board[3];
			flag=1;
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