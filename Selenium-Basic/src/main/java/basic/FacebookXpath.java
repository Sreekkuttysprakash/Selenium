package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement emailfield = driver.findElement(By.xpath("//input[@name='email']"));
		//emailfield.sendKeys("sree123@gmail.com");
	
		//WebElement passfield = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		//passfield.sendKeys("sreee");
		
		 WebElement loginfield = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		 loginfield.click();
		
	}

}
