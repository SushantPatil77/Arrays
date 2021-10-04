package array2;

public class myStack2 {

	int a[]= new int[5];
	int index=0;
	 
	public void set(int num)
	{  
		
		if(index<a.length)
		{
			a[index]=num;
			index++;
		}
		else
			System.out.println("Stack is fool");
		
	}
	 public int get() 
	 {  
		 if(index>0)
		 { 
			 index--;
		  
		 int p=a[index];
		 a[index]=0;
		  return p;
		 }
		 
		 if(index<=0)
			 System.out.println("stack is empty");
		 return 0;
	 }
	 
	 public void print() {
		 for (int i = 0; i <a.length; i++) 
		 {
		    System.out.print(a[i]+" ");	
		}
		 System.out.println();
	 }
	 

}
