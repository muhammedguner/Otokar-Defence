package Pages;

import DriverManager.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MikrobusSayfasi extends BaseTest {

    //@FindBy(xpath = "//*[text()=\"Yakıt Tipi\"]")
   // public WebElement yakitTipi;
    @FindBy(xpath = "//h4[contains(text(),'Yakıt Tipi')]")
    public WebElement yakitTipi;
    @FindBy(xpath = "//*[.=\"Maksimum Güç\"]")
    public WebElement maksimumGuc;

    @FindBy(xpath = "//*[.=\"Maksimum Tork\"]")
    public WebElement maksimumTork;

    @FindBy(xpath = "(//*[@data-target=\"#kazandiran-mikrobus\"])[2]")
    public WebElement kazandiranMikrobus;

    @FindBy(xpath = "(//*[. =\"YOLLARIN MODERN YÜZÜ\"])[3]")
    public WebElement yollarinmodernYuzu;
    @FindBy(xpath = "(//*[.=\"SESSİZ VE ÇEVRECİ\"])[3]")
    public WebElement sessizVeCevreci;
    @FindBy(xpath = "(//*[.=\"KONFOR\"])[3]")
    public WebElement konfor;
    @FindBy(xpath = "(//*[.=\"MAZİYE SELAM\"])[3]")
    public WebElement maziyeSelam;
    @FindBy(xpath = "(//*[.=\"Galeri\"])[3]")
    public WebElement galeri;
    @FindBy(xpath = "(//*[.=\"Araç Broşürü\"])[2]")
    public WebElement aracBrosuru;
    @FindBy(xpath = "(//*[.=\"Fiyat Listesi\"])[2]")
    public WebElement fiyatListesi;

}
