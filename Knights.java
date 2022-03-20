
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int knights=sc.nextInt();
		boolean[][] board=new boolean[knights][knights];
		knight(board,0,0,knights);
	}
	
	private static void knight(boolean[][] board,int row,int col,int k)
	{
	    if(k==0)
	    {
	        display(board);
	        System.out.println();
	        return;
	    }
	    
	    
	    if(row==board.length-1 && col==board.length)
	    return;
	    
	    if(col == board.length)
	    {
	        knight(board,row+1,0,k);
	        return;
	    }
	    if(isSafe(board,row,col))
	    {
	        board[row][col]=true;
	        knight(board,row,col+1,k-1);
	        board[row][col]=false;
	    }
	    knight(board,row,col+1,k);
	    return;
	}
	
	static boolean isSafe(boolean[][] board,int row,int col)
	{
	    if(isValid(board,row-2,col-1))
	    {
	        if(board[row-2][col-1])
	        return false;
	    }
	    
	    if(isValid(board,row-1,col-2))
	    {
	        if(board[row-1][col-2])
	        return false;
	    }
	    
	    if(isValid(board,row-2,col+1))
	    {
	        if(board[row-2][col+1])
	        return false;
	    }
	    
	    if(isValid(board,row-1,col+2))
	    {
	        if(board[row-1][col+2])
	        return false;
	    }
	    return true;
	}
	
	static boolean isValid(boolean[][] board,int row,int col)
	{
	    if(row>=0 && row<board.length && col>=0 && col<board.length)
	    return true;
	    return false;
	}
	
	static void display(boolean[][] board)
	{
	    for(boolean[] row:board)
	    {
	        for(boolean element:row)
	        {
	            if(element)
	            System.out.print("K ");
	            else
	            System.out.print("X ");
	        }
	        System.out.println();
	    }
	}
}

OUTPUT:

4
K K K K 
X X X X 
X X X X 
X X X X 

K K K X 
X K X X 
X X X X 
X X X X 

K K K X 
X X X X 
X X X X 
K X X X 

K K K X 
X X X X 
X X X X 
X K X X 

K K K X 
X X X X 
X X X X 
X X K X 

K K K X 
X X X X 
X X X X 
X X X K 

K K X K 
K X X X 
X X X X 
X X X X 

K K X K 
X X X X 
X X X K 
X X X X 

K K X K 
X X X X 
X X X X 
K X X X 

K K X K 
X X X X 
X X X X 
X K X X 

K K X K 
X X X X 
X X X X 
X X K X 

K K X K 
X X X X 
X X X X 
X X X K 

K K X X 
K K X X 
X X X X 
X X X X 

K K X X 
K X X X 
X X X K 
X X X X 

K K X X 
K X X X 
X X X X 
K X X X 

K K X X 
K X X X 
X X X X 
X X K X 

K K X X 
K X X X 
X X X X 
X X X K 

K K X X 
X K X X 
X X X X 
X K X X 

K K X X 
X K X X 
X X X X 
X X X K 

K K X X 
X X X X 
X X X K 
K X X X 

K K X X 
X X X X 
X X X K 
X X K X 

K K X X 
X X X X 
X X X K 
X X X K 

K K X X 
X X X X 
X X X X 
K K X X 

K K X X 
X X X X 
X X X X 
K X K X 

K K X X 
X X X X 
X X X X 
K X X K 

K K X X 
X X X X 
X X X X 
X K K X 

K K X X 
X X X X 
X X X X 
X K X K 

K K X X 
X X X X 
X X X X 
X X K K 

K X K K 
X X X K 
X X X X 
X X X X 

K X K K 
X X X X 
K X X X 
X X X X 

K X K K 
X X X X 
X X X X 
K X X X 

K X K K 
X X X X 
X X X X 
X K X X 

K X K K 
X X X X 
X X X X 
X X K X 

K X K K 
X X X X 
X X X X 
X X X K 

K X K X 
X K X K 
X X X X 
X X X X 

K X K X 
X K X X 
K X X X 
X X X X 

K X K X 
X K X X 
X X K X 
X X X X 

K X K X 
X K X X 
X X X X 
X K X X 

K X K X 
X K X X 
X X X X 
X X X K 

K X K X 
X X X K 
K X X X 
X X X X 

K X K X 
X X X K 
X X K X 
X X X X 

K X K X 
X X X K 
X X X X 
K X X X 

K X K X 
X X X K 
X X X X 
X K X X 

