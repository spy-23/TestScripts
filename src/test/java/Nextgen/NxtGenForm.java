package Nextgen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory; 

public class NxtGenForm { 

	
	private WebDriver driver;
	
	public NxtGenForm(WebDriver driver) {
		this.setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="vfb-5") private WebElement Firstname;
	@FindBy(id="vfb-7") private WebElement Lastname;
	@FindBy(id="vfb-8-1") private WebElement Male;
	@FindBy(id="vfb-8-2") private WebElement Female;
	
	
	public void setFirstname (String firstname) {
		Firstname.sendKeys(firstname);
	}
	
	public void setLastname (String lastname) {
		Lastname.sendKeys(lastname);		
	}
	
	public void setGender (String gender) {
		if(gender.equalsIgnoreCase("male")) {
			Male.click();
		}
		else if(gender.equalsIgnoreCase("female")) {
				Female.click();
			}
		}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	}
	
		
		
	

	
	






