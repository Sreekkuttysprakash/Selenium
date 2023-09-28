package mouseandkeyboard_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToWindow_Exmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement click_here = driver.findElement(By.xpath("//a[text()='Click Here']"));
		click_here.click();
		//WebElement new_window = driver.findElement(By.xpath("//h3[text()='New Window']"));
		//String s = new_window.getText();
		//System.out.println(s);
		String s = driver.getWindowHandle();
		System.out.println(s);
	}

}
