package exam;

import java.util.Arrays;

public class q2 {

	 public static void main(String[] args) 
	 {
		int a[]= {7,8,9,1,2,3};
		for (int i = 0; i < a.length; i++)
		{
			int temp=a[i];
			int start=0;
			for (int j =i-1; j >=0; j--)
			{
				if(a[j]<temp)
				{
					start=j+1;
					break;
				}
			}
			for (int k =i-1; k>=start; k--) 
			{
				a[k+1]=a[k];
			}
			a[start++]=temp;
				
		}
		System.out.println(Arrays.toString(a));
	}
}
