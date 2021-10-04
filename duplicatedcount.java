package array2;

import java.util.Arrays;

public class duplicatedcount {

	public static void main(String[] args) {
	 int a[]= {1,1,2,2,3,3,4,5,6,1,2,3};
	 int count=0;
	 for (int i = 0; i < a.length; i++) 
	 {
		for (int j =i+1; j < a.length; j++) 
		{
			if(a[i]==a[j])
				{
				  
				  count++;
				  break;
				}
		}
	}
	 System.out.println(count);
	 int b[]=new int [a.length-count];
	  int index=0;
	 /* for (int i = 0; i < a.length; i++)
	  {
		  int count1=1;
		for (int j = 0; j <i; j++) 
		{
			if(a[i]==a[j])
				count1++;
		}
		if(count1==1
				)
			b[index++]=a[i];
	}
	  System.out.println(Arrays.toString(b));*/
	 
	   for (int i = 0; i < a.length; i++)
	   {
		  int num=a[i];
		  int countInb=0;
		  for (int j = 0; j <index; j++) 
		  {
			 if(b[j]==num)
				 countInb++;
		  }
		  if(countInb==0)
			  b[index++]=num;
	   }
	   for (int i = 0; i <index; i++)
	   {
		System.out.print(b[i]+" ");
	   }
	}

}
