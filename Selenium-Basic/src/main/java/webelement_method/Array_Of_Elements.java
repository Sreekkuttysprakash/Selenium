package webelement_method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Array_Of_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
		driver.manage().window().maximize();
		//WebElement table = driver.findElement(By.xpath("//ul[@class='navbar-nav']//li[4]//a"));
		//String table_text = table.getText();
		//System.out.println(table_text);
		
		//WebElement table1 = driver.findElement(By.xpath("//ul[@class='navbar-nav']//li//a"));
		//String table1_text = table1.getText();
		//System.out.println(table1_text);
		
		List<WebElement> header_list = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
		int table1 = header_list.size();
		System.out.println(table1);
		System.out.println(header_list.get(7).getText());
		for(int i=0;i<header_list.size();i++) {
			String header_name = header_list.get(i).getText();
			System.out.println(header_name);
		}
		
		
	}

}
