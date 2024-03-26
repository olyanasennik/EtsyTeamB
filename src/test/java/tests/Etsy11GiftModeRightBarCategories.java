package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy11GiftModeRightBarCategories {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver", "/Users/annapacovskaa/.cache/selenium/chromedriver/mac-arm64/122.0.6261.128");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");
        Thread.sleep(5000);

        WebElement categoriesSection = driver.findElement(By.xpath("//*[@id=\"desktop-category-topnav\"]/div/div/ul/li[1]/a"));
        categoriesSection.click();

        Thread.sleep(2000);

        WebElement categoriesSection1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/button/span/svg"));
        categoriesSection1.click();
    }
}