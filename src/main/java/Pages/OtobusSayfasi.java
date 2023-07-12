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

    @FindBy (xpath = "(//*[text()=\"Turizm ve Servis\"])[1]")
    public WebElement turizmVeServis;

    @FindBy(xpath = "(//*[text()=\"Güvenlik\"])[2]")
    public WebElement guvenlik;

    @FindBy(xpath = "(//*[text()=\"Modern Tasarım\"])[1]")
    public WebElement modernTasarim;

    @FindBy(xpath = "(//*[text()=\"Konfor\"])[2]")
    public WebElement konfor;

    @FindBy(xpath = "(//*[text()=\"İdeal Turizm Otobüsü \"])[2]")
    public WebElement idealTurizmOtobusu;

    @FindBy(xpath = "(//*[text()=\"Genel Bakış\"])[2]")
    public WebElement genelBakis;

    @FindBy(xpath = "(//*[text()=\"İç Tasarım ve Konfor\"])[2]")
    public WebElement icTasarimveKonfor;

    @FindBy(xpath = "(//*[text()=\"Güvenlik ve Yol Tutuş\"])[2]")
    public WebElement guvenlikveYolTutus;

    @FindBy (xpath = "(//*[text()=\"Şerit Takip Sistemi\"])[2]")
    public  WebElement seritTakipSistemi;

    @FindBy(xpath = "(//*[text()=\"Turizm\"])[2]")
    public  WebElement turizm;

    @FindBy(xpath = "(//*[text()=\"Öğrenci Taşımacılığı\"])[2]")
    public  WebElement ogrenciTasimaciligi;

    @FindBy(xpath = "(//*[text()=\"Personel Taşımacılığı\"])[2]")
    public  WebElement personelTasimaciligi;

    @FindBy(xpath = "(//*[text()=\"Herkes İçin Taşımacılık\"])[2]")
    public  WebElement herkesIcinTasimacilik;

    @FindBy(xpath = "(//*[text()=\"Doruk T Broşür\"])[2]")
    public  WebElement dorukTBrosur;

    @FindBy(xpath = "(//*[text()=\"SULTAN GİGA\"])[5]")
    public  WebElement sultanGigaBrosur;

    @FindBy(xpath = "(//*[text()=\"Sultan Mega Broşür\"])[2]")
    public  WebElement sultanMegaBrosur;

    @FindBy(xpath = "(//*[text()=\"Sultan Maxi Broşür\"])[2]")
    public  WebElement sultanMaxiBrosur;

    @FindBy(xpath = "(//*[text()=\"Sultan Comfort Broşür\"])[2]")
    public  WebElement sultanComfortBrosur;

    @FindBy(xpath = "(//*[text()=\"Sultan Maxi Engelsiz Broşür\"])[2]")
    public  WebElement sultanMaxiEngelsizBrosur;

    @FindBy(xpath = "//*[text()=\"Özel Araçlar\"]")
    public WebElement ozelAraclar;

    @FindBy(xpath = "//*[text()=\"Çevik Kuvvet Otobüsü\"]")
    public WebElement cevikKuvvetOtobusu;












}
