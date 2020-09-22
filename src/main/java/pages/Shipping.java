package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import config.ConfigFIle;

public class Shipping {
	static Select s;
	public static By firstName = By.name("firstname");
	public static By middleName = By.name("middlename");
	public static By lastName = By.name("lastname");
	public static By company = By.name("company");
	public static By streetAddress = By.name("street[0]");
	public static By country=By.name("country_id");
	public static By state=By.name("region_id");
	public static By city=By.name("city");
	public static By zipCode=By.name("postcode");
	public static By phoneNumber=By.name("telephone");
	public static By shippingMethod=By.xpath("(//input[@type='radio'])[1]");
			//.get(0).click();
	public static By nextButton=By.xpath("//*[@class='button action continue primary']");

	public static void setFirstName(WebDriver driver) {
		driver.findElement(firstName).sendKeys(Keys.chord(Keys.CONTROL, "a"), ConfigFIle.getFirstName());
	}

	public static void setMiddleName(WebDriver driver) {
		driver.findElement(middleName).sendKeys(ConfigFIle.getMiddleName());
	}

	public static void setLastName(WebDriver driver) {
		driver.findElement(lastName).sendKeys(Keys.chord(Keys.CONTROL, "a"), ConfigFIle.getLastName());
	}

	public static void setCompany(WebDriver driver) {
		driver.findElement(company).sendKeys(ConfigFIle.getCompany());
	}

	public static void setStreetAddress(WebDriver driver) {
		driver.findElement(streetAddress).sendKeys(ConfigFIle.getStreetAddress());
	}
	public static void setCountry(WebDriver driver) {		
		s=new Select(driver.findElement(country));
		s.selectByVisibleText(ConfigFIle.getCountry());
	}
	public static void setState(WebDriver driver) {
		s=new Select(driver.findElement(state));
		s.selectByVisibleText(ConfigFIle.getState());
	}
	public static void setCity(WebDriver driver) {
		driver.findElement(city).sendKeys(ConfigFIle.getCity());
	}
	public static void setZipCode(WebDriver driver) {
		driver.findElement(zipCode).sendKeys(Keys.chord(Keys.CONTROL,"a"),ConfigFIle.getZipCode());
	}
	public static void setPhoneNumber(WebDriver driver) {
		driver.findElement(phoneNumber).sendKeys(ConfigFIle.getPhoneNumber());
	}
	public static void clickNextButton(WebDriver driver) {
		driver.findElement(nextButton).click();
	}
	public static void selectShippingMethod(WebDriver driver) {
		driver.findElement(shippingMethod).click();
		/*s=new Select(driver.findElement(shippingMethod));
		s.selectByIndex(1);*/
	}

}
