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

public class HandleWindow extends TestBase {

    @Test
    public void KidsGiftHandleWindow() throws InterruptedException, IOException {
        try {

            driver.get("https://www.etsy.com/gifts/kids");
            WebElement linkToNewWindow = driver.findElement(By.linkText("Open Gift Box"));
            linkToNewWindow.click();

            Set<String> windowHandles = driver.getWindowHandles();

            for (String windowHandle : windowHandles) {
                driver.switchTo().window(windowHandle);
            }


            driver.close();

            driver.switchTo().window((String) windowHandles.toArray()[0]);


            WebElement iframeElement = driver.findElement(By.id("iframe_id"));
            driver.switchTo().frame(iframeElement);

            // Perform actions inside the iframe (if needed)
            // For example:/
            WebElement iframeTextInput = driver.findElement(By.id("input_id_in_iframe"));
            iframeTextInput.sendKeys("Text inside iframe");

            driver.switchTo().defaultContent();


        } catch (Exception e) {
            java.io.File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            final String img = "screenshot.png";
            FileUtils.copyFile(screenshotFile,new File("screenshot5.png"));

        } finally {
            driver.quit();
        }
    }
}


