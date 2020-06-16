package utilities;


import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	public WebDriver driver;
  
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Bipin\\Desktop\\chrome\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("http://www.qabible.in/payrollapp/site/login");
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.close();
  }

}
