package Array;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int row=sc.nextInt();     //take row as input from user
		
		System.out.println("Enter number of columns:");
		int col=sc.nextInt();            // taking columns as input
		
		//declaring the 2d matrix
		int arr[][] =new int[row] [col];
		System.out.println("Enter the elements of array:");  // enter the numbers you want
		
		//using loop for printing the numbers
		for(i=0;i<row;i++)          
		{
		   for(j=0;j<col;j++)
			{
		     arr[i][j]=sc.nextInt();
			}
		}
		   // enter the numbers in matrix from
		     System.out.println("Elements of array:");  
		     
		     //using loop for printing the numbers in matrix form
		     for(i=0;i<row;i++)
		     {
		    	 for(j=0;j<col;j++)
		    	 {
		    	 System.out.print(arr[i][j] +" ");
		    	 }
		    	 System.out.println();
	       }
		
	}
}

   



