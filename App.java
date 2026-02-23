
// Working with Locators ,sendKeys and handling text boxes

package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

    public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.github.com/login");
       driver.findElement(By.id("login_field")).sendKeys("yannamhema30@gmail.com");
       driver.findElement(By.name("password")).sendKeys("something");
       
       
    }
}
