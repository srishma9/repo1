package Listener_Demo;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;             		

@Listeners(Listener_Demo.ListenerTest.class)			

public class TestCases {		
	
	WebDriver driver=new FirefoxDriver();
//Test to pass as to verify listeners.		
@Test		
public void Login()				
{		
    driver.get("https://www.facebook.com/");					
    driver.findElement(By.id("email")).sendKeys("sri@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("srishma");							
    driver.findElement(By.id("")).click();					
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}		