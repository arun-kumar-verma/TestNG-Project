package test_utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Basetest;

public class Test_Utility extends Basetest{
	
	
	public void click_on_visiblity(WebDriver driver, WebElement element, int t) {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(t));
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}
	
	public void check_visibility(WebDriver driver, WebElement element, int t) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(t));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
