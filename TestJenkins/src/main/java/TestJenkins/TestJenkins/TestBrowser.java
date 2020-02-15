package TestJenkins.TestJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowser {
	
	
	@Test
	public void TestBrowserLaunch() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssp34\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.navigate().to("https://google.com");
		driver.close();
		
		
		
		
	}

}
