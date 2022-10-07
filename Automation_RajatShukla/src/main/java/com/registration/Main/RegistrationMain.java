package com.registration.Main;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.registration.POM.RegistrationPOM;
import com.registration.POM.datareader;
import com.registration.POM.diffbrowser;

public class RegistrationMain {
	private String path = "C:\\Users\\rajat\\OneDrive\\Desktop\\Selenium_Java_project\\Automation_RajatShukla\\src\\main\\resources\\userdata.txt";
	private WebDriver driver;
	datareader b1 = new datareader();
	RegistrationPOM rpom = new RegistrationPOM(driver);
	String URL;

	@BeforeMethod
	public void beforeMethod() throws IOException {
		String browser = b1.readfile(path, "browser");
		this.URL = b1.readfile(path, "url");
		rpom.broswerlaunch(browser);
		rpom.url(URL);
	}

	@Test
	public void usertest1() throws IOException, InterruptedException {

		String userfname = b1.readfile(path, "userfname");
		String userlname = b1.readfile(path, "userlname");
		String gender = b1.readfile(path, "gender");
		String adress = b1.readfile(path, "adress");
		String StreetAddress = b1.readfile(path, "StreetAddress");
		String apt = b1.readfile(path, "apt");
		String city = b1.readfile(path, "city");
		String state = b1.readfile(path, "state");
		String email = b1.readfile(path, "email");
		String DemoDate = b1.readfile(path, "DemoDate");
		String mobilenumber = b1.readfile(path, "mobilenumber");
		String code = b1.readfile(path, "code");

		rpom.namefield(userfname);
		rpom.lastfield(userlname);
		rpom.genderselect(gender);
		rpom.adressfield(adress);
		System.out.println(StreetAddress);
		rpom.streetadressfield(StreetAddress);
		rpom.aptfield(apt);
		rpom.cityfield(city);
		rpom.countryfield(state);
		rpom.emailfield(email);
		rpom.datefield(DemoDate);
		rpom.mobilefield(mobilenumber);
		Thread.sleep(2000);
		rpom.codefield(code);
	}

	@Test
	public void usertest2() throws IOException, InterruptedException {

		String userfname = b1.readfile(path, "userfname1");
		String userlname = b1.readfile(path, "userlname1");
		String gender = b1.readfile(path, "gender1");
		String adress = b1.readfile(path, "adress1");
		String StreetAddress = b1.readfile(path, "StreetAddress1");
		String apt = b1.readfile(path, "apt1");
		String city = b1.readfile(path, "city1");
		String state = b1.readfile(path, "state1");
		String email = b1.readfile(path, "email1");
		String DemoDate = b1.readfile(path, "DemoDate1");
		String mobilenumber = b1.readfile(path, "mobilenumber1");
		String code = b1.readfile(path, "code1");
		
		rpom.navigatetourl(URL);
		rpom.namefield(userfname);
		rpom.lastfield(userlname);
		rpom.genderselect(gender);
		rpom.adressfield(adress);
		rpom.streetadressfield(StreetAddress);
		rpom.aptfield(apt);
		rpom.cityfield(city);
		rpom.countryfield(state);
		rpom.emailfield(email);
		rpom.datefield(DemoDate);
		rpom.mobilefield(mobilenumber);
		Thread.sleep(2000);
		rpom.codefield(code);
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {

		Thread.sleep(10000);
		rpom.quitBrowser();

	}

}
