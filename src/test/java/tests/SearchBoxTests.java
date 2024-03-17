package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class SearchBoxTests extends TestBase {





    @Test
            public void testSearch() {
               Driver.getDriver().get("https://www.etsy.com");
              // driver.findElement((By) By.id("join_neu_email_field")).sendKeys("italy7690@gmail.com", Keys.TAB, "Olganik.17", Keys.ENTER);
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("handmade jewelry");
        driver.findElement(By.xpath("//button[@aria-label='Search']")).click();


            }
        }



