package array2;

import java.util.Arrays;

public class splitIncreDecre {

	public static void main(String[] args) {
		int a[]= {5, 1, 3, 6, 8, 2, 9, 0, 10};
		int inele=0;
		int deele=0;
		if(a[0]>a[1])
		{
			 inele=a[1];
			 deele=a[0];
		}
		else
		{
			 inele=a[0];
			 deele=a[1];
		}
		/*int incount=1;
		for (int i = 2; i < a.length; i++)
		{
			if(a[i]>inele)
			{
				incount++;
				inele=a[i];
			}
		}*/
		
		int incount=getincount(a,inele,2,1);
		
		
		int incArray[]=new int[incount];
		int decArrays[]=new int[a.length-incount];
		if(a[0]>a[1])
		{
			 inele=a[1];
			 incArray[0]=a[1];
			 deele=a[0];
			 decArrays[0]=a[0];
		}
		else
		{
			 inele=a[0];
			 incArray[0]=a[0];
			 deele=a[1];
			 decArrays[0]=a[1];
		}
		/*int incindex=1;
		int decindex=1;
		for (int i = 2; i < a.length; i++)
		{
			if(a[i]>inele)
			{
				
				inele=a[i];
				incArray[incindex++]=inele;
			}
			else if(a[i]<deele)
			{
				deele=a[i];
				decArrays[decindex++]=deele;
			}
			
		}*/
		
		AddinArray(1,1,2,a,inele,deele,incArray,decArrays);
		 
		printincreArray(incArray,0);
		System.out.println();
//		for (int i = 0; i <incArray.length; i++) 
//		{
//			System.out.print(incArray[i]+" ");
//		}
		 printdecArrays(decArrays,0);
//		for (int j = 0; j < decArrays.length; j++)
//		{
//			System.out.println(decArrays[j]);
//		}
	
		

	}

	private static void printdecArrays(int[] decArrays, int i) 
	{
		System.out.print(decArrays[i]+" ");
		i++;
		if(i<decArrays.length)
			printdecArrays(decArrays, i);
		
	}

	private static void printincreArray(int[] incArray, int i) 
	{
		System.out.print(incArray[i]+" ");
		i++;
		if(i<incArray.length)
			printincreArray(incArray, i);
	}

	private static void AddinArray(int incindex, int decindex, int i, int[] a, int inele, int deele, int[] incArray, int[] decArrays) 
	{
		if(a[i]>inele)
		{
			
			inele=a[i];
			incArray[incindex++]=inele;
		}
		else if(a[i]<deele)
		{
			deele=a[i];
			decArrays[decindex++]=deele;
		}
		i++;
		if(i<a.length)
			AddinArray(incindex, decindex, i, a, inele, deele, incArray, decArrays);
	}

	private static int getincount(int[] a, int inele, int i, int incount) 
	{
		if(a[i]>inele)
		{
			incount++;
			inele=a[i];
		}
		i++;
		if(i<a.length)
			return getincount(a, inele, i, incount);
		return incount;
	}

}
