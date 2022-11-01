package Encapsulation;

interface Polygon {
	
	//abstract method of interface
	void getArea(int length,int breadth);

}

class Rectangle implements Polygon{
	
	public void getArea(int length,int breadth)
	{
		System.out.println("The area of Rectangle is:"+(length*breadth));
	}
}