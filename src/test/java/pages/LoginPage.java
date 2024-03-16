package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "join_neu_email_field")
    private WebElement usernameField;

    @FindBy (id = "join_neu_password_field")
    private WebElement passwordField;


    public void login(String username, String password){
        usernameField.sendKeys(username, Keys.TAB, password, Keys.ENTER);
    }

    public void login(){
        usernameField.sendKeys(ConfigReader.getProperty("username"), Keys.TAB, ConfigReader.getProperty("password"), Keys.ENTER);
    }
}
