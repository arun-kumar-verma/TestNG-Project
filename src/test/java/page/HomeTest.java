package page;

//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test_utility.Test_Utility;


public class HomeTest extends Test_Utility{
	@Parameters({"URL","Browser"})
	@BeforeTest
	public void initialize(String url, String browser)
	{
		openbrowser(url, browser);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(priority=1)
	public void homepage() {		
		//to verify home page URL
		String currentURL=driver.getCurrentUrl();
		Assert.assertEquals(currentURL,"https://test.salesforce.com/");
		System.out.println("pass "+currentURL);
//		WebDriverWait wait=new WebDriverWait(driver, 120);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#co-close-icon-5c45cafefecfa77a6e04b5ba.icon.close"))));
//		check_visibility(driver, element, 60);
//		element=driver.findElement(By.xpath("//*[@id=\'co-close-icon-5c45cafefecfa77a6e04b5ba\']"));
//		click_on_visiblity(driver, element, 60);
		
	}

}
