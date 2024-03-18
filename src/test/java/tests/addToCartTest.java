package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.Duration;

import static utilities.Driver.driver;

public class addToCartTest extends TestBase {


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
        driver.findElement(By.name("search_query")).sendKeys("puzzles");
        driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div[9]/div/div[2]/div/div[1]/div/ul/li[1]/div/a/div[1]/div/div/div/img")).click();
        driver.findElement(By.xpath("//*[@id=\"variation-selector-0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"variation-selector-0\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"variation-selector-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"variation-selector-1\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"listing-page-personalization-textarea\"]")).sendKeys("KalTextBoxTest");
        driver.findElement(By.xpath("//*[@id=\"listing-page-cart\"]/div[7]/div[1]/div[3]/div[2]/div/form/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"multi-shop-cart-list\"]/div[1]/div[1]/ul/li/div/div/ul/li/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/select")).click();
        driver.findElement(By.xpath("//*[@id=\"multi-shop-cart-list\"]/div[1]/div[1]/ul/li/div/div/ul/li/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"multi-shop-cart-list\"]/div[1]/div[1]/ul/li/div/div/div[2]/div[1]/div[3]/div/fieldset/div[1]/div/label")).click();
        driver.findElement(By.xpath("//*[@id=\"multi-shop-cart-list\"]/div[1]/div[1]/div/div/div[1]/form/div[2]/div[1]/button/span[1]")).click();
    }


}
