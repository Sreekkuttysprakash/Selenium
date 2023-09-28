package webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Properties_ExampleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
		driver.manage().window().maximize();
		WebElement color = driver.findElement(By.xpath("//button[contains(text(),'Autoclosable success')]"));
		String s = color.getCssValue("background-color");
	    System.out.println(s);
	    String s1 = color.getCssValue("color");
	    System.out.println(s1);
	    String s2 = color.getCssValue("font-size");
	    System.out.println(s2);
	    String s3 = color.getCssValue("font-style");
	    System.out.println(s3);
	}

}
