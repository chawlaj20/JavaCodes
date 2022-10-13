/*Write a program to demonstrate on nested if .take the input from user.
 * Name:Jyoti Chawla
 * Date:13/10/22
 */
package Lab13;

import java.util.Scanner;

public class LabEx1 {

	public static void main(String[] args) {
		//get input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a percentage:");
		int percentage=sc.nextInt();
		
		if(percentage>=90&&percentage<=100)//condition 1
		{
			System.out.println("Grade A");
		}
		else if(percentage>=84)//condition2
		{
			System.out.println("Grade A1");
		}
		else if(percentage>=74)//condition 3
		{
			System.out.println("Grade B");//condition 4
		}
		else if(percentage>=64||percentage>=40)
		{
			System.out.println("Grade C");//condition 5
		}
		else  //if all condition become false then print this part
		{
			System.out.println("Fail");
		}
		
		

	}

}
