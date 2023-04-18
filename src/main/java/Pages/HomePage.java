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
    @FindBy(xpath = "//a[contains(text(),'ARMA II')]")
    WebElement slider2Lct;
    @FindBy(xpath = "//a[contains(text(),'TULPAR')]")
    WebElement slider3Lct;
    @FindBy(xpath = "//a[contains(text(),'HABERLER')]")
    WebElement slider4Lct;
    @FindBy(xpath = "(//i[@class='icon icon-bars'])[1]")
    WebElement hamburgerLct;
    @FindBy(xpath = "(//span[@class='text'][contains(text(),'Tekerlekli Zırhlı Araçlar')])[1]")
    WebElement tekerlekliZirhliAraclarLct;



    public HomePage acceptCookies() {
        click(cookieLocator);
        return this;
    }

    public HomePage search(String txt){
        click(searchIconLocator);
        type(searchFieldLocator,txt + Keys.ENTER);
        return this;
    }

    public HomePage clickArma(){
        click(slider2Lct);
        return this;
    }
    public HomePage clickTulpar(){
        click(slider3Lct);
        return this;
    }
    public HomePage clickHaberler(){
        click(slider4Lct);
        return this;
    }

    public HomePage clickHamburgerBtn(){
        click(hamburgerLct);
        return this;
    }

    public HomePage clicktekerlekliZirhliAraclar(){
        click(tekerlekliZirhliAraclarLct);
        return this;
    }


}
