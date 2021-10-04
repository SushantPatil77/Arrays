package array2;

import java.util.Scanner;

public class eualityofMatrixc {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a size of array");
		int n=sc.nextInt();
		int []a= new int[n];
		int []b= new int[n];
		System.out.println("Enter a 1st array= ");
		for (int i = 0; i < b.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("a[]=");
		  for (int i = 0; i < b.length; i++) 
		  {
			System.out.print(a[i]+" ");
		  }
		  System.out.println();
		  System.out.println("Enter a second Array= ");
		  for (int i = 0; i < b.length; i++)
		  {
			b[i]=sc.nextInt();		
		  }
		  System.out.print("b[]= ");
		  for (int i = 0; i < b.length; i++)
		  {
			System.out.print(b[i]+" ");
	      }
		  sc.close();
		  System.out.println();
		 int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a.length==b.length&&a[i]==b[i])
			         count++;
		}
		if(count==0)
			System.out.println("They are not equal ");
		else
			System.out.println("They are equal");


	}

}
