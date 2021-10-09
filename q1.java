package exam;

public class q1 {

	public static void main(String[] args)
	{
		 int a[]= {1,1,2};
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
		 int b[]=new int[a.length-count];
		 int index=0;
		 for (int i = 0; i < a.length; i++)
		 { 
			 int r=0;
			 
			for (int j = 0; j < i; j++) 
			{
				if(a[i]==a[j])
				{
					r++;
				}
			}
			if(r==0)
				b[index++]=a[i];
		}
		 
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				System.out.println("("+b[i]+" "+b[j]+")");
			}
		}
	}

}
