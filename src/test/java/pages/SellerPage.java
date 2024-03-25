package pages;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

@Data
public class SellerPage {
    public SellerPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href = 'https://www.etsy.com/seller-handbook?ref=ftr']")
    private WebElement sellerHandbook;

    public WebElement getSellerHandbook() {
        return sellerHandbook;
    }

    public void clickSellerHandbook() {
        sellerHandbook.click();
    }

    public void iframe() {
        try {
            Driver.getDriver().findElement(By.xpath("//iframe[@src = 'https://geo.captcha-delivery.com/captcha/?initialCid=AHrlqAAAAAMAt9dVflzXZqEArT6nkA%3D%3D&hash=D013AA612AB2224D03B2318D0F5B19&cid=Xx5XEjRRjzOeCKePiaTN2ozxVmnOWfdbpzVTaleOt7Az333Vb_HQyLJpDbaIEDzRSslyD5vbRECr4QErclAJpu_heWprslvQaSNJUvE9XEt3F78J9n8JQ5EvPEv7jFLR&t=fe&referer=https%3A%2F%2Fwww.etsy.com%2F&s=45225&e=46c9ca65b69d719f55e7a764d88ac8d53aa03af14c2d58a8b5b757fd7c1c1629']"));
        } catch (NoSuchElementException e) {
            Driver.getDriver().navigate().refresh();
        }


    }
}
