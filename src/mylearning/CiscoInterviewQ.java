package mylearning;

public class CiscoInterviewQ {

	public static void main(String[] args) {
		int abc[][] = {{2,11,5},
				       {3,5,7},
				       {1,15,9}};
		
		int minrow = abc[0][0];
		int mincolumn = 0;
		    for (int i=0;i<3;i++)
			{
				 for (int j=0;j<3;j++)	
				 {
				  if (abc[i][j] < minrow)
					  {minrow = abc[i][j];
					   mincolumn = j;
					  }
				 }
			}
		System.out.println(minrow + "and column is " + mincolumn);
		int maxcolumn = abc[0][mincolumn];
		for (int k=0; k<3; k++)
		{if(maxcolumn < abc[k][mincolumn])
		  {maxcolumn = abc[k][mincolumn];
		  }
		 
	    }
		System.out.println("maxcolumn for minrow is  " + maxcolumn);
}
}
