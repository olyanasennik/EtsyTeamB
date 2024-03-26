package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Etsy10FirstProductOnTheAries {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver", "/Users/annapacovskaa/.cache/selenium/chromedriver/mac-arm64/122.0.6261.128");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/gift-mode/persona/the-aries?ref=gm_all_personas");
        Thread.sleep(5000);

        WebElement categoriesSection = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div/a/div[1]/div/div/div/img"));
        categoriesSection.click();
    }
}