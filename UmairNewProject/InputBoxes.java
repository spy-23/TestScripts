package locatorsAndMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputBoxes {
	public InputBoxes(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-5']")})
	private WebElement first_name_inputbox;
	
	public WebElement getfirst_name_inputbox() {
		return first_name_inputbox;
	}
	
	public void enterFirst_Name(String FirstName) {
		first_name_inputbox.sendKeys(FirstName);
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-7']")})
	private WebElement last_name_inputbox;
	
	public WebElement getlast_name_inputbox() {
		return last_name_inputbox;
	}
	
	public void enterLast_Name(String LastName) {
		last_name_inputbox.sendKeys(LastName);
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-13-address']")})
	private WebElement streetAddress_inputbox;
	
	public WebElement getstreetAddress_inputbox() {
		return streetAddress_inputbox;
	}
	
	public void enterStreetAddress(String StreetAddress) {
		streetAddress_inputbox.sendKeys(StreetAddress);
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-13-address-2']")})
	private WebElement building_inputbox;
	
	public WebElement getbuilding_inputbox() {
		return building_inputbox;
	}
	
	public void enterBuildingAddress(String BuildingAddress) {
		building_inputbox.sendKeys(BuildingAddress);
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-13-city']")})
	private WebElement city_inputbox;
	
	public WebElement getcity_inputbox() {
		return city_inputbox;
	}
	
	public void enterCity(String City) {
		city_inputbox.sendKeys(City);
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-13-state']")})
	private WebElement state_inputbox;
	
	public WebElement getstate_inputbox() {
		return state_inputbox;
	}
	
	public void enterState(String State) {
		state_inputbox.sendKeys(State);
	}
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-13-zip']")})
	private WebElement zipcode_inputbox;
	
	public WebElement getzipcode_inputbox() {
		return zipcode_inputbox;
	}
	
	public void enterZipcode(String Zipcode) {
		zipcode_inputbox.sendKeys(Zipcode);
	}
}
