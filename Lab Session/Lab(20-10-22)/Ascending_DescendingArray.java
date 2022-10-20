/*Write a program of ascending and descending order of array in same program
 * Name:Jyoti chawla
 * date:20/10/22
 */
package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ascending_DescendingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int a=sc.nextInt();
		Integer array[]=new Integer[a];
		
		
		System.out.println("Enter elements:");
		
		for(int i=0;i<a;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//print original array
		System.out.println("original array "+Arrays.toString(array));
		
		//sort the array in ascending order 
	    Arrays.sort(array);
		System.out.println("Array in Ascending oder:"+Arrays.toString(array));
			
		//sort the array in descending order
		Arrays.sort(array,Collections.reverseOrder());
		System.out.print("Arrays in Descending order:"+Arrays.toString(array));
		
	}

}
