package seleniumdemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DisneyPage{
public static void main(String args[]){
System.setProperty("webdriver.gecko.driver","C:\\Users\\Srishma\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://disneyworld.disney.go.com/tickets/?rate=all-guests/");
driver.findElement(By.xpath(".//*[@id='rateCardTitle-all-guests']")).click();
driver.findElement(By.xpath(".//*[@id='pepDayScroller_numDays']/div[2]/a/div[2]")).click();
WebElement element = null;
WebDriverWait wait = new WebDriverWait(driver, 25);
element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[1]/div/button[2]")));
element.click();
driver.findElement(By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[1]/div/button[2]")).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[2]/div/button[2]")));
driver.findElement(By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[2]/div/button[2]")).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='selectThemeParkTicketModule']/div/div[2]/button[2]")));
driver.findElement(By.xpath(".//*[@id='selectThemeParkTicketModule']/div/div[2]/button[2]")).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='addOn_option']/div/div[2]/div[1]/div/div/span[2]")));
driver.findElement(By.xpath(".//*[@id='addOn_option']/div/div[2]/div[1]/div/div/span[2]")).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='addToCart']")));
driver.findElement(By.xpath(".//*[@id='addToCart']")).click();
}
}


