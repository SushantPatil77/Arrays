
package array2;

public class saddlepoint {

	public static void main(String[] args) {
		int [][] a= {{6,3,1},
				     {9,7,8},
				     {2,4,5}};
		 for (int i = 0; i < a.length; i++) 
		   {
			int miniIndex=0;
			int min=Integer.MAX_VALUE;
			for (int j = 0; j < a[i].length; j++)
			  {
				 if(a[i][j]<min)
				   {
				   	min=a[i][j];
				   	miniIndex=j;
				   }
		    	}
		  int max=Integer.MIN_VALUE;
		  
		  for (int k = 0; k < a.length; k++)
			{
				if(a[k][miniIndex]>max)
				{
				    max=a[k][miniIndex];
				}
				
			}
		  
		  if(min==max)
			  System.out.println(min);
		  
		}

	}
}

