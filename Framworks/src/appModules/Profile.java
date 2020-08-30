package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageFactoryDesign.BaseClass;
import PageFactoryDesign.HomePage;
import PageFactoryDesign.Signup;
import Utilities.Constant;
import Utilities.ExcelUtil;
import Utilities.Userdefinedfunction;

public class Profile extends BaseClass{

	public Profile(WebDriver driver, WebElement element) {
		super(driver, element);
		// TODO Auto-generated constructor stub
	}

	public static void register() throws Exception
	{
		ExcelUtil.setexcel(Constant.path_Testdata+Constant.file, "Sheet1");
		for(int iRow=1;iRow<=2;iRow++)
		{
			HomePage.Signup().click();			
			Signup.name().sendKeys(ExcelUtil.getcell(iRow,0));
			Signup.email().sendKeys(ExcelUtil.getcell(iRow,1));
			Signup.user_signup().sendKeys(ExcelUtil.getcell(iRow,2));
			Signup.pass_signup().sendKeys(ExcelUtil.getcell(iRow,3));
			Signup.retypepass().sendKeys(ExcelUtil.getcell(iRow,4));
			Signup.useragree().click();
			Signup.Submit().click();
				Userdefinedfunction.Takescreenshot(driver,"Signup");


				 WebElement e=driver.findElement(By.id("success_status"));		
				 if(e.isDisplayed())
				 {
					 System.out.println("Pass");
					ExcelUtil.setcell("Pass",iRow,5);
				}else
				{
					System.out.println("Fail");
					ExcelUtil.setcell("Fail",iRow,5);
				}

				
		}
	}
}
