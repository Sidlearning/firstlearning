package mylearning;

public class DemoException {
	
	int i = 5;
	int j = 0;
	public void getdivision()
	{
	try {
		int k = i/j;
		System.out.println(k);
	}
	catch (ArithmeticException ae)
	{System.out.println("caught arthimetic exception");
	}
	catch(IndexOutOfBoundsException ets) 
	{ System.out.println("I catched the IndexBound/exception");
	}
	catch (Exception e)
	{System.out.println("Caught generic exception");
	}
	finally
	{
		System.out.println("print finally method");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoException obj1 = new DemoException();
		obj1.getdivision();
		

	}

}
