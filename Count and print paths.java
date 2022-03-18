public class Main
{
	public static void main(String[] args) 
	{
	    System.out.println(countPath(3,3));
		printPath("",3,3);
		return;
	}
	
	static int countPath(int r,int c)
	{
	    if(r==1 || c==1)
	    return 1;
	    
	    int left=countPath(r-1,c);
	    int right=countPath(r,c-1);
	    int dia=0;
	    if(r>1 && c>1)
	    {
	        dia=countPath(r-1,c-1);
	    }
	    return left+right+dia;
	}
	static void printPath(String p,int r,int c)
	{
	    if(r==1 && c==1)
	    {
	        System.out.println(p);
	        return;
	    }
	    if(r>1 && c>1)
	    printPath(p+'V',r-1,c-1);
	    if(r>1)
	    printPath(p+'D',r-1,c);
	    if(c>1)
	    printPath(p+'R',r,c-1);
	    
	}
}


OUTPUT:
13
VV
VDR
VRD
DVR
DDRR
DRV
DRDR
DRRD
RVD
RDV
RDDR
RDRD
RRDD
