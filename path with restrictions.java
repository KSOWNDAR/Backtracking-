import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    
		
		boolean[][] maze={{true,true,true},{true,false,true},{true,true,true}};
		System.out.println(countPath(maze,0,0));
		printPath("",maze,0,0);
		
		return;
	}
	
	static int countPath(boolean[][] maze,int r,int c)
	{
	    if(r==maze.length-1 && c==maze[0].length-1)
	    {
	        return 1;
	    }
	    if(!maze[r][c])
	    return 0;
	    int left=0,right=0;
	    if(r<maze.length-1)
	     left=countPath(maze,r+1,c);
	    if(c<maze[0].length-1)
	    right=countPath(maze,r,c+1);
	    int dia=0;
	    if(r<maze.length-1 && c<maze[0].length-1)
	    {
	        dia=countPath(maze,r+1,c+1);
	    }
	    return left+right+dia;
	}
	static void printPath(String p,boolean[][] maze,int r,int c)
	{
	    if(r==maze.length-1 && c==maze[0].length-1)
	    {
	        System.out.println(p);
	        return;
	    }
	    if(!maze[r][c])
	    return;
	    if(r<maze.length-1 && c<maze[0].length-1)
	    printPath(p+'V',maze,r+1,c+1);
	    if(r<maze.length-1)
	    printPath(p+'D',maze,r+1,c);
	    if(c<maze[0].length-1)
	    printPath(p+'R',maze,r,c+1);
	    
	}
}


4
DVR
DDRR
RVD
RRDD
