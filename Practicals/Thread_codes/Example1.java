
package Thread_codes;

/* If a class extends the Thread class,
*  the thread can be run by creating an instance of the class
*  and call its start() method.
 */

public class Example1 extends Thread
{

	public static void main(String[] args) {
		
		
			Example1 thread=new Example1(); // creating object of class Main
			thread.start();
			System.out.println("This code is outside of the thread");

			}
			
	
			public void run()
			{
				System.out.println("This code is running in the thread");
			}
	}


