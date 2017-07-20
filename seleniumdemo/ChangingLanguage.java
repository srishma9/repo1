package seleniumprgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ChangingLanguage {
//******this doesn't work for internet explorer 
public static void main(String[] args) {
	//for Firefox
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Srishma\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
	FirefoxProfile fireFoxProfile = new FirefoxProfile();
	// setting language to telugu using firefoz profile
	fireFoxProfile.setPreference("intl.accept_languages", "te");
	WebDriver driver = new FirefoxDriver(fireFoxProfile);
	driver.get("https://www.facebook.com/");
	
}
}
