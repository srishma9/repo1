package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class handlealert{
@SuppressWarnings("deprecation")
@Test
public void handlealert() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Srishma\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.ksrtc.in");
driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
Thread.sleep(5000);
String actual_msg=driver.switchTo().alert().getText();
System.out.println("alert message is"+actual_msg);
driver.switchTo().alert().accept();
String expected_msg="'From' place is required please update the same";
Assert.assertEquals(actual_msg,expected_msg);
driver.quit();

}



}