K X K X 
X X X K 
X X X X 
X X X K 

K X K X 
X X X X 
K X K X 
X X X X 

K X K X 
X X X X 
K X X X 
K X X X 

K X K X 
X X X X 
K X X X 
X K X X 

K X K X 
X X X X 
K X X X 
X X X K 

K X K X 
X X X X 
X X K X 
X K X X 

K X K X 
X X X X 
X X K X 
X X K X 

K X K X 
X X X X 
X X K X 
X X X K 

K X K X 
X X X X 
X X X X 
K K X X 

K X K X 
X X X X 
X X X X 
K X K X 

K X K X 
X X X X 
X X X X 
K X X K 

K X K X 
X X X X 
X X X X 
X K K X 

K X K X 
X X X X 
X X X X 
X K X K 

K X K X 
X X X X 
X X X X 
X X K K 

K X X K 
K X X K 
X X X X 
X X X X 

K X X K 
K X X X 
K X X X 
X X X X 

K X X K 
K X X X 
X X X K 
X X X X 

K X X K 
K X X X 
X X X X 
K X X X 

K X X K 
K X X X 
X X X X 
X X K X 

K X X K 
K X X X 
X X X X 
X X X K 

K X X K 
X X X K 
K X X X 
X X X X 

K X X K 
X X X K 
X X X K 
X X X X 

K X X K 
X X X K 
X X X X 
K X X X 

K X X K 
X X X K 
X X X X 
X K X X 

K X X K 
X X X K 
X X X X 
X X X K 

K X X K 
X X X X 
K X X K 
X X X X 

K X X K 
X X X X 
K X X X 
K X X X 

K X X K 
X X X X 
K X X X 
X K X X 

K X X K 
X X X X 
K X X X 
X X X K 

K X X K 
X X X X 
X X X K 
K X X X 

K X X K 
X X X X 
X X X K 
X X K X 

K X X K 
X X X X 
X X X K 
X X X K 

K X X K 
X X X X 
X X X X 
K K X X 

K X X K 
X X X X 
X X X X 
K X K X 

K X X K 
X X X X 
X X X X 
K X X K 

K X X K 
X X X X 
X X X X 
X K K X 

K X X K 
X X X X 
X X X X 
X K X K 

K X X K 
X X X X 
X X X X 
X X K K 

K X X X 
K K X K 
X X X X 
X X X X 

K X X X 
K K X X 
K X X X 
X X X X 

K X X X 
K K X X 
X X X X 
X X X K 

K X X X 
K X X K 
K X X X 
X X X X 

K X X X 
K X X K 
X X X K 
X X X X 

K X X X 
K X X K 
X X X X 
K X X X 

K X X X 
K X X K 
X X X X 
X X X K 

K X X X 
K X X X 
K X X K 
X X X X 

K X X X 
K X X X 
K X X X 
K X X X 

K X X X 
K X X X 
K X X X 
X X X K 

K X X X 
K X X X 
X X X K 
K X X X 

K X X X 
K X X X 
X X X K 
X X K X 

K X X X 
K X X X 
X X X K 
X X X K 

K X X X 
K X X X 
X X X X 
K X K X 

K X X X 
K X X X 
X X X X 
K X X K 

K X X X 
K X X X 
X X X X 
X X K K 

K X X X 
X K X K 
K X X X 
X X X X 

K X X X 
X K X K 
X X K X 
X X X X 

K X X X 
X K X K 
X X X X 
X K X X 

K X X X 
X K X K 
X X X X 
X X X K 

K X X X 
X K X X 
K X K X 
X X X X 

K X X X 
X K X X 
K X X X 
X K X X 

K X X X 
X K X X 
K X X X 
X X X K 

K X X X 
X K X X 
X X K X 
X K X X 

K X X X 
X K X X 
X X K X 
X X X K 

K X X X 
X K X X 
X X X X 
X K X K 

K X X X 
X X X K 
K X K X 
X X X X 

K X X X 
X X X K 
K X X K 
X X X X 

K X X X 
X X X K 
K X X X 
K X X X 

K X X X 
X X X K 
K X X X 
X K X X 

K X X X 
X X X K 
K X X X 
X X X K 

K X X X 
X X X K 
X X K K 
X X X X 

K X X X 
X X X K 
X X K X 
X K X X 

K X X X 
X X X K 
X X K X 
X X X K 

K X X X 
X X X K 
X X X K 
K X X X 

K X X X 
X X X K 
X X X K 
X X X K 

