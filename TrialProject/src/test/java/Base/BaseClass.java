package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	
	public WebDriver OpenBrowserWithDiffBrowsers(String BrowserN) {
		
		
		if(BrowserN=="chrome") {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		}else if(BrowserN=="Edge") {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
		}
		return driver;
	}

}
