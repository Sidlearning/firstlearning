package mylearning;

public class ChildDemo extends ParentDemo {
	
	String name ="QAClickAcademy";

	public ChildDemo()
	{
	//super();// this should be always be at first line
	System.out.println("child class construtor");

	}
	public void getStringdata()
	{
	System.out.println(name);
	System.out.println(super.name);
	}


	public void getData()
	{
	super.getData();
	System.out.println("I am in child class");
	}
	
	public static void main(String[] args) {
		/*
		 * ChildDemo ch = new ChildDemo(); ch.getData(); ch.getStringdata();
		 * System.out.println(ch.name);
		 */
		
		ParentDemo pd = new ChildDemo();// calls child class constructor
		pd.getData(); // calls child class object
		System.out.println(pd.name);// calls the parent class string
	}
}
