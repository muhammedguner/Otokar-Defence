import DriverManager.BaseTest;
import Pages.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Set;

public class KamyonPageTestCases extends BaseTest {


    HomePage homePage;
    SearchResultsPage searchResultsPage;
    MikrobusSayfasi mikrobusSayfasi ;
    OtobusSayfasi otobusSayfasi;
    BaseTest baseTest;
    KamyonSayfasi kamyonSayfasi;


    @BeforeMethod
    public void beforeMethod(Method m) {
        System.out.println("\n" + "********** Starting Test: " + m.getName() + " **********" + "\n");
        homePage = new HomePage();
        searchResultsPage = new SearchResultsPage();
        mikrobusSayfasi = new MikrobusSayfasi();
        otobusSayfasi = new OtobusSayfasi();
        baseTest = new BaseTest();
        kamyonSayfasi = new KamyonSayfasi();


    }

    @Test(priority = 1)
    public void kamyonTest() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(kamyonSayfasi.kamyon);
        BaseTest.clickByJS(kamyonSayfasi.atlas);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/Atlas-Kamyon-Banner-1920x700-(1).jpg?ext=.jpg"));
        BaseTest.clickByJS(kamyonSayfasi.genelBakis);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/Atlas-Kamyon-banner-706X508-px.jpg?ext=.jpg"));
        BaseTest.clickByJS(kamyonSayfasi.ekonomi);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/Atlas-Kamyon-Banner-1420x700.jpg?ext=.jpg"));
        BaseTest.clickByJS(kamyonSayfasi.galeri);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-gorsel2_1.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-gorsel1_1.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/pdf/fiyat-listesi/atlas-1172100004-796x650.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/pdf/fiyat-listesi/atlas-1681906270-796x650.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/pdf/fiyat-listesi/atlas-2104324439-796x650.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/ATLAS-shutterstock_726631132-795x650.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-1-796x650_1.jpg?ext=.jpg"));
        //BaseTest.clickByJS(kamyonSayfasi.sliderButton2);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-2-796x650_1.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-3-796x650_1.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-4-796x650_1.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-5-796x650_1.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/3Z4A1178.JPG?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/3Z4A1181.JPG?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/3Z4A1268.JPG?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/3Z4A1269.JPG?ext=.jpg"));
       //BaseTest.clickByJS(kamyonSayfasi.sliderButton3);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/3Z4A1273.JPG?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/bardak_tutucu.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/3Z4A1287.JPG?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/3Z4A1290.JPG?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas_dashboard.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/3Z4A1293-copy.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.clickByJS(kamyonSayfasi.kamyon);
        BaseTest.clickByJS(kamyonSayfasi.atlas3D);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-3d/ATLAS-3D-GORSEL-BANNER-08.jpg?ext=.jpg"));
        BaseTest.clickByJS(kamyonSayfasi.genelBakis);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-3d/ATLAS-3D-GORSEL-BANNER_580-copy-4.jpg?ext=.jpg"));
        BaseTest.clickByJS(kamyonSayfasi.dertEtme);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-3d/ATLAS-3D-GORSEL-BANNER-23.jpg?ext=.jpg"));
        BaseTest.clickByJS(kamyonSayfasi.galeri);

