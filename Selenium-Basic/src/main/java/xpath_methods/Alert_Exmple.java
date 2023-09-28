package xpath_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_Exmple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	    WebElement jsalert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
	    jsalert.click();
	    driver.switchTo().alert().accept();
	    WebElement jsconfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
	    jsconfirm.click();
	    String s = driver.switchTo().alert().getText();
	    System.out.println(s);
	    driver.switchTo().alert().dismiss();
	    WebElement jsprompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
	    jsprompt.click();
	    driver.switchTo().alert().sendKeys("ok");
	    driver.switchTo().alert().accept();
	   
}
}