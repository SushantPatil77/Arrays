package array2;


public class Mystack {
//Q8. Write a program to implement stack methods using array.
	int []a=new int[5];
	int index=0;
	public int get()
	{
		if(index>0)
		{
			index--;
			int p=a[index]=0;
			return p;
		}
		return 0;
	}
	public void add(int num)
	{
		if(index<a.length)
		{
			a[index]=num;
			index++;
		}
		else
		{
			System.out.println("Stack is fool");
		}
	}
           
	public void print() 
	{
				
			 for (int i = 0; i < a.length; i++)
	             {
				    System.out.print(a[i]+" ");	
				 }
	             System.out.println();
				
			}
	

		

	

}
