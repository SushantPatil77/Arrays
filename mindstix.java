package array2;

public class mindstix {

	public static void main(String[] args) {
		int []a= {3,7,90,20,5,50,40};
		int k=3;
		int minindex=0;
		int miniAvg=Integer.MAX_VALUE;

		for (int i = 0; i < a.length-k; i++) 
		{
			int sum=0;
		    for (int j = i; j < i+k; j++)
		    {
			    	sum=sum+a[j];
			}
		    System.out.println(sum);
		    if(sum/k<miniAvg)
		    {
		    	miniAvg=sum/k;
		    	minindex=i;
		    }
		}
		System.out.println("miniAvg="+miniAvg);
		System.out.println("miniIndex="+minindex);
	}

	}


