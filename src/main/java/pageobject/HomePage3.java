package pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage3 {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//*[@type = 'submit' and text() = 'Skip']")
	WebElement skip;
  
  public void homeDetails3() throws InterruptedException {
      
	  Thread.sleep(2000);
	  skip.click();
	  Thread.sleep(6000);
	  Alert al2 =  driver.switchTo().alert();
      al2.accept();
  }
	
	public HomePage3(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
}
