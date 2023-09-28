package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LauncBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Akshay\\Desktop\\EDGE\\msedgedriver.exe");
WebDriver driver = new ChromeDriver(options);//runtime

		//WebDriver driver = new EdgeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//ChromeDriver driver = new ChromeDriver();//compiletime
		//driver = new EdgeDriver();
		//driver = new ChromeDriver();
		//WebDriver driver = new OperaDriver();
	}	

}
