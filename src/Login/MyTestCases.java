package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	WebDriver driver = new ChromeDriver();
	String theURL="https://automationteststore.com/";
	String singnupPage="https://automationteststore.com/index.php?rt=account/create";
	

	@BeforeTest
	public void mysetup()
	{
		driver.get(theURL);
		driver.manage().window().maximize();
		
	}
	
	
	@Test (priority=1)
	public void signup()
	{		driver.get(singnupPage);
	
	WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"AccountFrm_firstname\"]"));
	
	FirstName.sendKeys("Ahmad");

	
	
	}
	

	
}
