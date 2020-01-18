package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Basetest {
	public static WebDriver driver;
	public WebElement element;
	public void openbrowser(String url, String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Arun\\Desktop\\jar\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Arun\\Desktop\\jar\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\Arun\\Desktop\\jar\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("Invalid browser, Please enter something from IE, Chrome or Firefox as a browser");
		}
		
	}
	public void closebrowser() {
		driver.quit();
	}
	
}
