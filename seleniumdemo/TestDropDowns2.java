package seleniumdemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDowns2 {
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Srishma\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://wikipedia.org/");
		Select select=new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
		//select.selectByVisibleText("Eesti");
		select.selectByValue("hi"); 	
		
		
	}

}
