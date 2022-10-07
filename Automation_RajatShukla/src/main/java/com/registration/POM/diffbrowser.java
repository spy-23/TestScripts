package com.registration.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class diffbrowser {


		
	private WebDriver ldriver;

	public diffbrowser(WebDriver driver) {
		this.ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void broswerlaunch(String browservalue, String urlvalue) {

		if (browservalue.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			ldriver = new ChromeDriver();
			ldriver.get(urlvalue);
		}

		else if (browservalue.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			ldriver = new FirefoxDriver();
			ldriver.get(urlvalue);
		}

		else if (browservalue.equalsIgnoreCase("EDGE")) {

			WebDriverManager.edgedriver().setup();
			ldriver = new EdgeDriver();
			ldriver.get(urlvalue);
		}

		else {
			System.out.println("please check the data1.txt file from resource");
		}

	}

	
	public void quitBrowser() {
		ldriver.quit();

	}


	}
	
	


