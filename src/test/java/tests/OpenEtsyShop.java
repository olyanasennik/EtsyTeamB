package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.SellerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.Random;
import java.util.Set;

import static pages.GeneratePW.generateRandomPassword;
import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class OpenEtsyShop extends TestBase {
    @Test
    public void testOpenShopStage2() throws InterruptedException {


        SellerPage sellerPage = new SellerPage();
        sellerPage.clickSellerHandbook();
        //Select button Create your Shop
        Driver.getDriver().findElement(By.xpath("//a[@href='/your/shop/create?ref-seller-handbook=seller-handbook-open-shop-logged-in&ref=handbook']")).click();
        //Shop preferences page - language dropdown
        WebElement dropdownLang = Driver.getDriver().findElement(By.id("onboard-shop-language"));
        Select selectLang = new Select(dropdownLang);
        selectLang.selectByValue("es");
        // - country dropdown
        WebElement dropdownCountry = Driver.getDriver().findElement(By.id("address-country"));
        Select selectCountry = new Select(dropdownCountry);
        selectCountry.selectByValue("99");

        //SeleniumUtils.jsClick(dropdownCountry);
        // - currency dropdown
        WebElement dropdownCurrency = Driver.getDriver().findElement(By.id("onboard-shop-currency"));
        Select selectCurrency = new Select(dropdownCurrency);
        selectCurrency.selectByValue("EUR");

        //SeleniumUtils.jsClick(dropdownCurrency);

        // Button Save&Continue using JS Executor
        WebElement saveContinue = Driver.getDriver().findElement(By.linkText("Save and continue"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click();", saveContinue);
 SeleniumUtils.jsClick(saveContinue);

        //Enter your shop name - create random name
        Driver.getDriver().findElement(By.id("onboarding-shop-name-input")).sendKeys(generateRandomPassword());

        SeleniumUtils.jsClick(saveContinue);
//Select button Save&Continue
        WebElement saveContinue1 = Driver.getDriver().findElement(By.linkText("Save and continue"));
        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) Driver.getDriver();
        jsExecutor1.executeScript("arguments[0].click();", saveContinue1);
        SeleniumUtils.jsClick(saveContinue1);

        //catch Handle for the 1st window
        String firstWindowHandle = getDriver().getWindowHandle();

        //Open "Learn more what can be seen on Etsy link" that opens 2 nd window
        WebElement learnMore = Driver.getDriver().findElement(By.xpath("//a[@href='https://help.etsy.com/hc/en-us/articles/360024112614-What-Can-I-Sell-on-Etsy-?segment=selling']"));
        JavascriptExecutor jsLearnMore = (JavascriptExecutor) Driver.getDriver();
        jsLearnMore.executeScript("arguments[0].click();", learnMore);

        SeleniumUtils.jsClick(learnMore);
        //catch all Window Handles
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        // Switch back to the first window
        for (String handle : windowHandles) {
            if (handle.equals(firstWindowHandle)) {
                Driver.getDriver().switchTo().window(handle);
                break;
            }
        }

        //Select button Save&Continue
        WebElement saveContinue2 = Driver.getDriver().findElement(By.linkText("Save and continue"));
        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
        jsExecutor2.executeScript("arguments[0].click();", saveContinue2);

        SeleniumUtils.jsClick(saveContinue2);

    }
    }


