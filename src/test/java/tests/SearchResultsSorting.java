package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static utilities.Driver.driver;

public class SearchResultsSorting extends TestBase {

    @Test

    public void testSearchResultSorting  () throws InterruptedException {

            driver.get("https://www.etsy.com");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("handmade mug");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@id='sortby']")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//span[@class='etsy-icon wt-menu__trigger__caret wt-icon--smaller']")).click();

driver.quit();

        }
    }
        // driver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[1]/div[1]/div[3]/div[7]/div[1]/div[2]/div[2]/div[1]/button[1]/div[1]/span[1]/span[2]")).click();




