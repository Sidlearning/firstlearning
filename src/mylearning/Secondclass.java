package mylearning;

public class Secondclass {

	public void setData()
	{
	System.out.println(" I am in second class method");
	}
	public static void main(String[] args) {
		//String : it is one of the prebuilt class in java
		/* 1.String literal
		2.by creating object of string*/

		String a= " javatraining";//string 

		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("rahul teaches"));
		//a.length()
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		//split
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
		System.out.println("git test");
		System.out.println("git test2");
		System.out.println("git test3");
		
		//////////////////////////////
		System.out.println("git branched");
		System.out.println("git branched completed by Y");
		System.out.println("git branched completed by x");
	}

}
