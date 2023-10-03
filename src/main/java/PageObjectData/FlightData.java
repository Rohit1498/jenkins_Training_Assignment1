package PageObjectData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.CommonUtilities;

public class FlightData extends CommonUtilities {

	WebDriver driver;

	public FlightData(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/header/div/div[3]/a[3]")
	public WebElement Search_Field;
	
	@FindBy(xpath = "//*[@id=\"ctl00_mainContent_rbtnl_Trip_2\"]")
	public WebElement radio;
	
	
	public void flightOpen() {
		Search_Field.click();
		
	}
	public void radioBtn() {
		radio.click();
		
	}
	
	
}
