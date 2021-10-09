package exam;

public class q8 {

	public static void main(String[] args) {
		int a[]= {1,5,-4,-2,-1};
		int sum=2;
		for (int i = 0; i < a.length; i++)
		{
		   for (int j =i+1; j < a.length; j++)
		   {
			 for (int k =j+1; k < a.length; k++) 
			 {
				if(a[i]+a[j]+a[k]==sum)
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
			  }
		   }	
		}

	}

}
