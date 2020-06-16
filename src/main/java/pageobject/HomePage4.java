package pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HomePage4 {
	WebDriver driver;
	@CacheLookup
	@FindBy(id = "timesheet-branch_id")	
	WebElement branch;
	
	@CacheLookup
	@FindBy(id = "timesheet-division_id")
	WebElement division;
	
	@CacheLookup
	@FindBy(id = "timesheet-description")
	WebElement job;
	
	@CacheLookup
	@FindBy(id = "timesheet-timesheet_number")
	WebElement num;
	
	@CacheLookup
	@FindBy(id = "timesheet-date")
	WebElement date;
	
	@CacheLookup
	@FindBy(id = "timesheet-category")
	WebElement catagory;
	
	@CacheLookup
	@FindBy(id = "timesheet-employment_type")
	WebElement type;
	
	@CacheLookup
	@FindBy(id = "timesheet-po_number")
	WebElement po;
	
	@CacheLookup
	@FindBy(id = "rate-0-type_id")
	WebElement rate;
	
	@CacheLookup
	@FindBy(id = "rate-0-units")
	WebElement unit;
	
	@CacheLookup
	@FindBy(id = "rate-0-pay")
	WebElement pay;
	
	@CacheLookup
	@FindBy(id = "rate-0-bill")
	WebElement bill;
	
	@CacheLookup
	@FindBy(xpath = "//*[text() ='Save']")
	WebElement save;
	
	@CacheLookup
	@FindBy(id = "timesheet-direct_client")
	WebElement radio;
	
	@CacheLookup
	@FindBy(xpath = "//*[@name = 'Timesheet[client_id]']")
	WebElement client;
	
  
  public void homeDetails4() throws InterruptedException {
	  Thread.sleep(2000);
	  Select s = new Select(branch);
      Thread.sleep(3000);
      s.selectByVisibleText("Eastbourne");
      
      Thread.sleep(3000);
      Select s1 = new Select(division);
	  s1.selectByValue("1");
	  
	  Thread.sleep(3000);
	  Select s2 = new Select(job);
	  s2.selectByIndex(2);
	  
	  num.sendKeys("7");
	  date.sendKeys("30-03-2020");
	  
	  Select s3 = new Select(catagory);
	  s3.selectByValue("Contractor");
	  
	  Select s4 = new Select(type);
	  s4.selectByValue("Paye");
	  
	  po.sendKeys("17");
	  
	  boolean m = client.isEnabled();
	  System.out.println(m);
	  
	  /*client.click();
	  Select s6 = new Select(client);
	  Thread.sleep(10000);
	  s6.selectByIndex(3);*/
	  
	  radio.click();
	  
	  Select s5 = new Select(rate);
	  s5.selectByValue("5");
	  Thread.sleep(6000);
	  driver.switchTo().alert().accept();
	  
	  unit.sendKeys("11");
	  pay.sendKeys("50000");
	  bill.sendKeys("2");
	  
	  
	  
	  Thread.sleep(4000);
	  save.submit();;
	  
  }
  public HomePage4(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
}
