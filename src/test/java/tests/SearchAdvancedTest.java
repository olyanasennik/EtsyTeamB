package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.Duration;

import static utilities.Driver.driver;

public class SearchAdvancedTest extends TestBase {

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

    }


    public void tearDown() {
        driver.quit();
    }

        @Test
        public void testAdvancedSearch() throws InterruptedException { //driver.findElement(By.id("global-enhancements-search-query")).sendKeys("handmade jewelry");
        // //button[@aria-label='Show results (924 items) input[@id='special-offers-free-shipping'  driver.findElement(By.xpath("//button[@aria-label='Search']")).click();


            driver.get("https://www.etsy.com");
            Thread.sleep(500);
            driver.findElement(By.name("search_query")).sendKeys("dress,size small,under $50");
            driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//button[@id='search-filter-button']")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//label[contains(text(),'FREE shipping')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3 wt-ml-xs-3']")).click();
        }
    }