package testbase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import config.ConfigFIle;

public class TestBase {
	public static By a;

	public static void screenshot(WebDriver driver, String name) {
		String date = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(ConfigFIle.getScreenshotPath() + name + " (" + date + ")" + ".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(ConfigFIle.getWaitTime(), TimeUnit.SECONDS);
	}

	public static void explicitWait(WebDriver driver, By a) {
		WebDriverWait wait = new WebDriverWait(driver, ConfigFIle.getWaitTime());
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(a));
		element.click();
	}

	public static void fluentWait(WebDriver driver) {
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(a);
			}
		});
		element.click();
	}
}
