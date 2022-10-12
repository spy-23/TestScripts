package com.registration.Main;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.registration.POM.RegistrationPOM;
import com.registration.POM.datareader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationMain {
	private String path = "C:\\Users\\rajat\\OneDrive\\Desktop\\Selenium_Java_project\\Automation_RajatShukla\\src\\main\\resources\\userdata.txt";
	private WebDriver driver;

	String URL;

	@BeforeTest
	public void beforeMethod() throws IOException {
		datareader b1 = new datareader();
		this.URL = b1.readfile(path, "url");
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
	}

	/**
	 * Data provider concept that provide the data for test
	 * 
	 * @return
	 */
	@DataProvider
	public Object[][] getdata() {
		return new Object[][] {
				{ "rajat", "shukla", "Male", "1/1155 m vishal khand", "Gomti nagar", "1155M", "Lucknow", "India",
						"Rajat.shukla2122@gmail.com", "10/12/2022", "9999999999", "99" },
				{ "rahul", "shukla", "Male", "1/2244 V vikas khand", "Gomti nagar", "2244V", "Lucknow", "India",
						"rahul.shukla2122@gmail.com", "10/12/2022", "9898989898", "99" },
				{ "Seema", "singh", "Female", "2/2233 K vikrant khand", "Gomti nagar", "2233M", "Lucknow", "India",
						"seeema.singh2122@gmail.com", "10/12/2022", "7865432311", "99" } };
	}

	/**
	 * Test method which is using the dataProvider data to perform the test
	 * 
	 * @param userfname
	 * @param userlname
	 * @param gender
	 * @param adress
	 * @param StreetAddress
	 * @param apt
	 * @param city
	 * @param state
	 * @param email
	 * @param DemoDate
	 * @param mobilenumber
	 * @param code
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test(dataProvider = "getdata")
	public void usertest1(String userfname, String userlname, String gender, String adress, String StreetAddress,
			String apt, String city, String state, String email, String DemoDate, String mobilenumber, String code)
			throws IOException, InterruptedException {
		driver.get(URL);
		RegistrationPOM rpom = new RegistrationPOM(driver);
		System.out.println(rpom.getTxtuserfname());
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
		rpom.querymessage("This is the Query message");
		rpom.verificationcodefield(code);
		Thread.sleep(5000);
		rpom.submitbutton();
	}

	@AfterTest
	public void afterMethod() throws InterruptedException {

		RegistrationPOM rpom = new RegistrationPOM(driver);
		Thread.sleep(3000);
		rpom.quitBrowser();

	}

}
