package exam;

import java.util.Arrays;

public class q3 {

	public static void main(String[] args) {
		int a[]= {7,8,9,1,2,3,4};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j =0; j < a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					   a[j]=a[j+1];
					   a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
