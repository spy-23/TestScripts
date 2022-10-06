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
			male_radio_button.click();
		}else if(Gender.contains("female")) {
			female_radio_button.click();
		}else{
			System.out.println("Gender is wrong");
		}
	}
}
