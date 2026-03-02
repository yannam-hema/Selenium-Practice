package SeleniumPractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenShots {

    public static void main(String[] args) throws IOException , InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Capture screenshot
        File source = ts.getScreenshotAs(OutputType.FILE);

        // Destination file
        File destination = new File("C:\\Users\\hemayannam\\Pictures\\Screenshots\\img2.png");

        // Copy file
        Files.copy(source, destination);

        System.out.println("Screenshot captured successfully");
        
        Thread.sleep(3000);
        
        // Navigate to other page
        driver.navigate().to("https://www.myntra.com");
        
        Thread.sleep(3000);
        
        byte[] byteArray = ts.getScreenshotAs(OutputType.BYTES);
         File destination2= new File("C:\\Users\\hemayannam\\Pictures\\Screenshots\\img3.png");
         FileOutputStream fos = new FileOutputStream(destination2);
         fos.write(byteArray);
         System.out.println("Screen shot is capturedddd");
         
         Thread.sleep(1000);

        driver.quit();
    }
}
