/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    
		
		boolean[][] maze={{true,true,true},{true,true,true},{true,true,true}};
		System.out.println(countPath(maze,0,0));
		int[][] path=new int[maze.length][maze[0].length];
		printMatrixPath("",maze,0,0,path,1);
		
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
	    maze[r][c]=false;
	    int left=0,right=0;
	    if(r<maze.length-1)
	     left=countPath(maze,r+1,c);
	    if(c<maze[0].length-1)
	    right=countPath(maze,r,c+1);
	    int up=0,down=0;
	    if(r>0)
	    up=countPath(maze,r-1,c);
	    if(c>0)
	    down=countPath(maze,r,c-1);
	    maze[r][c]=true;
	    return left+right+up+down;
	}
	static void printMatrixPath(String p,boolean[][] maze,int r,int c,int[][] path,int steps)
	{
	    if(r==maze.length-1 && c==maze[0].length-1)
	    {
	        path[r][c]=steps;
	        for(int[] arr:path)
	        {
	            System.out.println(Arrays.toString(arr));
	        }
	        System.out.println(p);
	        System.out.println();
	        return;
	    }
	    
	    if(!maze[r][c])
	    return;
	    maze[r][c]=false;
	    path[r][c]=steps;
	    if(r<maze.length-1)
	    printMatrixPath(p+'D',maze,r+1,c,path,steps+1);
	    if(c<maze[0].length-1)
	    printMatrixPath(p+'R',maze,r,c+1,path,steps+1);
	    if(r>0)
	    printMatrixPath(p+'U',maze,r-1,c,path,steps+1);
	    if(c>0)
	    printMatrixPath(p+'L',maze,r,c-1,path,steps+1);
	    maze[r][c]=true;
	    path[r][c]=0;
	}
}


12
[1, 0, 0]
[2, 0, 0]
[3, 4, 5]
DDRR

[1, 0, 0]
[2, 5, 6]
[3, 4, 7]
DDRURD

[1, 6, 7]
[2, 5, 8]
[3, 4, 9]
DDRUURDD

[1, 0, 0]
[2, 3, 0]
[0, 4, 5]
DRDR

[1, 0, 0]
[2, 3, 4]
[0, 0, 5]
DRRD

[1, 4, 5]
[2, 3, 6]
[0, 0, 7]
DRURDD

[1, 2, 0]
[0, 3, 0]
[0, 4, 5]
RDDR

[1, 2, 0]
[0, 3, 4]
[0, 0, 5]
RDRD

[1, 2, 0]
[4, 3, 0]
[5, 6, 7]
RDLDRR

[1, 2, 3]
[0, 0, 4]
[0, 0, 5]
RRDD

[1, 2, 3]
[0, 5, 4]
[0, 6, 7]
RRDLDR

[1, 2, 3]
[6, 5, 4]
[7, 8, 9]
RRDLLDRR