        Assert.assertTrue(BaseTest.driver.getPageSource().contains(""));



    }

    @Test(priority = 2)
    public void atlasBrosur() {

        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.kamyon);
        BaseTest.clickByJS(kamyonSayfasi.atlas);
        BaseTest.waitFor(1);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(kamyonSayfasi.aracBrosuru).perform();
        BaseTest.clickByJS(kamyonSayfasi.aracBrosuru);

        BaseTest.waitFor(2);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

      Assert.assertEquals("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/ATLAS-2023-OK-7-montaj-TR-(TK04TI-23)-onizleme.pdf",
              BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();


    }

    @Test(priority = 3)
    public void atlasFiyatListesi() {

        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.kamyon);
        BaseTest.clickByJS(kamyonSayfasi.atlas);
        BaseTest.waitFor(1);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(kamyonSayfasi.fiyatListesi).perform();
        BaseTest.clickByJS(kamyonSayfasi.fiyatListesi);

        BaseTest.waitFor(2);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertEquals("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/pdf/02-fiyat-listesi-2023-07-10.pdf",
                BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();
    }

    @Test(priority = 4)
    public void atlasTavsiyeli() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.kamyon);
        BaseTest.clickByJS(kamyonSayfasi.atlas);
        BaseTest.waitFor(1);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(kamyonSayfasi.tavsiyeliListe).perform();
        BaseTest.clickByJS(kamyonSayfasi.tavsiyeliListe);

        BaseTest.waitFor(2);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertEquals("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-tavsiyeli-ustyapi-sirketleri-01-06-2022-rev01.pdf",
                BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();
    }

    @Test(priority = 5)
    public void atlasAracUstu() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.kamyon);
        BaseTest.clickByJS(kamyonSayfasi.atlas);
        BaseTest.waitFor(1);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(kamyonSayfasi.aracUstu).perform();
        BaseTest.clickByJS(kamyonSayfasi.aracUstu);

        BaseTest.waitFor(2);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertEquals("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/pdf/atlas-euro-6-arac-ustu-ekipman-uygulama-klavuzu-2022-rev01.pdf",
                BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();
    }

    @Test(priority = 6)
    public void atlas3DBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.kamyon);
        BaseTest.clickByJS(kamyonSayfasi.atlas3D);
        BaseTest.waitFor(1);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(kamyonSayfasi.aracBrosuru).perform();
        BaseTest.clickByJS(kamyonSayfasi.aracBrosuru);

        BaseTest.waitFor(2);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertEquals("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-3d/ATLAS-3D-BROSURU-2023-TK05TB-23-onizleme.pdf",
                BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();
    }

    @Test(priority = 7)
    public void atlas3DFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.kamyon);
        BaseTest.clickByJS(kamyonSayfasi.atlas3D);
        BaseTest.waitFor(1);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(kamyonSayfasi.fiyatListesi).perform();
        BaseTest.clickByJS(kamyonSayfasi.fiyatListesi);

        BaseTest.waitFor(2);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertEquals("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/pdf/02-fiyat-listesi-2023-07-10.pdf",
                BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();
    }

    @Test(priority = 8)
    public void atlas3DTavsiyeli() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.kamyon);
        BaseTest.clickByJS(kamyonSayfasi.atlas3D);
        BaseTest.waitFor(1);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(kamyonSayfasi.tavsiyeliListe).perform();
        BaseTest.clickByJS(kamyonSayfasi.tavsiyeliListe);

        BaseTest.waitFor(2);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertEquals("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/kamyon/atlas-tavsiyeli-ustyapi-sirketleri-01-06-2022-rev01.pdf",
                BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();

    }

    @Test(priority = 9)
    public void atlas3DAracUstu() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.kamyon);
        BaseTest.clickByJS(kamyonSayfasi.atlas3D);
        BaseTest.waitFor(1);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(kamyonSayfasi.aracUstu).perform();
        BaseTest.clickByJS(kamyonSayfasi.aracUstu);

        BaseTest.waitFor(2);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertEquals("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/pdf/atlas-euro-6-arac-ustu-ekipman-uygulama-klavuzu-2022-rev01.pdf",
                BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();
    }

    @Test(priority = 10)
    public void yetkiliSaticilar() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.yetkiliSaticilar);
        Assert.assertEquals("https://commercial.otokar.com.tr/satis/bayiler",
                BaseTest.driver.getCurrentUrl());
    }

    @Test(priority = 11)
    public void servisBul() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.servisBul);
        Assert.assertEquals("https://commercial.otokar.com.tr/satis-sonrasi/yedek-parca-bayileri",
                BaseTest.driver.getCurrentUrl());
        BaseTest.clickByJS(kamyonSayfasi.yetkiliServisler);
        Assert.assertEquals("https://commercial.otokar.com.tr/satis-sonrasi/yetkili-servisler",
                BaseTest.driver.getCurrentUrl());
        BaseTest.clickByJS(kamyonSayfasi.yurtDisiServis);
        Assert.assertEquals("https://commercial.otokar.com.tr/satis-sonrasi/yurt-disi-yetkili-servisler",
                BaseTest.driver.getCurrentUrl());

    }

    @Test(priority = 12)
    public void satisSonrasi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.hamburger);
        BaseTest.clickByJS(kamyonSayfasi.satisSonrasi);
        BaseTest.clickByJS(kamyonSayfasi.garantiUygulamalari);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/news/KENT-LF_kazakistan.JPG?ext=.jpg"));
        BaseTest.clickByJS(kamyonSayfasi.hamburger);
        BaseTest.clickByJS(kamyonSayfasi.satisSonrasi);
        BaseTest.clickByJS(kamyonSayfasi.geriCagirmaFormu);
        Assert.assertEquals("https://commercial.otokar.com.tr/satis-sonrasi/geri-cagirma-formu",
                BaseTest.driver.getCurrentUrl());
        BaseTest.clickByJS(kamyonSayfasi.hamburger);
        BaseTest.clickByJS(kamyonSayfasi.satisSonrasi);
        BaseTest.clickByJS(kamyonSayfasi.orijinalYaglar);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otokar-spectra/otokar-spectra-yaglari.png?ext=.png"));
