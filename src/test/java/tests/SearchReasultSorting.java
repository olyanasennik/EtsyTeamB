package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static utilities.Driver.driver;

public class SearchReasultSorting extends TestBase {
        @BeforeMethod
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        }
        @AfterMethod
        public void tearDown() {
           // driver.quit();
        }
    @Test
    public void testSearchResultSorting  () throws InterruptedException {
                driver.get("https://www.etsy.com");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("handmade mug");
                driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='sortby']")).click();
       Thread.sleep(1000);
    driver.findElement(By.xpath("//a[@data-sort-by='price_asc']")).click();

            }
    }

