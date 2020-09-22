package pages;
import config.ConfigFIle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	WebDriver driver;

	By firstName = By.id("firstname");
	By lastName = By.id("lasttname");
	By email=By.id("email_address");
	By password=By.id("password");
	By confirmPassword=By.name("password_confirmation");

	public Registration(WebDriver driver) {

		this.driver = driver;
	}
	public void setFirstName(){
        driver.findElement(firstName).sendKeys(ConfigFIle.getFirstName());
    }

	public void setLastName(){
        driver.findElement(firstName).sendKeys(ConfigFIle.getLastName());
    }
	public void setEmail() {
		driver.findElement(email).sendKeys(ConfigFIle.getemail());
	}
	public void setPassword() {
		driver.findElement(password).sendKeys(ConfigFIle.getPassword());
	}
	public void setConfirmPassword() {
		driver.findElement(confirmPassword).sendKeys(ConfigFIle.getPassword());
	}


}
