package mouseandkeyboard_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecute_Exmple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;//explicit type conversion
		//js.executeScript("alert('sreekkutty')");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		js.executeScript("window.scrollBy(0,700)");
		WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
		js.executeScript("arguments[0].click();",cart);
		
	
	}

}
