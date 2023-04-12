package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        Thread.sleep(20);
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("orangepassword123");
        Thread.sleep(20);
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        Thread.sleep(1000);
        WebElement homepage = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1"));
        if(homepage.isDisplayed()){
            System.out.println("Homepage Displayed");
            driver.close();
        }
    }
}
