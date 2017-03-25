package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDropdowns {
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Srishma\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://wikipedia.org/");
		driver.findElement(By.xpath("html/body/div[2]/form/fieldset/div/input")).sendKeys("Eesti");
		
	}

}
