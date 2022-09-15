class Student
{
	String Name;
	int Roll_no;
	String Class;

	Student(String n,int r,String c)
	{
	  Name =n;
	  Roll_no =r;
	  Class = c;	
	}
	
	void displayData()
	{
	System.out.println("Name:"+Name +"  "+"Roll_no:"+Roll_no+"  "+"Class:"+Class);

	}
	
	public static void main(String[] args)
	{
	 Student s1=new Student("jyoti",1,"tyit");
	 Student s2=new Student("shruti",2,"tyit");
	 Student s3=new Student("tonu",3,"syit");

	 s1.displayData();
	 s2.displayData();
	 s3.displayData();
	}
}