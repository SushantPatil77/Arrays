package array2;

public class bubbleSort {

	public static void main(String[] args) {
		int a[]= {7,8,9,68,10,8,5,2,1,10,66,77};
		for (int i = 0; i < a.length; i++)
		{
		  for (int j = 0; j < a.length-1-i; j++)
		  {
			 if(a[j]>a[j+1])
			 {
				 int  temp=a[j];
		          a[j]=a[j+1];
		          a[j+1]=temp;
			 }
		   }
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}


	}


