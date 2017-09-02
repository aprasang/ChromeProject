package chromepack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Selenium downloads/chrome driver exe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("https://www.google.com"); WebElement
		 * element=driver.findElement(By.id("lst-ib"));
		 * element.sendKeys("Java"); element.sendKeys(Keys.BACK_SPACE);
		 * Thread.sleep(1000); element.sendKeys("Python"); Thread.sleep(2000);
		 * driver.close();
		 */

		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("adi.prasangi@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ADI@345i", Keys.ENTER);
		/*
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//input[@id='u_0_r']")).click();
		 * Thread.sleep(1000); Actions action = new Actions(driver);
		 * action.sendKeys(Keys.ESCAPE);
		 * 
		 * driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).
		 * click(); Thread.sleep(1000);
		 */
	}

}
