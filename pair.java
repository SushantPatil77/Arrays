package array2;

public class pair {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) {
				System.out.println("("+a[i]+" "+a[j]+")");
			}
		}
		System.out.println("=================================");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) {
				System.out.println("("+a[i]+" "+a[j]+")");
			}
		}
		
		

	}

}
