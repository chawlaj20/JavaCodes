package Lab29;

public class Android_main {

	public static void main(String[] args) {
		
		Oneplus[] o=new Oneplus[3];
        Realme[]  r=new Realme[2];
        Vivo[] v=new Vivo[1];
        
        o[0]=new Oneplus("3GB","sky-blue");
        o[1]=new Oneplus("4GB","green");
        o[2]=new Oneplus("2GB","black");
        
       r[0]=new Realme("4GB","Red"); 
       r[1]=new Realme("3GB","white");
       
       v[0]=new Vivo("3GB","blue");
      
       System.out.println("Oneplus data:");
       o[0].display();
       o[1].display();
       o[2].display();
       System.out.println();

       System.out.println("Realme data:");
       r[0].display();
       r[1].display();
             
       System.out.println();
       System.out.println("oneplus data:");
       v[0].display();

	}

}
