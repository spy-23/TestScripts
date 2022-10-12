package com.registration.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
@Getter
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

	@FindAll({ @FindBy(xpath = "//input[@name='vfb-5']") })
	private WebElement txtuserfname;
	@FindAll({ @FindBy(xpath = "//input[@name='vfb-7']") })
	private WebElement txtuserlname;
	@FindAll({ @FindBy(xpath = "//*[@id='vfb-8-1']") })
	private WebElement txtusergender;
	@FindAll({ @FindBy(xpath = "//*[@id='vfb-13-address']") })
	private WebElement txtuseraddress;
	@FindAll({ @FindBy(xpath = "//*[@id='vfb-13-address']") })
	private WebElement txtuserstreetaddress;
	@FindAll({ @FindBy(xpath = "//*[@id='vfb-13-city']") })
	private WebElement txtuserapt;
	@FindAll({ @FindBy(id = "vfb-13-zip") })
	private WebElement txtusercity;
	@FindAll({ @FindBy(xpath = "//*[@name='vfb-13[country]']") })
	private WebElement txtusercountry;
	@FindAll({ @FindBy(id = "vfb-14") })
	private WebElement txtuseremail;
	@FindAll({ @FindBy(id = "vfb-18") })
	private WebElement txtuserdate;
	@FindAll({ @FindBy(id = "vfb-19") })
	private WebElement txtusermobile;
	@FindAll({ @FindBy(id = "vfb-23") })
	private WebElement txtuserquery;
	@FindAll({ @FindBy(id = "vfb-3") })
	private WebElement txtuserverificationcode;
	@FindAll({ @FindBy(id = "vfb-4") })
	private WebElement txtusersubmit;

	public void namefield(String userfname) {
		txtuserfname.clear();
		txtuserfname.sendKeys(userfname);
	}

	public void lastfield(String userlname) {
		txtuserlname.click();
		txtuserlname.sendKeys(userlname);
	}

	public void genderselect(String gender) {
		if (gender.contentEquals("Male")) {
			txtusergender.click();
		} else {
			txtusergender.click();
		}
	}

	public void adressfield(String adress) {
		txtuseraddress.clear();
		txtuseraddress.sendKeys(adress);
	}

	public void streetadressfield(String StreetAddress) {
		txtuserstreetaddress.clear();
		txtuserstreetaddress.sendKeys(StreetAddress);
	}

	public void aptfield(String apt) {
		txtuserapt.clear();
		txtuserapt.sendKeys(apt);
	}

	public void cityfield(String city) {
		txtusercity.clear();
		txtusercity.sendKeys(city);
	}

	public void countryfield(String state) {
		txtusercountry.click();
		List<WebElement> Statelist = ldriver.findElements(By.xpath("//*[@name='vfb-13[country]']/option"));
		for (WebElement li : Statelist) {
			if (li.getText().contains(state)) {
				li.click();
				break;
			}
		}
	}

	public void emailfield(String email) {
		txtuseremail.clear();
		txtuseremail.sendKeys(email);
	}

	public void datefield(String demoDate) {
		txtuserdate.clear();
		txtuserdate.sendKeys(demoDate);
	}

	public void mobilefield(String mobilenumber) {
		txtusermobile.clear();
		txtusermobile.sendKeys(mobilenumber);
	}

	public void querymessage(String query) {
		txtuserquery.clear();
		txtuserquery.sendKeys(query);
	}

	public void verificationcodefield(String code) {
		txtuserverificationcode.clear();
		txtuserverificationcode.sendKeys(code);
	}

	public void submitbutton() {
		txtusersubmit.click();
	}
}
