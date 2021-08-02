package tictac;

public class TicTacToeGame 
{
	static final char board[]=new char[10];
	public static void main(String[] args) 
	{
		TicTacToeGame tictac=new TicTacToeGame();
		tictac.gameBoard();
	}
	public void gameBoard()
	{
		int i;
		for(i=1;i<10;i++)
		{
		  board[i]=' ';
		}
		System.out.println(board[1]+" "+board[2]+" "+board[3]);
		System.out.println(board[4]+" "+board[5]+" "+board[6]);
		System.out.println(board[7]+" "+board[8]+" "+board[9]);
	}
}
