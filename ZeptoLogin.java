package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZeptoLogin {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zepto.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'login')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder ='Enter Phone Number']")).sendKeys("6301237833");
	driver.findElement(By.xpath("//button[./div[text()='Continue']]")).click();
}
}
