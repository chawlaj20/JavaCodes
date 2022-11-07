package Thread_codes;

 /* If the class implements the Runnable interface
 * the thread can be run by passing an instance 
 * of the class to a Thread object's constructor
 * and then calling the thread's start() method.
  */

public class RunnableInterface implements Runnable{

	public static void main(String[] args) {
		
		RunnableInterface r=new RunnableInterface();
		
		Thread t=new Thread(r);
		t.start();
		System.out.println("This code is outside the thread");
	}
	
		public void run()
		{
			System.out.println("This code is running in the thread");
		}
		
}