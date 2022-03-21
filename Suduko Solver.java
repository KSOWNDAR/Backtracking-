public class Main
{
	public static void main(String[] args) {
		int[][] board = new int[][]{ {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
         
        if(solveSuduko(board)) 
        {
            display(board);
        }
        else
        {
            System.out.println("Cannot be solved");
        }
	}
	
	static boolean solveSuduko(int[][] board)
	{
	    int row=-1;
	    int col=-1;
	    boolean emptyLeft=true;
	    for(int i=0;i<board.length;i++)
	    {
	        for(int j=0;j<board.length;j++)
	        {
	            if(board[i][j]==0)
	            {
	                row=i;
	                col=j;
	                emptyLeft=false;
	                break;
	            }
	        }
	        if(emptyLeft==false)
	        break;
	    }
	    
	    if(emptyLeft==true)
	    return true;
	    
	    for(int number=1;number<=9;number++)
	    {
	        if(isSafe(board,row,col,number))
	        {
	            board[row][col]=number;
	            if(solveSuduko(board))
	            return true;
	            else
	            board[row][col]=0;
	        }
	    }
	    return false;
	}
	
	static boolean isSafe(int[][] board,int row,int col,int number)
	{
	    for(int i=row;i<board.length;i++)
	    {
	        if(board[row][col]==number)
	        return false;
	    }
	    
	    for(int[] nums:board)
	    {
	        if(nums[col]==number)
	        return false;
	    }
	    
	    int sqrt=(int)Math.sqrt(board.length);
	    int startRow=row-row%sqrt;
	    int startCol=col-col%sqrt;
	    
	    for(int i=startRow;i<startRow+sqrt;i++)
	    {
	        for(int j=startCol;j<startCol+sqrt;j++)
	        {
	            if(board[i][j]==number)
	            return false;
	        }
	    }
	    return true;
	}
	
	static void display(int[][] board)
	{
	    for(int[] row:board)
	    {
	        for(int num:row)
	        {
	            System.out.print("|"+num+"|");
	        }
	        System.out.println();
	    }
	}
}

OUTPUT:

|3||1||6||5||2||8||4||2||6|
|5||2||9||1||3||4||5||9||7|
|4||8||7||6||7||9||8||3||1|
|2||4||3||4||1||2||7||8||2|
|9||6||1||8||6||3||9||1||5|
|7||5||8||7||9||5||6||4||3|
|1||3||2||3||4||1||2||5||8|
|6||7||4||9||5||7||1||7||4|
|8||9||5||2||8||6||3||6||9|
