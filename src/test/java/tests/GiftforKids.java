package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static utilities.Driver.driver;

@Test

public class GiftforKids extends TestBase {


    public void GiftforKids() throws InterruptedException, IOException {
        try {
            driver.get("https://www.etsy.com");
            Thread.sleep(1000);
            driver.findElement(By.linkText("Gifts for Kids")).click();
            Thread.sleep(1000);
            driver.findElement(By.linkText("Personalized Clothing")).click();
            Thread.sleep(1500);
            driver.findElement(By.linkText("Shop this item")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@aria-label='Next image']")).click();

        } catch (Exception e) {
            File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile,new File("screenshot3.png"));

            driver.close();
        }
    }
}