K X X X 
X X X K 
X X X X 
K K X X 

K X X X 
X X X K 
X X X X 
K X X K 

K X X X 
X X X K 
X X X X 
X K X K 

K X X X 
X X X X 
K X K K 
X X X X 

K X X X 
X X X X 
K X K X 
X K X X 

K X X X 
X X X X 
K X K X 
X X X K 

K X X X 
X X X X 
K X X K 
K X X X 

K X X X 
X X X X 
K X X K 
X X X K 

K X X X 
X X X X 
K X X X 
K K X X 

K X X X 
X X X X 
K X X X 
K X X K 

K X X X 
X X X X 
K X X X 
X K X K 

K X X X 
X X X X 
X X K K 
X X K X 

K X X X 
X X X X 
X X K K 
X X X K 

K X X X 
X X X X 
X X K X 
X K K X 

K X X X 
X X X X 
X X K X 
X K X K 

K X X X 
X X X X 
X X K X 
X X K K 

K X X X 
X X X X 
X X X K 
K X K X 

K X X X 
X X X X 
X X X K 
K X X K 

K X X X 
X X X X 
X X X K 
X X K K 

K X X X 
X X X X 
X X X X 
K K K X 

K X X X 
X X X X 
X X X X 
K K X K 

K X X X 
X X X X 
X X X X 
K X K K 

K X X X 
X X X X 
X X X X 
X K K K 

X K K K 
X X K X 
X X X X 
X X X X 

X K K K 
X X X X 
X X X X 
K X X X 

X K K K 
X X X X 
X X X X 
X K X X 

X K K K 
X X X X 
X X X X 
X X K X 

X K K K 
X X X X 
X X X X 
X X X K 

X K K X 
X K K X 
X X X X 
X X X X 

X K K X 
X K X X 
X X X X 
X K X X 

X K K X 
X K X X 
X X X X 
X X X K 

X K K X 
X X K X 
X X X X 
K X X X 

X K K X 
X X K X 
X X X X 
X X K X 

X K K X 
X X X X 
X X X X 
K K X X 

X K K X 
X X X X 
X X X X 
K X K X 

X K K X 
X X X X 
X X X X 
K X X K 

X K K X 
X X X X 
X X X X 
X K K X 

X K K X 
X X X X 
X X X X 
X K X K 

X K K X 
X X X X 
X X X X 
X X K K 

X K X K 
K X K X 
X X X X 
X X X X 

X K X K 
K X X X 
X K X X 
X X X X 

X K X K 
K X X X 
X X X K 
X X X X 

X K X K 
K X X X 
X X X X 
K X X X 

X K X K 
K X X X 
X X X X 
X X K X 

X K X K 
K X X X 
X X X X 
X X X K 

X K X K 
X X K X 
X K X X 
X X X X 

X K X K 
X X K X 
X X X K 
X X X X 

X K X K 
X X K X 
X X X X 
K X X X 

X K X K 
X X K X 
X X X X 
X X K X 

X K X K 
X X X X 
X K X K 
X X X X 

X K X K 
X X X X 
X K X X 
K X X X 

X K X K 
X X X X 
X K X X 
X K X X 

X K X K 
X X X X 
X K X X 
X X K X 

X K X K 
X X X X 
X X X K 
K X X X 

X K X K 
X X X X 
X X X K 
X X K X 

X K X K 
X X X X 
X X X K 
X X X K 

X K X K 
X X X X 
X X X X 
K K X X 

X K X K 
X X X X 
X X X X 
K X K X 

X K X K 
X X X X 
X X X X 
K X X K 

X K X K 
X X X X 
X X X X 
X K K X 

X K X K 
X X X X 
X X X X 
X K X K 

X K X K 
X X X X 
X X X X 
X X K K 

X K X X 
K K K X 
X X X X 
X X X X 

X K X X 
K K X X 
X K X X 
X X X X 

X K X X 
K K X X 
X X X X 
X X X K 

X K X X 
K X K X 
X K X X 
X X X X 

X K X X 
K X K X 
X X X K 
X X X X 

X K X X 
K X K X 
X X X X 
K X X X 

X K X X 
K X K X 
X X X X 
X X K X 

X K X X 
K X X X 
X K X K 
X X X X 

X K X X 
K X X X 
X K X X 
K X X X 

X K X X 
K X X X 
X K X X 
X X K X 

X K X X 
K X X X 
X X X K 
K X X X 

X K X X 
K X X X 
X X X K 
X X K X 

