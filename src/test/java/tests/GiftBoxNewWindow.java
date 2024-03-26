package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static utilities.Driver.driver;

public class GiftBoxNewWindow extends TestBase {

    @Test
    public void GiftBoxNewWin() throws InterruptedException, IOException {
        try {
            driver.get("https://www.etsy.com/gifts/kids");


            WebElement giftItem = driver.findElement(By.cssSelector("CSS_SELECTOR_OF_GIFT_ITEM"));
            giftItem.click();

            String mainWindow = driver.getWindowHandle();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(mainWindow)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            System.out.println("New window URL: " + driver.getCurrentUrl());
        } catch (Exception e) {
            File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile,new File("screenshot2.png"));
            driver.close();

        }
    }
}

