package interface_ex;

public class interface_main {

	public static void main(String[] args) {
		
		
      Bank_Account b1=new Bank_Account();    
      b1.bankdetails("Jyoti", "SBI Bank", 356678890); //calling a method which is in bank acc
      b1.rupees(400);  //calling a abstract method
      System.out.println();
      
      Bank_Account b2=new Bank_Account();
      b2.bankdetails("Sona", "Borada Bank", 677888200);
      b2.dollars(600);//calling a abstract method
      System.out.println();
       
      Bank_Account b3=new Bank_Account();
      b3.bankdetails("John", "HDFC Bank",340001113);//calling a abstract method
      b3.pounds(1000);
      
      }

}
