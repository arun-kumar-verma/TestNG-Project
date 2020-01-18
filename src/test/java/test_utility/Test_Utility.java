package test_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Utility extends base.Base{
	
	public void click_on_visiblity(WebDriver driver, WebElement element, int t) {
		
		WebDriverWait wait= new WebDriverWait(driver, t);
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}
	
	public void check_visibility(WebDriver driver, WebElement element, int t) {
		WebDriverWait wait= new WebDriverWait(driver, t);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
