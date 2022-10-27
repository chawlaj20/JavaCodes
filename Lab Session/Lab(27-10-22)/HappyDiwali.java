/* Write a program to print happy diwali using for loop.
 * name:jyoti chawla
 * date:27/10/22
 */

package Lab27_10;

public class HappyDiwali {
	

	public static void main(String... args) {
		int i,j ,space=1;
		
		// for happy
		//loop for printing H
		for(i=1;i<=5;i++)
		{
			for(j =1;j<=5; j++)
			{	
				if(j==1||j==5||i==3) {
		        System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//loop for printing a
			for(space=1;space<=3;space++)
			{
				System.out.print(" ");
			}
			for(j =1;j<=5;j++)
			{	
				if(j==1||j==5||i==1||i==3) {
		        System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//loop for printing p
			for(space=1;space<=3;space++)
			{
				System.out.print(" ");
			}
			for(j =1;j<=5;j++)
			{	
				if(i==1||j==1||i==3||(i==2&&j==5)) {
		        System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		   //loop for printing p
			for(space=1;space<=3;space++)
			{
				System.out.print(" ");
			}
			for(j =1;j<=5;j++)
			{	
				if(i==1||j==1||i==3||(i==2&&j==5)) {
		        System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//loop for printing y
			for(space=1;space<=3;space++)
			{
				System.out.print(" ");
			}
			for(j =1;j<=5;j++)
			{	
				if(i==1&&(j==1||j==5)||(i==2&&(j==2||j==4))||(j==3&&i>=3)) {
		        System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		 }
		// for diwali 
		//loop for D
		System.out.println();
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) {
				if(i==1||i==5||j==2||j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//Loop for I
			for(space=1;space<=3;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=5;j++)
			{	
				if(i==1||i==5||j==3) {
		        System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//loop for W
			for(space=1;space<=3;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=5;j++)
			{	
				if((j==1||j==5)||(i==3&&j==3)||(i==4&&(j==2||j==4))) {
		        System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//loop for A
			for(space=1;space<=3;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=5;j++)
			{	
				if(i==1||j==1||j==5||i==3) {
		        System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//loop for L
			for(space=1;space<=3;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=5;j++)
			{	
				if(j==1||i==5) {
		        System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//loop for i
			for(space=1;space<=3;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=5;j++)
			{	
				if(i==1||i==5||j==3) {
		        System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}

}



