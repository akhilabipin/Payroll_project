package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage1 {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath ="//*[contains(@href,'/payrollapp/timesheet/index') and text() = 'TimeSheet']")
	WebElement time;
	
	public void homeDetails1() throws InterruptedException {
		
		Thread.sleep(4000);
		time.click();
}
	public HomePage1(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	}
