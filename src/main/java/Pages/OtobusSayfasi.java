package Pages;

import DriverManager.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OtobusSayfasi extends BaseTest {

    @FindBy(xpath = "(//*[.=\"Galeri\"])[4]")
    public WebElement galeriOtobus;

    @FindBy(xpath = "(//*[.=\"YOĞUN ÇALIŞMA ŞARTLARINA UYGUN\"])[4]")
    public WebElement yogunCalismaSartlarinaUygun;
    @FindBy(xpath = "(//*[.=\"Düşük İşletme Giderleri\"])[3]")
    public WebElement dusukIsletmeGiderleri;
    @FindBy(xpath = "(//*[.=\"Üst Düzey Güvenlik\"])[3]")
    public WebElement ustDuzeyGuvenlik;
    @FindBy(xpath = "(//*[.=\"Yüksek Yolcu Kapasitesi\"])[3]")
    public WebElement yuksekYolcuKapasitesi;
    @FindBy(xpath = "(//*[@class=\"icon icon-arrow-down single-arrow\"])[1]")
    public WebElement uzunluk;
    @FindBy (xpath = "(//*[@class=\"iCheck-helper\"])[1]")
    public WebElement uzunlukIlkButon;

    @FindBy(xpath = "(//*[@class=\"icon icon-arrow-down single-arrow\"])[2]")
    public WebElement yakit;
    @FindBy(xpath = "(//*[@class=\"icon icon-arrow-down single-arrow\"])[3]")
    public WebElement yerlesimDuzeni;

    @FindBy(xpath = "(//*[@class=\"icheckbox_primary\"])[5]")
    public WebElement dizel;

    @FindBy (xpath = "(//*[.=\"Kent CNG\"])[2]")
    public WebElement kentCNGBrosur;

    @FindBy (xpath = "(//*[.=\"KENT XL Broşür\"])[2]")
    public WebElement kentXLBrosur;
    @FindBy (xpath = "(//*[.=\"Kent LF Broşür\"])[2]")
    public WebElement kentLFBrosur;
    @FindBy (xpath = "(//*[.=\"Kent LF Körüklü Broşür\"])[2]")
    public WebElement kentLFKorukluBrosur;

    @FindBy (xpath = "(//*[.=\"Kent CNG Körüklü Broşür\"])[2]")
    public WebElement kentCNGKorukluBrosur;

    @FindBy (xpath = "(//*[.=\"Territo U Broşür\"])[2]")
    public WebElement territoUBrosur;
    @FindBy (xpath = "(//*[.=\"Kent U Broşür\"])[2]")
    public WebElement kentUBrosur;

    @FindBy (xpath = "(//*[.=\"Doruk LE Broşür\"])[2]")
    public WebElement dorukLEBrosur;
    @FindBy (xpath = "(//*[.=\"Sultan LF Broşür\"])[2]")
    public WebElement sultanLFBrosur;

    @FindBy (xpath = "(//*[.=\"Sultan City Broşür\"])[2]")
    public WebElement sultanCityBrosur;


}
