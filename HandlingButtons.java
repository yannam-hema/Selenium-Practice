// Handling different buttons like radio , check box 

package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingButtons {

    public static void main(String[] args) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
       
       driver.findElement(By.id("femalerb")).click();
       
       WebElement english = driver.findElement(By.id("englishchbx"));
       
       english.click();
       
       Thread.sleep(3000);
       
       if(english.isSelected()) {
    	   english.click();
       }
       
       driver.findElement(By.id("registerbtn")).click();
       
       
    }
}
