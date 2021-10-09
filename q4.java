package exam;

public class q4 {

	public static void main(String[] args) {
		int a[][]= {{6,3,1},
				    {9,2,8},
				    {2,4,5}};
		boolean flag=false;
		
		for (int i = 0; i < a.length; i++)
		{
			int min=Integer.MAX_VALUE;
			 int minIndex=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					 minIndex=j;
				}
			}
			int max=Integer.MIN_VALUE;
			
			for (int k = 0; k < a.length; k++) 
			{
				if(a[k][minIndex]>max)
				{
					max=a[k][minIndex];
				}
			}
			if(min==max)
				{
				   System.out.println("Saddle point= "+max);
				    flag= true;
				}
			       
			
		}
		if(flag==false)
		{
			System.out.println("There are no saddle point");
		}

	}

}
