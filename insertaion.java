package array2;

import java.util.Arrays;

public class insertaion {

	public static void main(String[] args) {
		int a[]= {5,1,6,2,4,3};
	/*	for (int i = 0; i < a.length; i++) 
		{
			int temp=a[i];
			int j=i;
			for (; j >0; j--)
			{
				if(a[j-1]>temp)
				{
					a[j]=a[j-1];
					
				}
				else
					break;
			}
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));*/
		
		for (int i = 1; i < a.length; i++)
		{
			for (int j = i; j >=1; j--) 
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j-1];
					   a[j-1]=a[j];
					   a[j]=temp;
				}
				else
					break;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
