package Exception_Handling;

public class Exception_Ex2 {

	     //creating static method 
		public static void dividebyzero()
		{
			throw new 
			ArithmeticException ("Trysing to divide by 0");
		}
		public static void main(String[] args) {
			
			dividebyzero();

	}

}
