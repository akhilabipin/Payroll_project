package test;

import org.testng.annotations.Test;

import pageobject.HomePage1;
import pageobject.LoginPage;
import utilities.BaseClass;

public class HomePage1Test extends BaseClass {
	LoginPage l;
	HomePage1 h1;
  @Test
  public void home1() throws InterruptedException {
	  l = new LoginPage(driver);
	  l.logindetails();
	  h1 = new HomePage1(driver);
	  h1.homeDetails1();
  }
}
