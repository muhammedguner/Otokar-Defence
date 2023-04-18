package Pages;

import DriverManager.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseTest {

    @FindBy (xpath = "//span[contains(text(),'Tüm Çerezleri Kabul Et')]")
    WebElement cookieLocator;

    @FindBy(xpath = "//button[@data-toggle='btnSearch']")
    WebElement searchLocator;


    public HomePage acceptCookies() {
        click(cookieLocator);
        return this;
    }

    public HomePage search(){
        click(searchLocator);
       // type(searchLocator,"deneme");
        return this;
    }


}
