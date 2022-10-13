/*write a program to demonstrate on nested for loop and print the output as shown in diagram.
 * *
 * **
 * ***
 * *****
 * ******
 * name:jyoti chawla
 * date:13/10/22
 */
package Lab13;

public class StarPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++)//print a rows 
		{
			for( int j =1;j<=i; j++)//printing column
			{					
				System.out.print("* ");	//print a star and space	
			}
		  
			System.out.println();
		
		}

	}

}
