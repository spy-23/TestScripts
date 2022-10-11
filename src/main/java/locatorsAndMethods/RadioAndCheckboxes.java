package locatorsAndMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioAndCheckboxes {
	public RadioAndCheckboxes(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//RADIO BUTTONS OF GENDER
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-8-1']")})
	private WebElement male_radio_button;
	
	public WebElement getmale_radio_button() {
		return male_radio_button;
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-8-2']")})
	private WebElement female_radio_button;
	
	public WebElement getfemale_radio_button() {
		return female_radio_button;
	}
	
	public void clickGender(String Gender) {
		if(Gender.contains("male")) {
			//male_radio_button.clear();
			male_radio_button.click();
		}else if(Gender.contains("female")) {
			//female_radio_button.clear();
			female_radio_button.click();
		}else{
			System.out.println("Gender is wrong");
		}
	}
	
	//CHECKBOX OF COURSE INTERESTED
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-20-0']")})
	private WebElement selenium_checkbox;
	
	public WebElement getselenium_checkbox() {
		return selenium_checkbox;
	}
	
	public void check_selenium_checkbox() {
		selenium_checkbox.click();
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-20-1']")})
	private WebElement UFT_checkbox;
	
	public WebElement getUFT_checkbox() {
		return UFT_checkbox;
	}
	
	public void check_UFT_checkbox() {
		UFT_checkbox.click();
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-20-2']")})
	private WebElement TestNG_checkbox;
	
	public WebElement getTestNG_checkbox() {
		return TestNG_checkbox;
	}
	
	public void check_TestNG_checkbox() {
		TestNG_checkbox.click();
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-20-3']")})
	private WebElement CoreJava_checkbox;
	
	public WebElement getCoreJava_checkbox() {
		return CoreJava_checkbox;
	}
	
	public void check_CoreJava_checkbox() {
		CoreJava_checkbox.click();
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-20-4']")})
	private WebElement FunctionalTesting_checkbox;
	
	public WebElement getFuncionalTesting_checkbox() {
		return FunctionalTesting_checkbox;
	}
	
	public void check_FunctionalTesting_checkbox() {
		FunctionalTesting_checkbox.click();
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-20-5']")})
	private WebElement Others_checkbox;
	
	public WebElement getOthers_checkbox() {
		return Others_checkbox;
	}
	
	public void check_Others_checkbox() {
		Others_checkbox.click();
	}
}
