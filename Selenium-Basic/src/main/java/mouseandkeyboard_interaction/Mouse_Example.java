package mouseandkeyboard_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
	   
		WebElement img = driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(img).build().perform();
	    actions.click(img).build().perform();
	    actions.click();
	}

}
