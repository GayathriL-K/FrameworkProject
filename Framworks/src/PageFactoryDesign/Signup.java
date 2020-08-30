package PageFactoryDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup extends BaseClass{
	public Signup(WebDriver driver, WebElement element) {
		super(driver, element);
		// TODO Auto-generated constructor stub
	}
	public static WebElement name()
	{
		element=driver.findElement(By.id("name"));
				return element;
		
	}
	public static WebElement email()
	{
		element=driver.findElement(By.id("email"));
				return element;
		
	}
	public static WebElement user_signup()
	{
		element=driver.findElement(By.id("user_signup"));
				return element;
		
	}
	public static WebElement pass_signup()
	{
		element=driver.findElement(By.id("pass_signup"));
				return element;
		
	}
	public static WebElement retypepass()
	{
		element=driver.findElement(By.id("pass2"));
				return element;
		
	}
	public static WebElement useragree()
	{
		element=driver.findElement(By.id("useragree"));
				return element;
		
	}
	public static WebElement Submit()
	{
		element=driver.findElement(By.name("Submit"));
				return element;
		
	}
	
}

