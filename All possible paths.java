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
	    maze[r][c]=false;
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
	    int up=0,down=0;
	    if(r>0)
	    up=countPath(maze,r-1,c);
	    if(c>0)
	    down=countPath(maze,r,c-1);
	    maze[r][c]=true;
	    return left+right+dia+up+down;
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
	    maze[r][c]=false;
	    if(r<maze.length-1 && c<maze[0].length-1)
	    printPath(p+'V',maze,r+1,c+1);
	    if(r<maze.length-1)
	    printPath(p+'D',maze,r+1,c);
	    if(c<maze[0].length-1)
	    printPath(p+'R',maze,r,c+1);
	    if(r>0)
	    printPath(p+'U',maze,r-1,c);
	    if(c>0)
	    printPath(p+'L',maze,r,c-1);
	    maze[r][c]=true;
	    
	}
}


37
VV
VDR
VRD
VUVD
VURDD
VLVR
VLDRR
DVR
DVUV
DVURD
DVUUVD
DVUURDD
DDRR
DDRUV
DDRURD
DDRUUVD
DDRUURDD
DRV
DRDR
DRRD
DRUVD
DRURDD
RVD
RVLV
RVLDR
RVLLVR
RVLLDRR
RDV
RDDR
RDRD
RDLVR
RDLDRR
RRDD
RRDLV
RRDLDR
RRDLLVR
RRDLLDRR
