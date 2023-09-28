package xpath_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	   // WebElement xpath = driver.findElement(By.xpath("//button[text()='Log in']"));
	   // xpath.click();
		Thread.sleep(2000);
		 WebElement forgottenaccount = driver.findElement(By.xpath("//a[contains(text(),'Forgotten account')]"));
		 forgottenaccount.click();
	}

}
