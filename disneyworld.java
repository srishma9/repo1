package seleniumdemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class disneyworld {
	public static String driverpath= "C:\\Users\\Srishma\\Downloads\\geckodriver-v0.14.0-win64\\";
	private static final String sdropdown = ".//*[@id='priceRangeResorts']/legend";
	private static final String checkboxlist=".//*[@id='priceRangeResorts']/div/ol/li[1]/label/span[1]";
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver",driverpath + "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://disneyworld.disney.go.com/resorts/");
		driver.findElement(By.xpath(sdropdown)).click();
		List<WebElement> elements=driver.findElements(By.xpath(checkboxlist));
		int numberOfElements=elements.size();
		for(int i=0;i<numberOfElements;i++){
		    elements=driver.findElements(By.xpath(checkboxlist));
		    elements.get(i).click();
		}
		}
		
		}
	



		
