package array2;

import java.util.Arrays;

public class inserction {
	static  int index=0;
	public static void main(String[] args) {
	int a[]= {1,3,4,5,7};
	int b[]= {2,3,5,6};
	  
	
	
	    int count=0;
	    count=getcount(0,0,a,b,count);
	     
	    
	     System.out.println(count);
	     int c[]=new int [count];
	   
	     iLoop(0,a,b,c);
	   
		  
		  System.out.println(Arrays.toString(c));
	
	}

	private static void iLoop(int i, int[] a, int[] b, int[] c)
	{
		if (i<a.length)
		{
			 int rank=0;
			 rank=gettrank(i,0,a,b,rank);
			   	
			    if(rank>0)
			     c[index++]=a[i];
			    iLoop(i+1, a, b, c);
		}
	}

	private static int gettrank(int i, int j, int[] a, int[] b, int rank) {
		if (j<b.length)
		{
			if(a[i]==b[j])
			{
				rank++;
			}
			return gettrank(i, j+1, a, b, rank);
		}
		else return rank;
	}

	private static int getcount(int i, int j, int[] a, int[] b, int count) {
		 if(a[i]==b[j])
		 {
			 count++;
			  
		}
		 if (j<b.length-1)
			 
		 {
			 j++;
		 }
		 else
		 {
			 j=0;
			 i++;
		 }
		 if(i<a.length)
		 {
			return getcount(i, j, a, b, count); 
		 }
		 else 
		 {
			 return count;
		 }
	}	
	
}
