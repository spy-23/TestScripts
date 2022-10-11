package execution;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constants.Configfilepath;
import io.github.bonigarcia.wdm.WebDriverManager;
import locatorsAndMethods.DropdownsAndCalendar;
import locatorsAndMethods.InputBoxes;
import locatorsAndMethods.RadioAndCheckboxes;
import locatorsAndMethods.ReadingFile;

public class Execute {
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		ReadingFile obj = new ReadingFile();
		Properties pro = obj.propertyReader(Configfilepath.CONFIG_FILE);
		String URl = pro.getProperty("url");
		driver.get(URl);
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "getData") 
	public void test1(String firstname, String lastname , String gender , String streetAddress , String building , String city , String state , String zipCode , String country , String email , String date , String hour , String minute , String phoneNumber , String query) throws IOException {
		ReadingFile obj = new ReadingFile();
		//String[] str = lastname.split("::");
		Properties pro = obj.propertyReader(Configfilepath.CONFIG_FILE);
		String URl = pro.getProperty("url");
		driver.get(URl);
		driver.manage().window().maximize();
		InputBoxes input = new InputBoxes(driver);
		input.enterFirst_Name(firstname);
		input.enterLast_Name(lastname);
		RadioAndCheckboxes radio = new RadioAndCheckboxes(driver);
		radio.clickGender(gender);
		input.enterStreetAddress(streetAddress);
		input.enterBuildingAddress(building);
		input.enterCity(city);
		input.enterState(state);
		input.enterZipcode(zipCode);
		DropdownsAndCalendar dropdown = new DropdownsAndCalendar(driver);
		dropdown.selectCountry(country);
		input.enterEmail(email);
		dropdown.selectDate(date);
		dropdown.selectConveientTime(hour,minute);
		input.enterMobileNumber(phoneNumber);
		radio.check_FunctionalTesting_checkbox();
		radio.check_selenium_checkbox();
		radio.check_TestNG_checkbox();
		input.enterQuery(query);
		input.verification();
		input.click_submit_button();
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {{"Umair","Meraj","male","233/3","J.K. Colony","Kanpur","UP","208010","India","umair.meraj@gmail.com","12","08","40","1212121212","What is lombok??"},
								{"Riya","Raghuvanshi","female","120/2","sector 10","Delhi","Delhi","121333","India","riya.raghuvanshi@gmail.com","15","10","30","0283628372","What is Selenium??"},
								{"Shivam","Yadav","male","101","sector 77","Gaziabad","UP","123456","India","shivam.yadav@gmail.com","25","11","10","9876543210","What is Java??"}};
	}
}
