package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageFactoryDesign.BaseClass;

public class Userdefinedfunction extends BaseClass{

	public Userdefinedfunction(WebDriver driver, WebElement element) {
		super(driver, element);
		// TODO Auto-generated constructor stub
	}
	
	public static void Takescreenshot(WebDriver driver,String file) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(Constant.path_screenshot+file+".png"));
	}
}