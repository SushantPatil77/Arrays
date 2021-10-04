package array2;

import java.util.Arrays;

public class douplicatedArrays {

	public static void main(String[] args) {
		int a[]= {1,2,1,2,1,1,1,1,3,3,3,4,4,5,6,6,7,8,3,7,8};
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
		//System.out.println(count);
		int b[]=new int[a.length-count];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{    int count1=0;
			for (int j = 0; j <i; j++)
			{
				if(a[i]==a[j])
					count1++;
					
			}
			if(count1==0)
				b[index++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
