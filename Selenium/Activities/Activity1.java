package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net");
        System.out.println("Home page title: " + driver.getTitle());
        driver.findElement(By.id("about-link")).click();
        Thread.sleep(2000);
        System.out.println("About US page title: " + driver.getTitle());
        driver.quit();
    }
}
