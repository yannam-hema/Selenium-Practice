// Implicit Wait: Appiles Globally to entire driver
// Every findElement() will wait up to x seconds whatever we mentions
// if element found in less than x seconds it stops waiting , if not found waits full x seconds then throws an exception


package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Implicit Wait
public class HandlingWait {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	driver.findElement(By.id("btn1")).click();
	
}
}
