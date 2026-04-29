package selenium_April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {
private static String title;

public static void main(String[] args) throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.geeksforgeeks.org/");
	driver.manage().window().maximize();
	title = driver.getTitle();
	System.out.println("title :"+title);
	driver.findElement(By.linkText("Java")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
  //driver.close();
	driver.quit();
}
}
