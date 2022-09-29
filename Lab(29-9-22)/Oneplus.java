package Lab29;

public class Oneplus {
	
	String RAM_size;
	String Color_type;
	
	
	public Oneplus(String rAM_size, String color_type) {
		super();
		RAM_size = rAM_size;
		Color_type = color_type;
		
	}

	void display()
	{
		
		System.out.println("RAM-size:"+RAM_size+"  "+ "color is "+Color_type);
		
	}

}
