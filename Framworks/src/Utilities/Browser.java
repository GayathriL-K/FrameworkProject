package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PageFactoryDesign.BaseClass;

public class Browser extends BaseClass{

	
   public Browser(WebDriver driver, WebElement element) {
		super(driver, element);
		// TODO Auto-generated constructor stub
	}

   public static void initiate(int i)
   {
	   switch(i)
	   {
		   case 1:
			   System.setProperty("webdriver.gecko.driver","F:\\Selenium\\Driver\\geckodriver.exe");
			   driver=new FirefoxDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			   driver.get(Constant.Url); 
			   break;
		   case 2:
			   System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Driver\\chromedriver.exe");
			   driver =new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			   driver.get(Constant.Url);
			   break;
		   case 3:
			   System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Driver\\IEDriverServer.exe");
			   driver =new InternetExplorerDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			   driver.get(Constant.Url);
			   break;
		   default:
			   System.out.println("Broswer is not working");
	   }
   }
    
   public static void kill()
   {
	   driver.quit();
   }


   

	
}
