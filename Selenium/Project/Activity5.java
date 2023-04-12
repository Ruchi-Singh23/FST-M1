package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity5 {
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu_pim_viewMyDetails']")));
        driver.findElement(By.xpath("//*[@id='menu_pim_viewMyDetails']")).click();
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Ruchi");
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Singh");
        driver.findElement(By.id("personal_DOB")).clear();
        driver.findElement(By.id("personal_DOB")).sendKeys("1998-12-23");
        Thread.sleep(5000);
        driver.findElement(By.id("personal_optGender_2")).click();
        Thread.sleep(5000);
        Select nationality = new Select(driver.findElement(By.xpath("//select[@name='personal[cmbNation]']")));
        nationality.selectByIndex(82);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='btnSave']")).click();
        driver.close();
    }
}
