package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.ConfigFIle;
import testbase.TestBase;

public class ShoppingCart {

	public static By Qty = By.xpath("(//*[@class='input-text qty'])[1]");
	public static By updateButton = By.xpath("//*[contains(text(),'Update Cart')]");
	public static By checkout = By.xpath("//*[@data-role='proceed-to-checkout']");

	// (//*[@title='Go to Checkout'])[2]

	public static void enterQty(WebDriver driver) {
		driver.findElement(Qty).sendKeys(Keys.chord(Keys.CONTROL,"a"),ConfigFIle.getQty());
	}

	public static void clickOnCheckout(WebDriver driver) {
		driver.findElement(checkout).click();

	}
	
	public static void clickOnUpdate(WebDriver driver) {
		driver.findElement(updateButton).click();
	}

}
