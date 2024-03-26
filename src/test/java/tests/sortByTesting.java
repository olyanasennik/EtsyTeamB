package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import static utilities.Driver.driver;


public class sortByTesting extends TestBase {

    @Test
    public void sortByTesting() throws InterruptedException {
        try {
            driver.get("https://www.etsy.com");
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/nav/div/button")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/nav/div/div/a[12]")).click();
            Thread.sleep(500);

            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"sortby\"]/button/div/span[1]/span[2]")));
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"sortby\"]/button/div/span[1]/span[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"sortby\"]/div/a[2]")).click();


        } catch (Exception e) {
            System.out.println("Test Failed");
            driver.close();

        }
    }
}

