package Encapsulation;

class Encapsulation_Main {

	public static void main(String[] args) {

		Encapsulation e1=new Encapsulation();
		
		//calling a setter method using object of class
		e1.setRoll_no(20);
		e1.setName("Jyoti");
		e1.setDegree("TYIT");
		
		//calling a getter method using object of class
		
		System.out.println("Id is :"+e1.getRoll_no());
		System.out.println("Name is :"+e1.getName());
		System.out.println("Degree is :"+e1.getDegree());

	}

}
