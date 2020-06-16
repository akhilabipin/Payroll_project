package test;
import org.testng.annotations.Test;

import pageobject.HomePage1;
import pageobject.HomePage2;
import pageobject.HomePage3;
import pageobject.HomePage4;
import pageobject.LoginPage;
import utilities.BaseClass;

public class HomePage4Test extends BaseClass {
	LoginPage l;
	HomePage1 h1;
	HomePage2 h2;
	HomePage3 h3;
	HomePage4 h4;
  @Test
  public void home4() throws InterruptedException {
	  l = new LoginPage(driver);
	  l.logindetails();
	  h1 = new HomePage1(driver);
	  h1.homeDetails1();
	  h2 = new HomePage2(driver);
	  h2.homeDeatils2();
	  h3 = new HomePage3(driver);
	  h3.homeDetails3();
	  h4 = new HomePage4(driver);
	  h4.homeDetails4();
	  
  }
}
