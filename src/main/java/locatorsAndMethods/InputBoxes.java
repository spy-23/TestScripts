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
	
	//FIRST NAME
	@FindAll({@FindBy(xpath="//input[@id='vfb-5']")})
	private WebElement first_name_inputbox;
	
	public WebElement getfirst_name_inputbox() {
		return first_name_inputbox;
	}
	
	public void enterFirst_Name(String FirstName) {
		first_name_inputbox.clear();
		first_name_inputbox.sendKeys(FirstName);
	}
	
	//LAST NAME
	@FindAll({@FindBy(xpath="//input[@id='vfb-7']")})
	private WebElement last_name_inputbox;
	
	public WebElement getlast_name_inputbox() {
		return last_name_inputbox;
	}
	
	public void enterLast_Name(String LastName) {
		last_name_inputbox.clear();
		last_name_inputbox.sendKeys(LastName);
	}
	
	//STREET ADDRESS
	@FindAll({@FindBy(xpath="//input[@id='vfb-13-address']")})
	private WebElement streetAddress_inputbox;
	
	public WebElement getstreetAddress_inputbox() {
		return streetAddress_inputbox;
	}
	
	public void enterStreetAddress(String StreetAddress) {
		streetAddress_inputbox.sendKeys(StreetAddress);
	}
	
	//BUILDING
	@FindAll({@FindBy(xpath="//input[@id='vfb-13-address-2']")})
	private WebElement building_inputbox;
	
	public WebElement getbuilding_inputbox() {
		return building_inputbox;
	}
	
	public void enterBuildingAddress(String BuildingAddress) {
		building_inputbox.sendKeys(BuildingAddress);
	}
	
	//CITY
	@FindAll({@FindBy(xpath="//input[@id='vfb-13-city']")})
	private WebElement city_inputbox;
	
	public WebElement getcity_inputbox() {
		return city_inputbox;
	}
	
	public void enterCity(String City) {
		city_inputbox.sendKeys(City);
	}
	
	//STATE
	@FindAll({@FindBy(xpath="//input[@id='vfb-13-state']")})
	private WebElement state_inputbox;
	
	public WebElement getstate_inputbox() {
		return state_inputbox;
	}
	
	public void enterState(String State) {
		state_inputbox.sendKeys(State);
	}
	
	//ZIPCODE
	@FindAll({@FindBy(xpath="//input[@id='vfb-13-zip']")})
	private WebElement zipcode_inputbox;
	
	public WebElement getzipcode_inputbox() {
		return zipcode_inputbox;
	}
	
	public void enterZipcode(String Zipcode) {
		zipcode_inputbox.sendKeys(Zipcode);
	}
	
	//EMAIL
	@FindAll({@FindBy(xpath ="//input[@id='vfb-14']")})
	private WebElement email_inputbox;
	
	public WebElement getemail_inputbox() {
		return email_inputbox;
	}
	
	public void enterEmail(String Email) {
		email_inputbox.sendKeys(Email);
	}
	
	//MOBILE NUMBER
	@FindAll({@FindBy(xpath ="//input[@id='vfb-19']")})
	private WebElement mobile_inputbox;
	
	public WebElement getmobile_inputbox() {
		return mobile_inputbox;
	}
	
	public void enterMobileNumber(String MobileNumber) {
		mobile_inputbox.sendKeys(MobileNumber);
	}
	
	//QUERY
	@FindAll({@FindBy(xpath ="//textarea[@id='vfb-23']")})
	private WebElement query_inputbox;
	
	public WebElement getquery_inputbox() {
		return query_inputbox;
	}
	
	public void enterQuery(String Query) {
		query_inputbox.sendKeys(Query);
	}
	
	//VERIFICATION
	@FindAll({@FindBy(xpath ="//input[@id='vfb-3']")})
	private WebElement verification_inputbox;
	
	public WebElement getverification_inputbox() {
		return verification_inputbox;
	}
	
	public void verification() {
		verification_inputbox.sendKeys("99");
	}
	
	//SUBMIT
	@FindAll({@FindBy(xpath ="//input[@id='vfb-4']")})
	private WebElement submit_button;
	
	public WebElement getSubmit_button() {
		return submit_button;
	}
	
	public void click_submit_button() {
		submit_button.click();
	}
}
