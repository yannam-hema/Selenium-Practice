package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWithTabsAndWindows {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver wd = new ChromeDriver();
	wd.get("https://www.amazon.com");
	String ParentHandle= wd.getWindowHandle();
	System.out.println(wd.getTitle());
	wd.findElement(By.xpath("//img[contains(@alt,'Bedding')]")).click();
	Thread.sleep(3000);
	Set<String> newWindowHandler=wd.getWindowHandles();
	for(String window : newWindowHandler) {
		if(!window.equals(ParentHandle)) {
			wd.switchTo().window(window);
			break;
		}
	}
	
	System.out.println(wd.getTitle());
	wd.quit();
	
}
}
