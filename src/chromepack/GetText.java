package chromepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Selenium downloads/chrome driver exe/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		/*driver.get("https://demo.actitime.com/");
	WebElement element =	driver.findElement(By.xpath("//input[@id='username']"));
	element.sendKeys("adilaxmi");
		String textboxvalue=element.getAttribute("value");
		System.out.println(textboxvalue);*/
		
		driver.get("https://www.google.com");
	WebElement element=	driver.findElement(By.id("lst-ib"));
	String tooltip=element.getAttribute("title");
	System.out.println(tooltip);
		
	}

}
