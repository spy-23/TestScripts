package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import locatorsAndMethods.DropdownsAndCalendar;
import locatorsAndMethods.InputBoxes;
import locatorsAndMethods.RadioAndCheckboxes;

public class Execute {
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		InputBoxes input = new InputBoxes(driver);
		input.enterFirst_Name("Umair");
		RadioAndCheckboxes radio = new RadioAndCheckboxes(driver);
		radio.clickGender("female");
		DropdownsAndCalendar dropdown = new DropdownsAndCalendar(driver);
		dropdown.selectCountry("India");
		dropdown.selectDate("21");
		dropdown.selectConveientTime("12","55");
		//GIT TESTING
		
	}
}
