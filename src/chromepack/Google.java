package chromepack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.firefox.marionette", "D:/Selenium downloads/Browser server v.0.15.0/geckodriver-v0.15.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Ji");
		WebElement searchbox=driver.findElement(By.id("gs_htif0"));
	 boolean status=	searchbox.isEnabled();
	 if (status ==true)
	 {
		 System.out.println("enabled");
	 }
	 else
	 {
		 System.out.println("disabled");
	 }
		driver.findElement(By.id("gs_htif0")).sendKeys("Java",Keys.BACK_SPACE);
		Thread.sleep(1000);
		System.out.println("hi");
		driver.findElement(By.id("gs_htif0")).sendKeys("Python",Keys.BACK_SPACE);
		System.out.println("hello");
		Thread.sleep(1000);
		driver.close();

	}

}
