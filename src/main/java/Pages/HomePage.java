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

    @FindBy(xpath = "(//*[@class=\"icon icon-close\"])[3]")
    public WebElement cookiesClose;

    @FindBy(xpath = "//*[.=\"Tüm Çerezleri Kabul Et\"]")
    public WebElement cookiesAccept;
    @FindBy (xpath = "(//*[@class=\"icon icon-arrow-right\"])[1]")
    public WebElement slider1;

    @FindBy (xpath = "//*[.=\"Otobüsleri Keşfet\"]")
    public WebElement otobusleriKesfet;

    @FindBy(xpath = "(//*[text()=\"Şehir İçi\"])[1]")
    public WebElement sehirIci;

    @FindBy(xpath = "(//*[@class=\"owl-dots\"])[1]")
    public WebElement sliderButton1;

    @FindBy(xpath = "(//*[@class=\"owl-dot\"])[1]")
    public WebElement sliderButton1e1;

    @FindBy(xpath = "(//*[@class=\"owl-dot\"])[2]")
    public WebElement sliderButton1e2;

    @FindBy(xpath = "(//*[@class=\"owl-dot\"])[3]")
    public WebElement sliderButton1e3;
    @FindBy(xpath = "(//*[@class=\"owl-dot\"])[4]")
    public WebElement sliderButton1e4;
    @FindBy(xpath = "(//*[@class=\"owl-dot\"])[5]")
    public WebElement sliderButton1e5;

    @FindBy(xpath = "//*[text()=\"e-KENT\"]")
    public WebElement eKent;

    @FindBy(xpath = "//*[text()=\"e-KENT KÖRÜKLÜ\"]")
    public WebElement eKentKoruklu;

    @FindBy(xpath = "//*[text()=\"KENT CNG\"]")
    public WebElement kentCNG;

    @FindBy(xpath = "//*[text()=\"KENT XL\"]")
    public WebElement kentXL;
    @FindBy(xpath = "//*[text()=\"KENT LF\"]")
    public WebElement kentLF;
    @FindBy(xpath = "//*[text()=\"KENT LF KÖRÜKLÜ\"]")
    public WebElement kentLFKoruklu;

    @FindBy(xpath = "//*[text()=\"KENT CNG KÖRÜKLÜ\"]")
    public WebElement kentCNGKoruklu;
    @FindBy(xpath = "(//*[.='Territo U'])[2]")
    public WebElement territoU;
    @FindBy(xpath = "(//*[text()='KENT U'])[1]")
    public WebElement kentU;

    @FindBy(xpath = "//*[text()=\"DORUK LE\"]")
    public WebElement dorukLE;

    @FindBy(xpath = "//*[text()=\"SULTAN LF\"]")
    public WebElement sultanLF;
    @FindBy(xpath = "//*[text()=\"SULTAN CITY\"]")
    public WebElement sultanCity;

    @FindBy(xpath = "(//*[text()=\"Turizm ve Servis\"])[3]")
    public WebElement turizmVeServis;

    @FindBy(xpath = "//*[text()=\"DORUK T\"]")
    public WebElement dorukT;
    @FindBy(xpath = "//*[text()=\"SULTAN GİGA\"]")
    public WebElement sultanGiga;
    @FindBy(xpath = "//*[text()=\"SULTAN MEGA\"]")
    public WebElement sultanMega;
    @FindBy(xpath = "//*[text()=\"SULTAN MAXI\"]")
    public WebElement sultanMaxi;
    @FindBy(xpath = "//*[text()=\"SULTAN COMFORT\"]")
    public WebElement sultanComfort;

    @FindBy(xpath = "(//*[text()=\"KENT U\"])[2]")
    public WebElement kentU2;

    @FindBy(xpath = "(//*[text()=\"SULTAN COMFORT\"])[1]")
    public WebElement sultanComfort2;
    @FindBy(xpath = "//*[text()=\"SULTAN MAXI ENGELSİZ\"]")
    public WebElement sultanMaxiEngelsiz;
    @FindBy(xpath = "(//*[text()=\"Özel Araçlar\"])[3]")
    public WebElement ozelAraclar;
    @FindBy(xpath = "//*[text()=\"Çevik Kuvvet Otobüsü\"]")
    public WebElement cevikKuvvetOtobusu;

    @FindBy(xpath = "//*[text()=\"Tutuklu Nakil Aracı\"]")
    public WebElement tutukluNakilAraci;
    @FindBy(xpath = "//*[text()=\"Gezici Sağlık Araçları\"]")
    public WebElement geziciSaglikAraci;

    @FindBy(xpath = "//*[text()=\"ÜRÜNÜ İNCELE\"]")
    public WebElement urunuIncele;
    @FindBy(xpath = "//*[text()=\"Haberler\"]")
    public WebElement haberler;
    @FindBy(xpath = "(//*[text()=\"Blog\"])[1]")
    public WebElement blog;
    @FindBy(xpath = "(//*[text()=\"Detaylı Bilgi\"])[21]")
    public WebElement musteriHattiDetayBilgi;
    @FindBy(xpath = "//*[text()=\"Mobil Uygulamamızı Ücretsiz İndirin!\"]")
    public WebElement mobilUygulama;
    @FindBy(xpath = "(//*[text()=\"Otokar Kurumsal\"])[2]")
    public WebElement otokarKurumsalButonu;
    @FindBy (xpath = "//*[text()=\"Müşteri Hattı: 444 68 57\"]")
    public WebElement musteriHatti;

    @FindBy (xpath = "//*[@class=\"icon icon-facebook\"]")
    public WebElement facebookButonu;
    @FindBy (xpath = "//*[@class=\"icon icon-linkedin\"]")
    public WebElement linkedinButonu;
    @FindBy (xpath = "//*[@class=\"icon icon-twitter\"]")
    public WebElement twitterButonu;
    @FindBy (xpath = "//*[@class=\"icon icon-youtube\"]")
    public WebElement youtubeButonu;
    @FindBy (xpath = "(//*[@class=\"img-fluid lazy\"])[3]")
    public WebElement kocButonu;
    @FindBy(xpath = "(//*[@class=\"dropdown-toggle\"])[1]")
    public WebElement mikrobus;
    @FindBy(xpath = "(//*[@class=\"dropdown-toggle\"])[2]")
    public WebElement otobus;
    @FindBy(xpath = "(//*[@class=\"dropdown-toggle\"])[3]")
    public WebElement kamyon;
    @FindBy(xpath = "(//*[.=\"CENTRO\"])[1]")
    public WebElement centro;
    @FindBy(xpath = "(//*[.=\"e-CENTRO\"])[1]")
    public WebElement eCentro;
    @FindBy(xpath = "(//*[text()=\"Turizm ve Servis\"])[1]")
    public WebElement turizmVeServis1;
    @FindBy(xpath = "(//*[text()=\"Özel Araçlar\"])[1]")
    public WebElement ozelAraclar1;

    @FindBy (xpath = "(//*[.=\"Atlas\"])[1]")
    public WebElement atlas;
    @FindBy(xpath = "(//*[.=\"Atlas 3D\"])[1]")
    public WebElement atlas3D;
    @FindBy(xpath = "(//*[.=\"Yetkili Satıcılar\"])[1]")
    public WebElement yetkiliSaticilar;

    @FindBy(xpath = "(//*[.=\"Servis Bul\"])[1]")
    public WebElement servisBul;

    //ARGE SAYFASI

    @FindBy(xpath = "(//*[text()='Detaylı Bilgi'])[10]")
    public WebElement detayliBilgiButtonArge;

    @FindBy(xpath = "(//*[@class='nav-link'])[22]")
    public WebElement urunGelistirmeButton;

    @FindBy(xpath = "(//*[@class='nav-link'])[23]")
    public WebElement bilgisayarDestekliMuhButton;

    @FindBy(xpath = "(//*[@target='_self'])[1]")
    public WebElement argeBasvuruFormu;

    @FindBy(xpath = "(//*[@target='_self'])[2]")
    public WebElement argeMusteriSikayetYonSureci;

    @FindBy(xpath = "(//*[@target='_blank'])[4]")
    public WebElement argeMusteriSikayetFormu;

    @FindBy(xpath = "//*[text()='Tüm Çerezleri Kabul Et']")
    public WebElement argeCookie;

    @FindBy(xpath = "(//*[@class='owl-prev'])[4]")
    public WebElement argeSliderPrev;

    @FindBy(xpath = "(//*[@class='owl-next'])[4]")
    public WebElement argeSliderNext;

    @FindBy(xpath = "(//*[@class='current-item'])[3]")
    public WebElement argeSliderIlkSayfa;

    @FindBy(xpath = "(//*[@class='icon icon-long-arrow-up'])")
    public WebElement argeYukariButton;

    @FindBy(xpath = "(//*[@class='owl-prev'])[2]")
    public WebElement yapisalDayanimSliderPrev;

    @FindBy(xpath = "(//*[@class='owl-next'])[2]")
    public WebElement yapisalDayanimSliderNext;

    @FindBy(xpath = "(//*[@class='current-item'])[1]")
    public WebElement yapisalDayanimIlkSlider;

    @FindBy(xpath = "(//*[@class='owl-prev'])[4]")
    public WebElement nvhAnalizSliderPrev;

    @FindBy(xpath = "(//*[@class='owl-next'])[4]")
    public WebElement nvhAnalizSliderNext;

    @FindBy(xpath = "(//*[@class='current-item'])[2]")
    public WebElement nvhAnalizIlkSlider;

    @FindBy(xpath = "(//*[@class='owl-prev'])[6]")
    public WebElement carpismaGuvenlikSliderPrev;

    @FindBy(xpath = "(//*[@class='owl-next'])[6]")
    public WebElement carpismaGuvenlikSliderNext;

    @FindBy(xpath = "(//*[@class='current-item'])[3]")
    public WebElement carpismaGuvenlikIlkSlider;

    @FindBy(xpath = "(//*[@class='owl-prev'])[8]")
    public WebElement hadSliderPrev;

    @FindBy(xpath = "(//*[@class='owl-next'])[8]")
    public WebElement hadSliderNext;

    @FindBy(xpath = "(//*[@class='current-item'])[4]")
    public WebElement hadIlkSlider;

    @FindBy(xpath = "//*[text()=\"Çerez Aydınlatma Metni\"]")
    public WebElement cerezAydinlatmametni;

    @FindBy(xpath = "//*[text()=\"Gizlilik ve Telif Hakları\"]")
    public WebElement telifHaklari;

    @FindBy(xpath = "//*[text()=\"Kişisel Verilerin Korunması\"]")
    public WebElement kisiselVeriler;

    @FindBy(xpath = "//*[@class=\"report-card\"]")
    public WebElement cerezIndirMetin;

    @FindBy(xpath = "(//*[text()=\"Kişisel Verilerin Korunması Politikası\"])[1]")
    public WebElement kisiselVerilerIndir;

    @FindBy(xpath = "(//*[text()=\"Veri Sahibi Başvuru Formu\"])[1]")
    public WebElement veriSahibiIndir;

    @FindBy(xpath = "//*[text()=\"İndir\"]")
    public WebElement Indir;

    @FindBy(xpath = "(//*[@class=\"icon icon-search\"])[1]")
    public WebElement aramaButonu;

    @FindBy(xpath = "(//*[@class=\"form-control\"])[2]")
    public WebElement arama;

    @FindBy(xpath = "(//*[text()=\"Arama Sonuçları\"])[2]")
    public WebElement aramaSonuclari;





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
