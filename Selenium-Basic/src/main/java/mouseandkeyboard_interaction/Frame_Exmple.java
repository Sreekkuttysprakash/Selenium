package mouseandkeyboard_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame_Exmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame-middle");
		WebElement frame_mid = driver.findElement(By.xpath("//div[text()='MIDDLE']"));
		String s = frame_mid.getText();
		System.out.println(s);
	}

}
