package xpath_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\CHROME\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement head_office = driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[3]"));
		String s = head_office.getText();
		System.out.println(s);
		System.out.println("--------");
		
		List<WebElement> heading = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
		/*Using normal for loop
		for(int i=0; i<heading.size();i++) 
		{
		 String s1 = heading.get(i).getText();
			 System.out.println(s1);	 
		}*/
		
		// Using enhanced for loop
		for(WebElement i :heading )
		{
			 String s2 = i.getText();
			 System.out.println(s2);	 
	}
		WebElement data = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[6]//td[3]"));
		String s3 = data.getText();
		System.out.println(s3);
		System.out.println("--------");
		
		List<WebElement> column_data = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement i :column_data)
		{
			 String cd = i.getText();
			 System.out.println(cd);
			 System.out.println("--------");
		}

		List<WebElement> row_data = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td"));
		for(WebElement i :row_data)
		{
			 String r = i.getText();
			 System.out.println(r);
		}
}
}