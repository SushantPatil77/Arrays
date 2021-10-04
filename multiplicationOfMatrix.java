package array2;

import java.util.Scanner;

public class multiplicationOfMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a row and column");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int [][]a=new int[row][column];
		int [][]b=new int [column][row];
		int [][]c=new int [row][row];
		System.out.println("Enter a element1=");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter a element2= ");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j <b[i].length; j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Multiplication of Matrix");
		System.out.println("======================================");
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c[i].length; j++)
			{
			    for (int k = 0; k < b.length; k++)
			    {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}	
			    System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("=========================================");


	}

}
