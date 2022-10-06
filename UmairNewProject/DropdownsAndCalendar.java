package locatorsAndMethods;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownsAndCalendar {
	public DropdownsAndCalendar(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindAll({@FindBy(xpath="//select[@id='vfb-13-country']")})
	private WebElement country_dropdown;
	
	public WebElement getcountry_dropdown() {
		return country_dropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='vfb-13-country']/option")})
	private List<WebElement> countries;
	
	public List<WebElement> getcountries(){
		return countries;
	}
}
