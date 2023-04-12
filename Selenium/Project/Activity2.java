package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        //String url = driver.getCurrentUrl();
        //System.out.println("URL:" +url);
        WebElement element = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
        String x = element.getAttribute("src");
        System.out.println("Image URL:" +x);
        driver.close();
    }
}
