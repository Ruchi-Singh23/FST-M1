package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle = "OrangeHRM";
        if(ActualTitle.equals(ExpectedTitle)){
            driver.close();
        }
    }
}
