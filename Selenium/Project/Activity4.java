package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity4 {
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu_pim_viewPimModule']/b")));
        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys("Ruchi");
        Thread.sleep(200);
        driver.findElement(By.id("lastName")).sendKeys("Singh");
        Thread.sleep(200);
        driver.findElement(By.id("btnSave")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu_pim_viewPimModule']/b")));
        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Ruchi Singh");
        Thread.sleep(2000);
        driver.findElement(By.id("searchBtn")).click();
        driver.close();
    }
}
