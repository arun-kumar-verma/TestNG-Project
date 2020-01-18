package page;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends base.Base{
	
	@Parameters({"Username","Password"})
	@Test
	public void register(String username,String password) {
	System.out.println("1");
//	WebDriverWait wait=new WebDriverWait(driver,60);
	driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	
	}
	
}
