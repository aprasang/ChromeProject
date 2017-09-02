package chromepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maxlength {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Selenium downloads/chrome driver exe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		WebElement username = driver.findElement(By.id("usernameId"));
		String len = username.getAttribute("maxlength");

		System.out.println(len);
		driver.close();

	}

}
