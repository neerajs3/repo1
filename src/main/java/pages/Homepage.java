package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import config.ConfigFIle;

public class Homepage {

	public static By createAnAccount = By.xpath("(//*[contains(text(),'Create an Account')])[1]");
	public static By signIn = By.xpath("(//*[contains(text(),'Sign In')])[1]");
	public static By searchBox = By.id("search");
	public static By search = By.xpath("//*[@title='Search']");
	public static By clickOnProduct = By.xpath("//*[@class='product-item-link']");
	public static By addToCart = By.id("product-addtocart-button");
	public static By qty = By.id("qty");

	public static void clicksignIn(WebDriver driver) {
		driver.findElement(signIn).click();
	}

	public static void clickCreateAnAccount(WebDriver driver) {
		driver.findElement(createAnAccount).click();
	}

	public static void enterSearchItem(WebDriver driver) {
		driver.findElement(searchBox).sendKeys(ConfigFIle.getSearch());
	}

	public static void search(WebDriver driver) {
		driver.findElement(search).click();
	}

	public static void clickOnProduct(WebDriver driver) {
		driver.findElement(clickOnProduct).click();
	}

	public static void clickOnAddToCart(WebDriver driver) {
		driver.findElement(addToCart).click();
	}

	public static void enterQty(WebDriver driver) {
		driver.findElement(qty).sendKeys(Keys.chord(Keys.CONTROL, "a"), ConfigFIle.getQty());
	}
}
