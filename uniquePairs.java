package array2;

import java.util.Arrays;

public class uniquePairs {

	public static void main(String[] args) {
		int []a= {1,2,1};
		 int counter=0;
		   for (int i = 0; i < a.length; i++)
		   {   
			    for (int j =i+1; j < a.length; j++) 
			    {
					if(a[i]==a[j])
						{  counter++;
					        break;
						}
				}
			   
		   }
		   System.out.println(counter+"=counter");
		   
		   int []b=new int[a.length-counter];
		   int index=0;
		   for (int i = 0; i < a.length; i++)
		   {     int rank=1;
			   for (int j = 0; j <i; j++)
			   {
				   if(a[i]==a[j])
					   rank++;
			    }
			   if(rank==1)
				   b[index++]=a[i];
		   }
		   System.out.println();
		   
		  for (int i = 0; i < b.length; i++)
		  {
			  for (int j = 0; j < b.length; j++) 
			  {
				System.out.println("( "+b[i]+","+b[j]+" )");
			  }
		} 

	}

}
