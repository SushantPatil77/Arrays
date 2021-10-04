package array2;

public class substractionOfMatrix {

	public static void main(String[] args) {
		int [][]a= {{1,2,7},
			    {4,5,6},
			    {7,8,9}};
	
	int [][]b= {{3,2,7},
		        {4,1,6},
		        {5,8,2}};
	int [][]c=new int [3][3];
	
	for (int i = 0; i < c.length; i++)
	{
	   for (int j = 0; j < c.length; j++)
	   {
		   c[i][j]=a[i][j]-b[i][j];
	   }
	   
	}
	System.out.println("Substraction of matrix= ");
	System.out.println("======================================");
	for (int i = 0; i < c.length; i++)
	{
	   for (int j = 0; j < c.length; j++)
	   {
		System.out.print(c[i][j]+" ");
	  }	
	   System.out.println();

	}
	System.out.println("=====================================");

	}

}
