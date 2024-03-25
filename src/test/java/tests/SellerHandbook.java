package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SellerPage;
import utilities.ConfigReader;

public class SellerHandbook extends TestBase{

    @Test(groups = "smoke")
    public void testOpenShopStage1 () throws InterruptedException{
        LoginPage loginPage = new LoginPage();
        loginPage.iframe();
        loginPage.getSignin().click();
        loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
        loginPage.iframe();
        SellerPage sellerPage = new SellerPage();
        sellerPage.clickSellerHandbook();

    }



}
