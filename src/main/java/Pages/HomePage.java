package Pages;

import DriverManager.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseTest {

    @FindBy (xpath = "//span[contains(text(),'Tüm Çerezleri Kabul Et')]")
    WebElement cookieLocator;
    @FindBy(xpath = "//button[@data-toggle='btnSearch']")
    WebElement searchIconLocator;
    @FindBy(xpath = "(//input[@placeholder=\"Otokar'da Ara...\"])[2]")
    WebElement searchFieldLocator;
    @FindBy(css = "a[title='OTOKAR SAVUNMA SANAYİİ']")
    WebElement slider1Lct;





    public HomePage acceptCookies() {
        click(cookieLocator);
        return this;
    }

    public HomePage search(String txt){
        click(searchIconLocator);
        type(searchFieldLocator,txt + Keys.ENTER);
        return this;
    }


}
