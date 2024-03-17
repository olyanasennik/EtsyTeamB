package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LogOutPage {

    public LogOutPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@aria-label='You']")
    private WebElement youButton;

    @FindBy (xpath = "//a[@href='https://www.etsy.com/logout.php?ref=hdr_user_menu-signout']")
    private WebElement logOutButton;


    public void setLogOutButton(){
        youButton.click();
        logOutButton.click();
    }


}


