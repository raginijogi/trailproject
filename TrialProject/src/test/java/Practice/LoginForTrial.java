package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import Base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginForTrial extends BaseClass {
	WebDriver driver;
	@Test
	public void Login() {
		
		driver = OpenBrowserWithDiffBrowsers("chrome");
		
		driver.get("https://cts.piervantage.com/Default.aspx?tabid=39");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		  driver.findElement(By.id("ctl02_txtUsername")).sendKeys("Sdhend");
		  driver.findElement(By.id("ctl02_txtPassword")).sendKeys("Master@1234");
		  driver.findElement(By.xpath("//input[@id='ctl02_btnLogin']")).click();
		  
		  driver.findElement(By.id("SlidingPanel_Gear")).click();
		 
		}
		

}
