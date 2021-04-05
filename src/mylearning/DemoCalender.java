package mylearning;
import java.text.SimpleDateFormat;
//https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html
import java.util.Calendar;

public class DemoCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calendar cal = Calendar.getInstance();
     System.out.println(cal.getTime());
     
     SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy hh:mm:ss"); // can pass different types of argument 
     System.out.println(sdf.format(cal.getTime()));
     
     System.out.println(cal.get(Calendar.JANUARY));
     System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
