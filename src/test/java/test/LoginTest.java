package test;

import java.io.IOException;

import org.testng.annotations.Test;

import jxl.read.biff.BiffException;
//import pageobject.Login;
import pageobject.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass {
	LoginPage l;
	
  @Test
  public void login() throws BiffException, IOException {
	  l = new LoginPage(driver);
	  l.logindetails();
	  
	 
	 
	  
  }
}
