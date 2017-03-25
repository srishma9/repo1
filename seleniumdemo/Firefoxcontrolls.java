package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxcontrolls{
public static void main(String args[]){
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Srishma\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	driver.findElement(By.id("email")).sendKeys("sri@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("srishma");	
}
}
