package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SpecialCharacterSearch extends TestBase {


        @Test
        public static  void SpecialCharacterSearch() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.etsy.com");
//input[@placeholder='Search for anything']
            WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
            searchBox.sendKeys("!@#$%^&*()");
            searchBox.sendKeys(Keys.RETURN);

            List<WebElement> searchResults = driver.findElements(By.className("v2-listing-card__info"));
            if (!searchResults.isEmpty()) {
                System.out.println("Search with Special Characters Test Passed");
            } else {
                System.out.println("Search with Special Characters Test Failed");
            }

            driver.quit();
        }
    }

