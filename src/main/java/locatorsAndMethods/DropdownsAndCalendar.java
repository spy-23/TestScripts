package locatorsAndMethods;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownsAndCalendar {
	WebDriver driver;
	public DropdownsAndCalendar(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//COUNTRY DROPDOWN
	
	@FindAll({@FindBy(xpath="//select[@id='vfb-13-country']")})
	private WebElement country_dropdown;
	
	public WebElement getcountry_dropdown() {
		return country_dropdown;
	}
	
	public void selectCountry(String CountryName) {
		Select dropdown = new Select(country_dropdown);
		dropdown.selectByVisibleText(CountryName);

	}
	
	//CALENDAR
	
	@FindAll({@FindBy(xpath="//input[@id='vfb-18']")})
	private WebElement calendar_box;
	
	public WebElement getcalendar_box() {
		return calendar_box;
	}
	
	@FindAll({@FindBy(xpath="//a[@class='ui-state-default']")})
	private List<WebElement> calendar_dates;
	
	public List<WebElement> getcalendar_dates(){
		return calendar_dates;
	}
	
	public void selectDate(String date) {
		calendar_box.click();
		for(WebElement datee:calendar_dates) {
			if(datee.getText().equals(date)) {
				datee.click();
				break;
			}
		}
	}
	
	//CONVENIENT TIME
	
	@FindAll({@FindBy(xpath="//select[@id='vfb-16-hour']")})
	private WebElement time_hourdropdown;
	
	public WebElement gettime_hourbox() {
		return time_hourdropdown;
	}
	
	@FindAll({@FindBy(xpath="//select[@id='vfb-16-min']")})
	private WebElement time_minutedropdown;
	
	public WebElement gettime_minutebox() {
		return time_minutedropdown;
	}
	
	public void selectConveientTime(String Hours,String Minute) {
		Select hour = new Select(time_hourdropdown);
		hour.selectByVisibleText(Hours);
		Select minute = new Select(time_minutedropdown);
		minute.selectByVisibleText(Minute);
	}
}
