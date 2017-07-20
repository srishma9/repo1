package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disneyautomation {
	
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Srishma\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://disneyworld.disney.go.com/");
		driver.findElement(By.cssSelector("input#checkInDate_58fa8697de63f")).click();
		Thread.sleep(1000);
		String ExpMonth="May 2017";
		String CurrMonth=driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
		if(ExpMonth.equals(CurrMonth)){
			System.out.println("Month is already selected");	
		}
		else{
			for(int i=1;i<12;i++){
				driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
				Thread.sleep(1000);
				CurrMonth=driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
				if(ExpMonth.equals(CurrMonth)){
					System.out.println("mon selected");
					break;
					
				}
			}
		}
		
		
		
		
		
		}
		
	}




