package pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage2 {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//*[text() = 'Generate Playslip']")
	WebElement payslip;
	
	@CacheLookup
	@FindBy(xpath = "//*[text() = 'Generate Invoice']")
	WebElement invoice;
	
	@CacheLookup
	@FindBy(xpath = "//*[contains(@href,'/payrollapp/timesheet/create') and text() = 'Create Timesheet']")
	WebElement create;
  
  public void homeDeatils2() throws InterruptedException {
	  
	  payslip.click();
      //Alert Handling
	  
	  Alert al =  driver.switchTo().alert();
	  String b = al.getText();
	  System.out.println(b);
	  al.accept(); 
	  Thread.sleep(10000);
	  Alert al1 =  driver.switchTo().alert();
	  al1.accept();
      
	  invoice.click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(2000);
	  
	  
      create.click();
  }
  
  public HomePage2(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
}
