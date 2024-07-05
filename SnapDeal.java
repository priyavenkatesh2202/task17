package task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException    {
		
		
		// open the browser
		WebDriver driver = new ChromeDriver();
		
		// launch the URL
		driver.get("http://www.snapdeal.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// to click on sign in 
		driver.findElement(By.className("accountInner")).click();
		
		//to click on login button
		driver.findElement(By.xpath("//a[contains(text(),'login')]")).click();
		
		// switch to the frame to fetch the attributes
		driver.switchTo().frame("loginIframe");
		
		//enter the username
		driver.findElement(By.id("userName")).sendKeys("9566700270");
		
		
		// click on continue button
		driver.findElement(By.xpath("//button[contains(text(),'continue')]")).click();
		
		
		Thread.sleep(15000);
	
		
		// after otp enterd click on continue 
		driver.findElement(By.id("loginUsingOtp")).click();
	
		// to check whether the page is logged in
		String title = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']")).getText();
		
		System.out.println( title);
		
		
	}

}
