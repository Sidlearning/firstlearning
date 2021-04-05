package mylearning;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Date d = new Date(); // date class
    System.out.println(d.toString());
    
    SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy hh:mm:ss"); // can pass different types of argument 
    System.out.println(sdf.format(d));
    		
	}

}
