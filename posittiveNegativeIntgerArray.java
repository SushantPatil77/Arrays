package array2;

public class posittiveNegativeIntgerArray {

	public static void main(String[] args) 
	{
        int []a= {1,2,-4,5,-6,7,-8,9,-10,-4,7,-5,6,-7,8};
        
//{1,   2,   8,   -4,  -6,  -4,  -8,  7,  -10, -4,   9,    -5,    7,    -7,    6};
//A[0] A[1] A[2] A[3] A[4] A[5] A[6] A[7] A[8] A[9] A[10] A[11] A[12] A[13] A[14]
        
		for (int i = 0; i < a.length; i++)//3
		{
			for (int j = 0; j < a.length; j++)//0 
			{
				if(i<j && a[i]<0 && a[j]>0)// 2<14 && -4<0 && 8>0
				{
					int temp=a[i];// temp = 6
					a[i]=a[j];	  // a[2] = 8
					a[j]=temp;	  // a[14] = 6
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
