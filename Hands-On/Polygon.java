package Encapsulation;

interface Polygon {
	
	//abstract method of interface
	void getArea(int length,int breadth);

}
//implements the polygon interface
class Rectangle implements Polygon{
	
	//implementation of abstract method
	public void getArea(int length,int breadth)
	{
		System.out.println("The area of Rectangle is:"+(length*breadth));
	}
}
