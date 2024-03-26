package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static utilities.Driver.driver;



public class GiftForKidsMouseHover extends TestBase {
    @Test
    public void MouseHover() throws InterruptedException, IOException {
        try {

            driver.get("https://www.etsy.com/c/gifts/for-kids?ref=KidsGiftsTest_US_CA_cat_nav");


            Thread.sleep(1000);
            driver.findElement(By.xpath("//header/nav[1]/div[1]/button[1]")).click();

            Thread.sleep(1000);
            driver.findElement(By.linkText("Baby")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"rectangular-ingresses\"]/div/div[1]/a/p")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"sortby\"]/button")).click();


        } catch (Exception e) {
            File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile,new File("screenshot4.png"));

        } finally {

            driver.quit();
        }
        }
    }


