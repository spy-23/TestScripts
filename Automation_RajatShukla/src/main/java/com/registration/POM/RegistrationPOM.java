package com.registration.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPOM {
	private WebDriver ldriver;

	public RegistrationPOM(WebDriver driver) {
		this.ldriver = driver;
		PageFactory.initElements(ldriver, this);

	}

	public void broswerlaunch(String browservalue) {
		if (browservalue.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ldriver = new ChromeDriver();
		}

		else if (browservalue.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			ldriver = new FirefoxDriver();
		}

		else if (browservalue.equalsIgnoreCase("EDGE")) {
			WebDriverManager.edgedriver().setup();
			ldriver = new EdgeDriver();
		}

		else {
			System.out.println("please check the data1.txt file from resource");
		}

	}

	public void url(String urlvalue) {
		ldriver.get(urlvalue);
	}

	public void navigatetourl(String urlnavigate) {
		ldriver.navigate().to(urlnavigate);
	}

	public void quitBrowser() {
		ldriver.quit();
	}

	public void namefield(String userfname) {
		ldriver.findElement(By.xpath("//input[@name='vfb-5']")).sendKeys(userfname);
	}

	public void lastfield(String userlname) {
		ldriver.findElement(By.xpath("//input[@name='vfb-7']")).sendKeys(userlname);
	}

	public void genderselect(String gender) {
		if (gender.contentEquals("Male")) {
			ldriver.findElement(By.id("vfb-8-1")).click();
		} else {
			ldriver.findElement(By.id("vfb-8-2")).click();
		}
	}

	public void adressfield(String adress) {
		ldriver.findElement(By.id("vfb-13-address")).sendKeys(adress);
	}

	public void streetadressfield(String StreetAddress) {
		ldriver.findElement(By.id("vfb-13-address-2")).sendKeys(StreetAddress);
	}

	public void aptfield(String apt) {
		ldriver.findElement(By.id("vfb-13-city")).sendKeys(apt);
	}

	public void cityfield(String city) {
		ldriver.findElement(By.id("vfb-13-zip")).sendKeys(city);
	}

	public void countryfield(String state) {
		List<WebElement> Statelist = ldriver.findElements(By.id("vfb-13-country"));
		for (WebElement li : Statelist) {
			if (li.getText().contains(state)) {
				li.click();

			}
		}
	}

	public void emailfield(String email) {
		ldriver.findElement(By.id("vfb-14")).sendKeys(email);
	}

	public void datefield(String demoDate) {
		ldriver.findElement(By.id("vfb-18")).sendKeys(demoDate);
	}

	public void mobilefield(String mobilenumber) {
		ldriver.findElement(By.id("vfb-19")).sendKeys(mobilenumber);
	}

	public void codefield(String code) {
		ldriver.findElement(By.id("vfb-3")).sendKeys(code);
		ldriver.findElement(By.id("vfb-4")).click();
	}
}
