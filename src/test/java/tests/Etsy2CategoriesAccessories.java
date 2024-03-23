package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Etsy2CategoriesAccessories {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver", "/Users/annapacovskaa/.cache/selenium/chromedriver/mac-arm64/122.0.6261.128");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");
        Thread.sleep(5000);

        WebElement categoriesSection = driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/nav/div/button"));
        categoriesSection.click();
        Thread.sleep(1000);

        WebElement firstCategory = driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/nav/div/div/a[1]"));
        firstCategory.click();



    }
}