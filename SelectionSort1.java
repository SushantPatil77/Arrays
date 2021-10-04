package array2;

import java.util.Arrays;

public class SelectionSort1 {

	public static void main(String[] args) {
		int a[]= {7,8,9,4,5,6,1,2,3,0,1,2,3,5};
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
			      if(a[j]<a[min])
			    	  min=j;
			}
			  int temp=a[i];
			      a[i]=a[min];
			      a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
		
		/*for (int i = 0; i < a.length; i++) 
		{
			int max=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]>a[max])
					max=j;
					
			}
			int temp=a[i];
			    a[i]=a[max];
			    a[max]=temp;
		}*/
		/*System.out.println(Arrays.toString(a));*/
	}

}
