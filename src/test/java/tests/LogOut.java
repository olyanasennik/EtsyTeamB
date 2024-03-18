package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LogOutPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;

import static utilities.Driver.driver;

public class LogOut extends TestBase {

    @Test(groups = "smoke")
    public void testLogOut() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.iframe();
        loginPage.getSignin().click();
        loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
        loginPage.iframe();
        LogOutPage logOutPage = new LogOutPage();
        logOutPage.clickYouButton();
        logOutPage.clickLogOutButton();
    }
}
