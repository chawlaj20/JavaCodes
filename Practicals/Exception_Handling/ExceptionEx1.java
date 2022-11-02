package Exception_Handling;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		//try block
		//code that generate exception
		try
		{
			int a=10/0;
			System.out.println("code in try block:"+a);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException:"+ae.getMessage());
		}
		finally
		{
			System.out.println("This is finally block");
		}

	}

}
