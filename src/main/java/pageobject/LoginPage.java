package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;
	  
	@CacheLookup
	@FindBy(id = "loginform-username")
	WebElement user;

	@CacheLookup
	@FindBy(id ="loginform-password")
	WebElement pswrd;

	@CacheLookup
	@FindBy(how = How.NAME, using ="login-button")
	//@FindBy(name ="Login")
	WebElement Login;

	public void logindetails() {
		user.sendKeys("carol");
		pswrd.sendKeys("1q2w3e4r");
		Login.submit();
		
	}

	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
}
