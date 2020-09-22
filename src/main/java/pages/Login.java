package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.ConfigFIle;

public class Login {

	public static By email = By.id("email");
	static By password = By.name("login[password]");
	static By signIn = By.xpath("//*[@class='action login primary']");
	static By forgotPassword = By.xpath("//*[@class='action remind']");

	public static void setEmail(WebDriver driver) {
		driver.findElement(email).sendKeys(ConfigFIle.getemail());

	}

	public static void setPassword(WebDriver driver) {
		driver.findElement(password).sendKeys(ConfigFIle.getPassword());
	}

	public static void clickSignIn(WebDriver driver) {
		driver.findElement(signIn).click();
	}

	public static void clickFOrgotPassword(WebDriver driver) {
		driver.findElement(forgotPassword).click();
	}

}
