package mylearning;

public class pyramid {

	public static void main(String[] args) {
	  int k=0;
		for (int i=1; i<=3 ; i++)
		{
		   for (int j=0;j<i;j++)
		   { k=k+3;
		     System.out.print(k);
		     System.out.print("\t");
		   }
		   System.out.println("");
		}
	}

}
