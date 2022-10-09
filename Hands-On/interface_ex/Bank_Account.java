package interface_ex;

//bank account implements the credit card details
 class Bank_Account implements CreditCard{
	
	 //create method bank details
	 public void bankdetails(String name,String Bank_name,int acc_no) {
		 
		 System.out.println("Name:"+name+"  "+"Bank Name:"+Bank_name +"  "+"Acc_no: "+acc_no);
	 }
 
	 //implementation of abstract methods
	public void rupees(int amount)
	{
		System.out.println(amount+" rs is transfer.");   
	}

	public void dollars(int amount)
	{
		System.out.println(amount +" dollars is transfer.");
	}
	
	public void pounds(int amount) {
		System.out.println(amount +" pounds is tranfer.");
	}
}
