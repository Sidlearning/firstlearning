package mylearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\BrowserDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
	Thread.sleep(2000);
	List<WebElement> Wb = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	
    for ( WebElement a : Wb)
    {
    	if (a.getText().equalsIgnoreCase("India"))
    	{
    		a.click();
    		break;
    		
    	}
    }

	}

}
