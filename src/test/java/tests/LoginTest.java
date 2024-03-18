package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;

public class LoginTest extends TestBase {


    @Test(groups = "smoke")
    public void testValidCredentials throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
        Assert.assertEquals(Driver.getDriver().getTitle(), "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");


    }

    @Test(groups = "smoke")
    public void testInvalidCredentials() throws IOException{

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        new LoginPage().login("invalidUser", "invalidPass");
        Assert.assertNotEquals(Driver.getDriver().getTitle(), "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");

    }

    @Test
    public void testInvalidCredentialsNoUsername() throws IOException{
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        new LoginPage().login("", "invalidPass");
        Assert.assertNotEquals(Driver.getDriver().getTitle(), "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");

    }

    @Test
    public void testInvalidCredentialsNoPassword() throws IOException{
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        new LoginPage().login(ConfigReader.getProperty("username"), "");
        Assert.assertNotEquals(Driver.getDriver().getTitle(), "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");

    }

    @Test
    public void testInvalidCredentialsNoCred() throws IOException{
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        new LoginPage().login("", "");
        Assert.assertNotEquals(Driver.getDriver().getTitle(), "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");

    }
}
