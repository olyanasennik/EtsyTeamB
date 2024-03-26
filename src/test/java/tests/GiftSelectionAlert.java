package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import static utilities.Driver.driver;

public class GiftSelectionAlert extends TestBase {


    @Test
    public void testSelectionAlert() throws IOException {

        try {
            driver.get("https://www.etsy.com/gifts/kids");
            WebElement giftItem = driver.findElement(By.cssSelector("CSS_SELECTOR_OF_GIFT_ITEM"));
            giftItem.click();
            Thread.sleep(1000);
            System.out.println("Alert is present: " + driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("screenshot6.png"));
            driver.close();
        }
    }
}
