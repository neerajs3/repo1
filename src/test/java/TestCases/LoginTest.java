package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import config.ConfigFIle;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;
import pages.Login;
import pages.Payment;
import pages.Shipping;
import pages.ShoppingCart;
import testbase.TestBase;

public class LoginTest {

	private WebDriver driver;

	@BeforeTest
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConfigFIle.url());
		TestBase.implicitWait(driver);

	}

	@Test()
	public void login() throws InterruptedException {

		Homepage.clicksignIn(driver);
		Login.setEmail(driver);
		String a=driver.findElement(Login.email).getText();
		System.out.println(a);
		Login.setPassword(driver);
		Login.clickSignIn(driver);
		Homepage.enterSearchItem(driver);
		Homepage.search(driver);
		Homepage.clickOnProduct(driver);
		driver.navigate().refresh();
		TestBase.explicitWait(driver, Homepage.addToCart);
		TestBase.implicitWait(driver);
		ShoppingCart.enterQty(driver);
		ShoppingCart.clickOnUpdate(driver);
		Thread.sleep(10000);
		ShoppingCart.clickOnCheckout(driver);
		Thread.sleep(8000);
		Shipping.setFirstName(driver);
		Shipping.setMiddleName(driver);
		Shipping.setLastName(driver);
		Shipping.setCompany(driver);
		Shipping.setStreetAddress(driver);
		Shipping.setCountry(driver);
		Shipping.setState(driver);
		Shipping.setCity(driver);
		Shipping.setZipCode(driver);
		Shipping.setPhoneNumber(driver);
		TestBase.implicitWait(driver);
		Shipping.selectShippingMethod(driver);
		TestBase.implicitWait(driver);
		Shipping.clickNextButton(driver);
		TestBase.implicitWait(driver);
		Payment.selectCreditCard(driver);
		TestBase.explicitWait(driver, Payment.billingAddress);
		Payment.setCardNumber(driver);
		Payment.setExpMonth(driver);
		Payment.setExpYear(driver);
		Payment.setCvv(driver);
		//Payment.clickOnPlaceOrder(driver);
		//(//*[@class='porto-icon-up-dir'])[1]

	}

	@AfterTest
	public void quit() {
		TestBase.screenshot(driver, driver.getTitle());
	}
}
