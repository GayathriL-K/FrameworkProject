package PageFactoryDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass{

	public HomePage(WebDriver driver, WebElement element) {
		super(driver, element);
		// TODO Auto-generated constructor stub
	}

	public static WebElement Home()
	{
		return element= driver.findElement(By.linkText("Home"));
	}
	
	public static WebElement Sampleforms()
	{
		element=driver.findElement(By.linkText("Sample Forms"));
		
		return element;
		
	}
	public static WebElement Features()
	{
		element=driver.findElement(By.linkText("Features"));
		
		return element;
		
	}
	public static WebElement Pricing()
	{
		element=driver.findElement(By.linkText("Pricing"));
		
		return element;
		
	}
	public static WebElement Help()
	{
		element=driver.findElement(By.linkText("Help"));
		
		return element;
		
	}
	public static WebElement AboutUs()
	{
		element=driver.findElement(By.linkText("About Us"));
		
		return element;
		
	}
	public static WebElement Resources()
	{
		element=driver.findElement(By.linkText("Resources"));
		
		return element;
		
	}
	
	
	public static WebElement Signup()
	{
		element=driver.findElement(By.xpath("//*[@id='right_col_middle']/a"));
		
		return element;
		
	}
	

}
