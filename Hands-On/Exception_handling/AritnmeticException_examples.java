// Write a program of different types of arithmetic exception except divide by zero.

// For non terminating  big decimal exapansion
package Exception_Handling;

import java.math.BigDecimal;

public class AritnmeticException_examples {

	public static void main(String[] args) {
		
		//creating 2 objects of big decimal
	BigDecimal d1=new BigDecimal(12);
	BigDecimal d2=new BigDecimal(19);
	
	try {
		//try to divide 12/19...
		d1=d1.divide(d2);
		System.out.println(d1);
	}

	//handle exception by catch block
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	}

}