X K X X 
K X X X 
X X X K 
X X X K 

X K X X 
K X X X 
X X X X 
K X K X 

X K X X 
K X X X 
X X X X 
K X X K 

X K X X 
K X X X 
X X X X 
X X K K 

X K X X 
X K K X 
X K X X 
X X X X 

X K X X 
X K X X 
X K X X 
X K X X 

X K X X 
X K X X 
X X X X 
X K X K 

X K X X 
X X K X 
X K X K 
X X X X 

X K X X 
X X K X 
X K X X 
K X X X 

X K X X 
X X K X 
X K X X 
X X K X 

X K X X 
X X K X 
X X X K 
K X X X 

X K X X 
X X K X 
X X X K 
X X K X 

X K X X 
X X K X 
X X X X 
K X K X 

X K X X 
X X X X 
X K X K 
K X X X 

X K X X 
X X X X 
X K X K 
X X K X 

X K X X 
X X X X 
X K X X 
K K X X 

X K X X 
X X X X 
X K X X 
K X K X 

X K X X 
X X X X 
X K X X 
X K K X 

X K X X 
X X X X 
X X X K 
K X K X 

X K X X 
X X X X 
X X X K 
K X X K 

X K X X 
X X X X 
X X X K 
X X K K 

X K X X 
X X X X 
X X X X 
K K K X 

X K X X 
X X X X 
X X X X 
K K X K 

X K X X 
X X X X 
X X X X 
K X K K 

X K X X 
X X X X 
X X X X 
X K K K 

X X K K 
X X K K 
X X X X 
X X X X 

X X K K 
X X K X 
X X X X 
K X X X 

X X K K 
X X K X 
X X X X 
X X K X 

X X K K 
X X X K 
K X X X 
X X X X 

X X K K 
X X X K 
X X X X 
K X X X 

X X K K 
X X X K 
X X X X 
X K X X 

X X K K 
X X X K 
X X X X 
X X X K 

X X K K 
X X X X 
K X X X 
K X X X 

X X K K 
X X X X 
K X X X 
X K X X 

X X K K 
X X X X 
K X X X 
X X X K 

X X K K 
X X X X 
X X X X 
K K X X 

X X K K 
X X X X 
X X X X 
K X K X 

X X K K 
X X X X 
X X X X 
K X X K 

X X K K 
X X X X 
X X X X 
X K K X 

X X K K 
X X X X 
X X X X 
X K X K 

X X K K 
X X X X 
X X X X 
X X K K 

X X K X 
X K K K 
X X X X 
X X X X 

X X K X 
X K K X 
X X K X 
X X X X 

X X K X 
X K X K 
K X X X 
X X X X 

X X K X 
X K X K 
X X K X 
X X X X 

X X K X 
X K X K 
X X X X 
X K X X 

X X K X 
X K X K 
X X X X 
X X X K 

X X K X 
X K X X 
K X K X 
X X X X 

X X K X 
X K X X 
K X X X 
X K X X 

X X K X 
X K X X 
K X X X 
X X X K 

X X K X 
X K X X 
X X K X 
X K X X 

X X K X 
X K X X 
X X K X 
X X X K 

X X K X 
X K X X 
X X X X 
X K X K 

X X K X 
X X K K 
X X K X 
X X X X 

X X K X 
X X K K 
X X X X 
K X X X 

X X K X 
X X K X 
X X K X 
X X K X 

X X K X 
X X K X 
X X X X 
K X K X 

X X K X 
X X X K 
K X K X 
X X X X 

X X K X 
X X X K 
K X X X 
K X X X 

X X K X 
X X X K 
K X X X 
X K X X 

X X K X 
X X X K 
K X X X 
X X X K 

X X K X 
X X X K 
X X K X 
X K X X 

X X K X 
X X X K 
X X K X 
X X X K 

X X K X 
X X X K 
X X X X 
K K X X 

X X K X 
X X X K 
X X X X 
K X X K 

X X K X 
X X X K 
X X X X 
X K X K 

X X K X 
X X X X 
K X K X 
X K X X 

X X K X 
X X X X 
K X K X 
X X X K 

X X K X 
X X X X 
K X X X 
K K X X 

X X K X 
X X X X 
K X X X 
K X X K 

X X K X 
X X X X 
K X X X 
X K X K 

X X K X 
X X X X 
X X K X 
X K K X 

X X K X 
X X X X 
X X K X 
X K X K 

