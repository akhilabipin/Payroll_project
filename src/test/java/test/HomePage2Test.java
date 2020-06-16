package test;

import org.testng.annotations.Test;

import pageobject.HomePage1;
import pageobject.HomePage2;
import pageobject.LoginPage;
import utilities.BaseClass;

public class HomePage2Test extends BaseClass {
	LoginPage l;
	HomePage1 h1;
	HomePage2 h2;
	
	
  @Test
  public void home2() throws InterruptedException {
	  l = new LoginPage(driver);
	  l.logindetails();
	  h1 = new HomePage1(driver);
	  h1.homeDetails1();
	  h2 = new HomePage2(driver);
	  h2.homeDeatils2();
  }
}
