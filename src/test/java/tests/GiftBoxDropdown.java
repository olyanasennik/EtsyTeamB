package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static utilities.Driver.driver;


public class GiftBoxDropdown  extends TestBase {

    @Test
    public void GiftBoxDropdowns() throws InterruptedException, IOException {
        try {

            driver.get("https://www.etsy.com/listing/1629369570/charming-personalized-denim-jacket-for?ref=anchored_listing&pro=1&sts=");
            Thread.sleep(1000);
            driver.findElement(By.id("variation-selector-0")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//option[contains(text(),'3T')]")).click();
            Thread.sleep(1500);
            driver.findElement(By.id("variation-selector-1")).click();
            Thread.sleep(1500);
            driver.findElement(By.id("listing-page-personalization-textarea")).sendKeys("Omina");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@data-selector='add-to-cart-button']")).click();

        } catch (Exception e) {
            File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile,new File("screenshot1.png"));
            driver.close();
        }
    }
}
