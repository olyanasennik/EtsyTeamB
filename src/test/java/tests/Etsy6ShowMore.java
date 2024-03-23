package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Etsy6ShowMore {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver", "/Users/annapacovskaa/.cache/selenium/chromedriver/mac-arm64/122.0.6261.128");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/c/bags-and-purses?ref=catnav-132");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"additional-categories__trigger--more\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@title='Show more (11)']")).click();



    }
}