package Thread_codes;

public class Thread3 extends Thread {


	public static void main(String[] args) {
		
		Thread t1=new Thread();
		
		t1.start();
		
		System.out.println("Thread has been created with name:"+t1.getName());
	}

}
