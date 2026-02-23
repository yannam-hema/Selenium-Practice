//Handling with DropDown

package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	WebElement dropdown = driver.findElement(By.id("course"));
	Select options = new Select(dropdown);
	options.selectByIndex(2);
	Thread.sleep(3000);
	options.selectByIndex(1);
	Thread.sleep(3000);
	options.selectByValue("python");
	Thread.sleep(2000);
	options.selectByVisibleText("Java");
	}
}
