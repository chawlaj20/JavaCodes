/*Write a program to enter even number in array and print in ascending order
 * Name:Jyoti chawla
 * date:20/10/22
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Even_Ascending_Array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int a=sc.nextInt();
		int array[]=new int[a];
		
		System.out.println("Enter elements:");
		
		for(int i=0;i<a;i++)
		{
			array[i]=sc.nextInt();
		}
		//sorting even number in ascending order
		Arrays.sort(array);
		//print even numbers in ascending order
		System.out.print("Ascending Even numbers are:[");
		for(int j=0;j<a;j++)
		{
			if(array[j] % 2==0 )//condition for even number
			{
				System.out.print(array[j]+" ");
			}
		}
		System.out.print("]");
		

	}

}
