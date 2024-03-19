package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

public class Etsy3AccessoriesAndBack {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver", "/Users/annapacovskaa/.cache/selenium/chromedriver/mac-arm64/122.0.6261.128");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.etsy.com/");
        Thread.sleep(5000);

        WebElement categoriesLink = driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/nav/div/button"));
        categoriesLink.click();
        Thread.sleep(1000);

        WebElement firstCategory = driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/nav/div/div/a[1]"));
        firstCategory.click();
        Thread.sleep(1000);

        WebElement categoriesLink1 = driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/nav/div/button"));
        categoriesLink1.click();

    }
}



