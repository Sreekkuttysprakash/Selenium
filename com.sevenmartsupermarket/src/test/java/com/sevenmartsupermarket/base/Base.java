package com.sevenmartsupermarket.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sevenmartsupermarket.constants.Constants;
import com.sevenmartsupermarket.utilities.ScreenShot;
import com.sevenmartsupermarket.utilities.WaitUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	Properties properties = new Properties(); // java class 
	FileInputStream fi;                      //java class
	ScreenShot screenShot=new ScreenShot();
	
	public Base() {
		try {
			fi = new FileInputStream(Constants.CONFIG_FILE_PATH); // to read
			properties.load(fi); // to load
		} catch (Exception e) {
			e.printStackTrace(); 
			System.out.println("File not found");
		}
	}

	/* Launching Browser **/
	public void initialize(String browser, String url) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("remote-allow-origins=*");
			driver = new ChromeDriver(options);
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WaitUtility.PAGE_LOAG_TIMEOUT));
	}

	@Parameters("browser")
	@BeforeMethod(enabled = false, alwaysRun = true )
	public void launchBrowser(String browser) {
		String url=properties.getProperty("url");
		initialize(browser, url);
	}
	
	@BeforeMethod(enabled = true, alwaysRun = true)
	public void launchBrowser() {
		String url = properties.getProperty("url");
		String browser = properties.getProperty("browser");
		initialize(browser, url);
	}

	@AfterMethod(alwaysRun = true)
	public void terminateSession(ITestResult itestresult) {
		if(itestresult.getStatus()==ITestResult.FAILURE) {
			screenShot.takeScreenShots(driver, itestresult.getName());
		}
		driver.close();
	}
}
