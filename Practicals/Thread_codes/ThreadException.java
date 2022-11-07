package Thread_codes;

public class ThreadException {
	
	private final String name;
	
	public ThreadException(String name) {
		this.name =name;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public synchronized void call(ThreadException caller)
	{
		System.out.println(this.getName()+" has asked to call me "+caller.getName());
		
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			
			e.printStackTrace();
		}
		caller.callMe(this);
			
	}
	public synchronized void callMe(ThreadException caller)
	{
		System.out.println(this.getName()+" has called me "+caller.getName());
	}
	
	public static void main(String[] args) {
		
		ThreadException caller1=new ThreadException("Caller-1");
		ThreadException caller2=new ThreadException("Caller-2");

		new Thread(new Runnable(){
			public void run() {
				caller1.call(caller2);
			}
			}).start();
		
		new Thread(new Runnable() {
			public void run() {
				caller2.call(caller1);
			}
			}).start();
				
	}
		

	}