//        Assert.assertTrue(kamyonSayfasi.guvenlikBilgiBrosur.getText().contains("Güvenlik Bilgi Broşürleri"));
    //    Assert.assertTrue(kamyonSayfasi.teknikBilgiBrosurleri.getText().contains("Teknik Bilgi Broşürleri"));

    }

    @Test(priority = 13)
    public void tamirBakimPortali() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.hamburger);
        BaseTest.clickByJS(kamyonSayfasi.satisSonrasi);
        BaseTest.clickByJS(kamyonSayfasi.tamirBakim);
        BaseTest.waitFor(2);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertEquals("https://rmi.otokar.com.tr/",
                BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();


    }

    @Test(priority = 14)
    public void homePageArge() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.hamburger);
        BaseTest.clickByJS(kamyonSayfasi.arge);

        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/ar-ge/otokar-ticari-ar-ge-banner.png?ext=.png"));
        Actions actions = new Actions(BaseTest.driver);


        BaseTest.waitFor(2);

        Assert.assertTrue(BaseTest.driver.getCurrentUrl().contains("ar-ge/test-validasyon"));
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/ar-ge/otokar-ticari-ar-ge-banner.png?ext=.png"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        BaseTest.waitFor(3);
        homePage.argeBasvuruFormu.click();
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().contains("iletisim/bize-ulasin?q=8"));
        BaseTest.driver.navigate().back();
        BaseTest.waitFor(3);
        homePage.argeMusteriSikayetYonSureci.click();
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("Test-Merkezi/AL-002566-Test-Merkezi-Musteri-Sikayet-Yonetimi-Sureci-4_1.pdf"));
        BaseTest.waitFor(2);
        BaseTest.driver.navigate().back();
        BaseTest.waitFor(3);
        homePage.argeMusteriSikayetFormu.click();
        BaseTest.waitFor(2);

        String argeSayfasi = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles) {
            if (!each.equals(argeSayfasi)) {
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().contains("iletisim/sikayet-formu"));
        BaseTest.driver.switchTo().window(argeSayfasi);
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/ar-ge/otokar-ticari-simulasyon-nhv-testleri.png?ext=.png"));
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/ar-ge/otokar-ticari-saha-testleri.png?ext=.png"));
        BaseTest.scrollIntoViewJS(homePage.argeSliderPrev);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/ar-ge/emi-emc/emc-emi-big-08.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        homePage.argeSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/ar-ge/emi-emc/emc-emi-big-07.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        homePage.argeSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/ar-ge/emi-emc/emc-emi-big-03.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        homePage.argeSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/ar-ge/emi-emc/p1200228.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        homePage.argeSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/ar-ge/emi-emc/ogp.jpg?ext=.jpg"));
        BaseTest.waitFor(1);
        BaseTest.scrollIntoViewJS(homePage.argeSliderPrev);
        homePage.argeSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.argeSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.argeSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.argeSliderPrev.click();
        BaseTest.waitFor(2);
        Assert.assertTrue(homePage.argeSliderIlkSayfa.getText().contains("01"));
        BaseTest.waitFor(2);
        homePage.argeYukariButton.click();


        BaseTest.waitFor(3);
        homePage.urunGelistirmeButton.click();
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().contains("/ar-ge/urun-gelistirme"));
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/otokar-ticari-urun-gelistirme.png?ext=.png"));
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/otokar-ticari-otokar-kent-electra.png?ext=.png"));
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/otokar-ticari-akilli-otobus-comosef.png?ext=.png"));
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/otokar-ticari-elektrikli-otobus.png?ext=.png"));


        BaseTest.waitFor(3);
        homePage.bilgisayarDestekliMuhButton.click();
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().contains("ar-ge/bilgisayar-destekli-muhendislik"));
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/otokar-ticari-ar-ge-banner.png?ext=.png"));
        actions.sendKeys(Keys.PAGE_DOWN);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/yapisal-dayanim/Yapisal_1.jpg?ext=.jpg"));
        homePage.yapisalDayanimSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/yapisal-dayanim/Yapisal_2.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        homePage.yapisalDayanimSliderPrev.click();
        BaseTest.waitFor(2);
        Assert.assertEquals(homePage.yapisalDayanimIlkSlider.getText(), "01");
        //ReusableMethods.scrollIntoViewJS(homePage.nvhAnalizSliderNext);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/nhv/NVH_1.jpg?ext=.jpg"));

        BaseTest.waitFor(2);
        homePage.nvhAnalizSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/nhv/NVH_3.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        homePage.nvhAnalizSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/nhv/NVH_5.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        homePage.nvhAnalizSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/nhv/NVH_6.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        homePage.nvhAnalizSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/nhv/NVH_7.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        homePage.nvhAnalizSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/nhv/NVH_9.jpg?ext=.jpg"));
        BaseTest.waitFor(1);
        homePage.nvhAnalizSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.nvhAnalizSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.nvhAnalizSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.nvhAnalizSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.nvhAnalizSliderPrev.click();
        BaseTest.waitFor(1);
        Assert.assertEquals(homePage.nvhAnalizIlkSlider.getText(), "01");

        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/carpisma-guvenligi/Carpisma_Guvenligi-1.jpg?ext=.jpg"));
        homePage.carpismaGuvenlikSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/carpisma-guvenligi/Carpisma_Guvenligi-2.jpg?ext=.jpg"));
        BaseTest.waitFor(1);
        homePage.carpismaGuvenlikSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/carpisma-guvenligi/Carpisma_Guvenligi-3.jpg?ext=.jpg"));
        BaseTest.waitFor(1);
        homePage.carpismaGuvenlikSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/carpisma-guvenligi/Carpisma_Guvenligi-4.jpg?ext=.jpg"));
        BaseTest.waitFor(1);
        homePage.carpismaGuvenlikSliderNext.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/carpisma-guvenligi/Carpisma_Guvenligi-5.jpg?ext=.jpg"));
        BaseTest.waitFor(1);
        homePage.carpismaGuvenlikSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.carpismaGuvenlikSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.carpismaGuvenlikSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.carpismaGuvenlikSliderPrev.click();
        BaseTest.waitFor(2);
        Assert.assertEquals(homePage.carpismaGuvenlikIlkSlider.getText(), "01");

        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/hesaplamali-akiskanlar-dinamigi/CFD2.jpg?ext=.jpg"));
        homePage.hadSliderNext.click();
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/hesaplamali-akiskanlar-dinamigi/CFD3.jpg?ext=.jpg"));
        homePage.hadSliderNext.click();
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/hesaplamali-akiskanlar-dinamigi/CFD4.jpg?ext=.jpg"));
        homePage.hadSliderNext.click();
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/hesaplamali-akiskanlar-dinamigi/CFD5.jpg?ext=.jpg"));
        homePage.hadSliderNext.click();
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/hesaplamali-akiskanlar-dinamigi/CFD7.jpg?ext=.jpg"));
        homePage.hadSliderNext.click();
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("Otokar-Ticari/ar-ge/bdm/hesaplamali-akiskanlar-dinamigi/CFD8.jpg?ext=.jpg"));
        homePage.hadSliderNext.click();
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/Otokar-Ticari/ar-ge/bdm/hesaplamali-akiskanlar-dinamigi/CFD9.jpg?ext=.jpg"));
        BaseTest.waitFor(1);
        homePage.hadSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.hadSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.hadSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.hadSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.hadSliderPrev.click();
        BaseTest.waitFor(1);
        homePage.hadSliderPrev.click();
        BaseTest.waitFor(2);
        Assert.assertEquals(homePage.hadIlkSlider.getText(), "01");
        BaseTest.driver.navigate().back();
        BaseTest.driver.navigate().back();
        BaseTest.driver.navigate().back();
        BaseTest.waitFor(4);
    }

    @Test(priority = 15)
    public void otokarHatti() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.hamburger);
        BaseTest.clickByJS(kamyonSayfasi.otokarHatti);
        Assert.assertEquals("https://commercial.otokar.com.tr/haberler",
                BaseTest.driver.getCurrentUrl());
        BaseTest.clickByJS(kamyonSayfasi.metaverseUlasim);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/blog/metaverse-880x460.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.clickByJS(kamyonSayfasi.onleyiciBakim);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/blog/atlas-880X460.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.clickByJS(kamyonSayfasi.erisilebilirulasim);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/blog/erisilebilir_880X460.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.clickByJS(kamyonSayfasi.ulasimTarihindeki);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/blog/kolaj-880X460.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        Actions actions = new Actions(BaseTest.driver);

        BaseTest.clickByJS(kamyonSayfasi.sinirsizKilometre);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/blog/atlas-3d-880X460.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(kamyonSayfasi.otokar60Yasinda);
        Assert.assertTrue(BaseTest.driver.getPageSource().
                contains("/OtokarTicari/media/Otokar-Ticari/blog/60yil-880X460.jpg?ext=.jpg"));


    }
    @Test(priority = 16)
    public void otokarKurumsal() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.hamburger);
        BaseTest.clickByJS(kamyonSayfasi.otokarKurumsal);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertEquals("https://www.otokar.com.tr/",
                BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();
    }
    @Test(priority = 17)
    public void otokarEurope() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);
        BaseTest.clickByJS(kamyonSayfasi.hamburger);
        BaseTest.clickByJS(kamyonSayfasi.otokarEurope);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertEquals("https://www.otokareurope.com/",
                BaseTest.driver.getCurrentUrl());


        BaseTest.driver.quit();
    }


}
