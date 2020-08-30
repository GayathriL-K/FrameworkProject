package TestCase;

import org.testng.annotations.Test;

import PageFactoryDesign.HomePage;
import Utilities.Browser;
import appModules.Profile;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test(priority=1)
  public void f() {
	  HomePage.Sampleforms().click();
  }
  
  /*
  @Test(priority=2)
  public void f1() throws Exception {
	Profile.register();
  }*/
  
  @BeforeClass
  public void beforeClass() {
	  Browser.initiate(2);
  }

  @AfterClass
  public void afterClass() {
	  Browser.kill();
  }

}
