package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import config.ConfigFIle;

public class Payment {
	static Select s;
	public static By creditCard=By.id("authorizenet_acceptjs");
	public static By billingAddress=By.id("billing-address-same-as-shipping-authorizenet_acceptjs");
	public static By cardNumber=By.id("authorizenet_acceptjs_cc_number");
	public static By expMonth=By.id("authorizenet_acceptjs_expiration");
	public static By expYear=By.id("authorizenet_acceptjs_expiration_yr");
	public static By cvv=By.id("authorizenet_acceptjs_cc_cid");
	public static By placeOrder=By.xpath("(//*[contains(text(),'Place Order')])[2]");
	
	
	
	public static void selectCreditCard(WebDriver driver) {
		driver.findElement(creditCard).click();
	}
	public static void setBillingAddress(WebDriver driver) {
		driver.findElement(billingAddress).click();
	}
	public static void setCardNumber(WebDriver driver) {
		driver.findElement(cardNumber).sendKeys(ConfigFIle.getCardNumber());
	}
	public static void setExpMonth(WebDriver driver) {
		s=new Select(driver.findElement(expMonth));
		s.selectByValue(ConfigFIle.getExpirationMonth());
	}
	public static void setExpYear(WebDriver driver) {
		s=new Select(driver.findElement(expYear));
		s.selectByValue(ConfigFIle.getExpirationYear());		
	}
	public static void setCvv(WebDriver driver) {
		driver.findElement(cvv).sendKeys(ConfigFIle.getCvv());
	}
	public static void clickOnPlaceOrder(WebDriver driver) {
		driver.findElement(placeOrder).click();
	}

}