X X K X 
X X X X 
X X K X 
X X K K 

X X K X 
X X X X 
X X X X 
K K K X 

X X K X 
X X X X 
X X X X 
K K X K 

X X K X 
X X X X 
X X X X 
K X K K 

X X K X 
X X X X 
X X X X 
X K K K 

X X X K 
K X K K 
X X X X 
X X X X 

X X X K 
K X K X 
X K X X 
X X X X 

X X X K 
K X K X 
X X X K 
X X X X 

X X X K 
K X K X 
X X X X 
K X X X 

X X X K 
K X K X 
X X X X 
X X K X 

X X X K 
K X X K 
K X X X 
X X X X 

X X X K 
K X X K 
X X X K 
X X X X 

X X X K 
K X X K 
X X X X 
K X X X 

X X X K 
K X X K 
X X X X 
X X X K 

X X X K 
K X X X 
K K X X 
X X X X 

X X X K 
K X X X 
K X X K 
X X X X 

X X X K 
K X X X 
K X X X 
K X X X 

X X X K 
K X X X 
K X X X 
X X X K 

X X X K 
K X X X 
X K X K 
X X X X 

X X X K 
K X X X 
X K X X 
K X X X 

X X X K 
K X X X 
X K X X 
X X K X 

X X X K 
K X X X 
X X X K 
K X X X 

X X X K 
K X X X 
X X X K 
X X K X 

X X X K 
K X X X 
X X X K 
X X X K 

X X X K 
K X X X 
X X X X 
K X K X 

X X X K 
K X X X 
X X X X 
K X X K 

X X X K 
K X X X 
X X X X 
X X K K 

X X X K 
X X K K 
X X X K 
X X X X 

X X X K 
X X K K 
X X X X 
K X X X 

X X X K 
X X K X 
X K X K 
X X X X 

X X X K 
X X K X 
X K X X 
K X X X 

X X X K 
X X K X 
X K X X 
X X K X 

X X X K 
X X K X 
X X X K 
K X X X 

X X X K 
X X K X 
X X X K 
X X K X 

X X X K 
X X K X 
X X X X 
K X K X 

X X X K 
X X X K 
K X X K 
X X X X 

X X X K 
X X X K 
K X X X 
K X X X 

X X X K 
X X X K 
K X X X 
X K X X 

X X X K 
X X X K 
K X X X 
X X X K 

X X X K 
X X X K 
X X X K 
K X X X 

X X X K 
X X X K 
X X X K 
X X X K 

X X X K 
X X X K 
X X X X 
K K X X 

X X X K 
X X X K 
X X X X 
K X X K 

X X X K 
X X X K 
X X X X 
X K X K 

X X X K 
X X X X 
K K X K 
X X X X 

X X X K 
X X X X 
K K X X 
K X X X 

X X X K 
X X X X 
K K X X 
X K X X 

X X X K 
X X X X 
K X X K 
K X X X 

X X X K 
X X X X 
K X X K 
X X X K 

X X X K 
X X X X 
K X X X 
K K X X 

X X X K 
X X X X 
K X X X 
K X X K 

X X X K 
X X X X 
K X X X 
X K X K 

X X X K 
X X X X 
X K X K 
K X X X 

X X X K 
X X X X 
X K X K 
X X K X 

X X X K 
X X X X 
X K X X 
K K X X 

X X X K 
X X X X 
X K X X 
K X K X 

X X X K 
X X X X 
X K X X 
X K K X 

X X X K 
X X X X 
X X X K 
K X K X 

X X X K 
X X X X 
X X X K 
K X X K 

X X X K 
X X X X 
X X X K 
X X K K 

X X X K 
X X X X 
X X X X 
K K K X 

X X X K 
X X X X 
X X X X 
K K X K 

X X X K 
X X X X 
X X X X 
K X K K 

X X X K 
X X X X 
X X X X 
X K K K 

X X X X 
K K K K 
X X X X 
X X X X 

X X X X 
K K K X 
X K X X 
X X X X 

X X X X 
K K X K 
K X X X 
X X X X 

X X X X 
K K X K 
X X X X 
X X X K 

X X X X 
K K X X 
K K X X 
X X X X 

X X X X 
K K X X 
K X X X 
X X X K 

X X X X 
K X K K 
X X X K 
X X X X 

X X X X 
K X K K 
X X X X 
K X X X 

X X X X 
K X K X 
X K X K 
X X X X 

X X X X 
K X K X 
X K X X 
K X X X 

