import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavenClass {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("sads");
	Thread.sleep(5000);
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("fdfdsf");
	Thread.sleep(5000);
	WebElement loginbutton = driver.findElement(By.name("login"));
	loginbutton.click();
	Thread.sleep(5000);
	driver.quit();
}

}

