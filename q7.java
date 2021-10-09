package exam;

import java.util.Arrays;

public class q7 {

	public static void main(String[] args) {
		int a[]= {5,1,3,6,8,2,9,0,10};
		int inele=0;
		int dele=0;
		if(a[0]>a[1])
		{
			dele=a[0];
			inele=a[1];
		}
		else
		{
			dele=a[1];
			inele=a[0];
		}
		
		int count=1;
		for (int i = 2; i < a.length; i++)
		{
			if(a[i]>inele)
			{
				inele=a[i];
				count++;
			}
		}
		
		int inArrays[]=new int[count];
		int deArrays[]=new int[a.length-count];
		int incindex=1;
		int decindex=1;
		if(a[0]>a[1])
		{
			dele=a[0];
			deArrays[0]=a[0];
			inele=a[1];
			inArrays[0]=a[1];
		}
		else
		{
			dele=a[1];
			deArrays[1]=a[1];
			inele=a[0];
			inArrays[0]=a[0];
		}
		
	
		
		for (int i = 2; i < a.length; i++)
		{
			if(a[i]>inele)
			{
				inele=a[i];
				inArrays[incindex++]=inele;
			}
			else
			{
				dele=a[i];
				deArrays[decindex++]=dele;
			}
		}
		
		System.out.println(Arrays.toString(inArrays));
		System.out.println(Arrays.toString(deArrays));
		
		
		

	}

}
