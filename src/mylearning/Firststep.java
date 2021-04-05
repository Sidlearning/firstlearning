package mylearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firststep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Hello");
     System.setProperty("webdriver.chrome.driver","C:\\Automation\\BrowserDriver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver ();
     driver.get("https://google.com");
     System.out.println(driver.getTitle());
		
	 System.out.println(driver.getCurrentUrl()); 
	 driver.get("https://yahoo.com");
	 driver.navigate().back(); 
	 driver.navigate().forward(); 
	 driver.close();
		  //driver.quit();
	 //(//tagName[contains(@attribute,'value')] - xpath for regular expression
	 //(//tagName[@attribute='value'] - xpath syntax
	 //(//[@text()='value'] - xpath for text
	 // tagName[attribute ='value')] - css syntax, tagName#id, tagName.classname
	 // tagName[attribute* ='value')] - css for regular expression
	}
	

}
