package mylearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\BrowserDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	String dropid = "ctl00_mainContent_DropDownListCurrency";
	driver.findElement(By.id(dropid)).click();
	WebElement webdropid = driver.findElement(By.id(dropid));
	Select dropdown = new Select(webdropid);
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	

	}

}