X X X X 
K X K X 
X K X X 
X X K X 

X X X X 
K X K X 
X X X K 
K X X X 

X X X X 
K X K X 
X X X K 
X X K X 

X X X X 
K X K X 
X X X X 
K X K X 

X X X X 
K X X K 
K X X K 
X X X X 

X X X X 
K X X K 
K X X X 
K X X X 

X X X X 
K X X K 
K X X X 
X X X K 

X X X X 
K X X K 
X X X K 
K X X X 

X X X X 
K X X K 
X X X K 
X X X K 

X X X X 
K X X K 
X X X X 
K X X K 

X X X X 
K X X X 
K K X K 
X X X X 

X X X X 
K X X X 
K K X X 
K X X X 

X X X X 
K X X X 
K X X K 
K X X X 

X X X X 
K X X X 
K X X K 
X X X K 

X X X X 
K X X X 
K X X X 
K X X K 

X X X X 
K X X X 
X K X K 
K X X X 

X X X X 
K X X X 
X K X K 
X X K X 

X X X X 
K X X X 
X K X X 
K X K X 

X X X X 
K X X X 
X X X K 
K X K X 

X X X X 
K X X X 
X X X K 
K X X K 

X X X X 
K X X X 
X X X K 
X X K K 

X X X X 
K X X X 
X X X X 
K X K K 

X X X X 
X K K K 
X X K X 
X X X X 

X X X X 
X K K X 
X K K X 
X X X X 

X X X X 
X K X K 
K X K X 
X X X X 

X X X X 
X K X K 
K X X X 
X K X X 

X X X X 
X K X K 
K X X X 
X X X K 

X X X X 
X K X K 
X X K X 
X K X X 

X X X X 
X K X K 
X X K X 
X X X K 

X X X X 
X K X K 
X X X X 
X K X K 

X X X X 
X K X X 
K K K X 
X X X X 

X X X X 
X K X X 
K K X X 
X K X X 

X X X X 
X K X X 
K X K X 
X K X X 

X X X X 
X K X X 
K X K X 
X X X K 

X X X X 
X K X X 
K X X X 
X K X K 

X X X X 
X K X X 
X K K X 
X K X X 

X X X X 
X K X X 
X X K X 
X K X K 

X X X X 
X X K K 
X X K K 
X X X X 

X X X X 
X X K K 
X X X K 
K X X X 

X X X X 
X X K X 
X K K K 
X X X X 

X X X X 
X X K X 
X K K X 
X X K X 

X X X X 
X X K X 
X K X K 
K X X X 

X X X X 
X X K X 
X K X K 
X X K X 

X X X X 
X X K X 
X K X X 
K X K X 

X X X X 
X X K X 
X X K K 
X X K X 

X X X X 
X X K X 
X X X K 
K X K X 

X X X X 
X X X K 
K X K K 
X X X X 

X X X X 
X X X K 
K X K X 
X K X X 

X X X X 
X X X K 
K X K X 
X X X K 

X X X X 
X X X K 
K X X K 
K X X X 

X X X X 
X X X K 
K X X K 
X X X K 

X X X X 
X X X K 
K X X X 
K K X X 

X X X X 
X X X K 
K X X X 
K X X K 

X X X X 
X X X K 
K X X X 
X K X K 

X X X X 
X X X K 
X X K K 
X X X K 

X X X X 
X X X K 
X X K X 
X K X K 

X X X X 
X X X K 
X X X K 
K X X K 

X X X X 
X X X K 
X X X X 
K K X K 

X X X X 
X X X X 
K K K K 
X X X X 

X X X X 
X X X X 
K K K X 
X K X X 

X X X X 
X X X X 
K K X K 
K X X X 

X X X X 
X X X X 
K K X X 
K K X X 

X X X X 
X X X X 
K X K K 
X X X K 

X X X X 
X X X X 
K X K X 
X K X K 

X X X X 
X X X X 
K X X K 
K X X K 

X X X X 
X X X X 
K X X X 
K K X K 

X X X X 
X X X X 
X K K K 
X X K X 

X X X X 
X X X X 
X K K X 
X K K X 

X X X X 
X X X X 
X K X K 
K X K X 

X X X X 
X X X X 
X K X X 
K K K X 

X X X X 
X X X X 
X X K K 
X X K K 

X X X X 
X X X X 
X X K X 
X K K K 

X X X X 
X X X X 
X X X K 
K X K K 

X X X X 
X X X X 
X X X X 
K K K K 

