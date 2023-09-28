package mouseandkeyboard_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Keyboard_Exmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//search.sendKeys("mobile"+Keys.ENTER);
	    search.sendKeys("woodland product");
	    search.sendKeys(Keys.BACK_SPACE);
	    search.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	    search.sendKeys(Keys.BACK_SPACE);
	}

}
