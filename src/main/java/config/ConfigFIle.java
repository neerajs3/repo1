package config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigFIle {
	static Properties p = new Properties();

	public static Properties configFileReader() {
		try {
			InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties");
			p.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public static String url() {
		String url = configFileReader().getProperty("url");
		return url;
	}

	public static String getScreenshotPath() {
		return configFileReader().getProperty("screenshotPath");
	}

	public static String getFirstName() {
		return configFileReader().getProperty("firstName");
	}

	public static String getMiddleName() {
		return configFileReader().getProperty("middleName");
	}

	public static String getLastName() {
		return configFileReader().getProperty("lastName");
	}

	public static String getemail() {
		return configFileReader().getProperty("email");
	}

	public static String getPassword() {
		return configFileReader().getProperty("password");
	}

	public static String getSearch() {
		return configFileReader().getProperty("search");
	}

	public static String getCompany() {
		return configFileReader().getProperty("company");
	}

	public static String getStreetAddress() {
		return configFileReader().getProperty("streetAddress");
	}

	public static String getCity() {
		return configFileReader().getProperty("city");
	}

	public static String getState() {
		return configFileReader().getProperty("state");
	}

	public static String getZipCode() {
		return configFileReader().getProperty("zipCode");
	}

	public static String getCountry() {
		return configFileReader().getProperty("country");
	}

	public static String getPhoneNumber() {
		return configFileReader().getProperty("phoneNumber");
	}

	public static long getWaitTime() {
		return Long.parseLong(configFileReader().getProperty("waitTime"));
	}

	public static String getQty() {
		return configFileReader().getProperty("qty");
	}

	public static String getCardNumber() {
		return configFileReader().getProperty("cardNumber");
	}

	public static String getExpirationMonth() {
		return configFileReader().getProperty("expirationMonth");
	}

	public static String getExpirationYear() {
		return configFileReader().getProperty("expirationYear");
	}

	public static String getCvv() {
		return configFileReader().getProperty("cvv");
	}

}
