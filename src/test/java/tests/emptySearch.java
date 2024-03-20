package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static utilities.Driver.driver;

public class emptySearch extends TestBase {

    @Test
    public void testEmptySearch() throws InterruptedException {
     driver.get("https://www.etsy.com");
     Thread.sleep(500);
            driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.quit();
        }
    }



