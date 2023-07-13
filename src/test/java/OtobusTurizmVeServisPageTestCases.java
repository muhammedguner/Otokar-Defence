import DriverManager.BaseTest;
import Pages.HomePage;
import Pages.MikrobusSayfasi;
import Pages.OtobusSayfasi;
import Pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Set;

public class OtobusTurizmVeServisPageTestCases extends BaseTest {



    HomePage homePage;
    SearchResultsPage searchResultsPage;
    MikrobusSayfasi mikrobusSayfasi ;
    OtobusSayfasi otobusSayfasi;
    BaseTest baseTest;


    @BeforeMethod
    public void beforeMethod(Method m) {
        System.out.println("\n" + "********** Starting Test: " + m.getName() + " **********" + "\n");
        homePage = new HomePage();
        searchResultsPage = new SearchResultsPage();
        mikrobusSayfasi = new MikrobusSayfasi();
        otobusSayfasi = new OtobusSayfasi();
        baseTest = new BaseTest();


    }

    @Test(priority = 1)
    public void turizmVeServis() {

        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-giga/sultan-giga-634364558-506x337-px.jpg?ext=.jpg"));
        BaseTest.clickByJS(homePage.dorukT);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/doruk-t/doruk-t-shutterstock-2019-1920-730.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/doruk-t/3Z4A7063.png?ext=.png"));
        BaseTest.clickByJS(otobusSayfasi.konfor);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/doruk-t/doruk-t-konfor-980.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.guvenlik);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/doruk-t/doruk-t-guvenlik-880.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.modernTasarim);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/doruk-t/dorukt-modern-tasarim-705-508_1.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.clickByJS(homePage.sultanGiga);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-giga/sultan-giga-2027643170-1920x700-px-(1).jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-giga/sultan-giga-634364558-1920x700-px.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.clickByJS(homePage.sultanMega);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/elektrikli/sultan-mega/sultan-mega-slider.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.konfor);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/elektrikli/sultan-mega/sultan-mega-turizm-servis-otobusu-14-580.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.idealTurizmOtobusu);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/elektrikli/sultan-mega/sultan-mega-turizm-servis-otobusu-17-580.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.guvenlik);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/elektrikli/sultan-mega/sultan-mega-detay.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.clickByJS(homePage.sultanMaxi);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-maxi/sultan-maxi-desktop.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.genelBakis);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-maxi/sultan-maxi-1-dekupe-705x580-px.png?ext=.png"));
        BaseTest.clickByJS(otobusSayfasi.icTasarimveKonfor);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-maxi/sultan-maxi-ic-tasarim-ve-konfor.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.guvenlikveYolTutus);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-maxi/sultan-maxi-guvenlik-ve-yol-tutusjpg.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.seritTakipSistemi);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-maxi/sultan-maxi-detay.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.clickByJS(homePage.sultanComfort);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-comfort/sultan-comfort-1920x700.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.guvenlik);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-comfort/705x580.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.turizm);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-comfort/sultan-comfort-turizm-servis-otobusu-16-705-580.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.ogrenciTasimaciligi);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-comfort/sultan_comfort_okul-705-580.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.personelTasimaciligi);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-comfort/sultan-comfort-web-03-705x580-px.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.clickByJS(homePage.kentU);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-u/Kent-U-banner_1920x1000-px-web.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.clickByJS(homePage.sultanMaxiEngelsiz);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-maxi-engelsiz/1920x700-desktop.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-maxi-engelsiz/320x280-sultan-engelsiz.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.herkesIcinTasimacilik);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-maxi-engelsiz/sultan-maxi-engelsiz-turizm-servis-otobusu-0-1420-700.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.guvenlik);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-maxi-engelsiz/sultan_maxi_engelsiz-705-580.jpg?ext=.jpg"));
        BaseTest.driver.quit();


    }

    @Test(priority = 2)
    public void dorukTBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.dorukT);
        BaseTest.clickByJS(otobusSayfasi.dorukTBrosur);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/DORUK-T-EURO6-KS66TM-20-onizleme-new.pdf"));

        BaseTest.driver.quit();


    }

    @Test(priority = 3)
    public void dorukTFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.dorukT);
        BaseTest.clickByJS(mikrobusSayfasi.fiyatListesi);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/"));

        BaseTest.driver.quit();
    }

    @Test(priority = 4)
    public void sultanGigaBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.sultanGiga);
        BaseTest.clickByJS(otobusSayfasi.sultanGigaBrosur);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-giga/SULTAN-GIGA-KS94TB-23-onizleme.pdf"));

        BaseTest.driver.quit();


    }

    @Test(priority = 5)
    public void sultanGigaFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.sultanGiga);
        BaseTest.clickByJS(mikrobusSayfasi.fiyatListesi);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/"));

        BaseTest.driver.quit();

    }

    @Test(priority = 6)
    public void sultanMegaBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.sultanMega);
        BaseTest.clickByJS(otobusSayfasi.sultanMegaBrosur);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/sultan-mega-euro6-ks73to-23-onizleme.pdf"));

        BaseTest.driver.quit();

    }

    @Test(priority = 7)
    public void sultanMegaFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.sultanMega);
        BaseTest.clickByJS(mikrobusSayfasi.fiyatListesi);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/"));

        BaseTest.driver.quit();

    }

    @Test(priority = 8)
    public void sultanMaxiBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.sultanMaxi);
        BaseTest.clickByJS(otobusSayfasi.sultanMaxiBrosur);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/sultan-maxi-euro6-ks63ts-23-onizleme_1.pdf"));

        BaseTest.driver.quit();
    }

    @Test(priority = 9)
    public void sultanMaxiFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.sultanMaxi);
        BaseTest.clickByJS(mikrobusSayfasi.fiyatListesi);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/"));

        BaseTest.driver.quit();
    }

    @Test(priority = 10)
    public void sultanComfortBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.sultanComfort);
        BaseTest.clickByJS(otobusSayfasi.sultanComfortBrosur);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/sultan-comfort-euro6-ks62ts-23-onizleme.pdf"));

        BaseTest.driver.quit();
    }

    @Test(priority = 11)
    public void sultanComfortFiyatlistesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.sultanComfort);
        BaseTest.clickByJS(mikrobusSayfasi.fiyatListesi);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/"));

        BaseTest.driver.quit();

    }

    @Test(priority = 12)
    public void kentUBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.kentU);
        BaseTest.clickByJS(otobusSayfasi.kentUBrosur);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/pdf/Kent-U-MAVI-EURO6-KS72TI-20-onizleme.pdf"));

        BaseTest.driver.quit();
    }

    @Test(priority = 13)
    public void kentUFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.kentU);
        BaseTest.clickByJS(mikrobusSayfasi.fiyatListesi);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/"));

        BaseTest.driver.quit();
    }

    @Test(priority = 14)
    public void sultanMaxiEngelsizBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.sultanMaxiEngelsiz);
        BaseTest.clickByJS(otobusSayfasi.sultanMaxiEngelsizBrosur);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/sultan-maxi-engelsiz-euro6-ks75tm-23-onizleme.pdf"));

        BaseTest.driver.quit();
    }

    @Test(priority = 15)
    public void sultanMaxiEngelsizFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.cookiesAccept);

        BaseTest.clickByJS(homePage.otobus);
        otobusSayfasi.turizmVeServis.click();
        BaseTest.waitFor(1);


        BaseTest.clickByJS(homePage.sultanMaxiEngelsiz);
        BaseTest.clickByJS(mikrobusSayfasi.fiyatListesi);
        BaseTest.waitFor(3);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/"));

        BaseTest.driver.quit();
    }
    @Test(priority = 16)
    public void ozelAraclar() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.clickByJS(homePage.otobus);
        BaseTest.clickByJS(otobusSayfasi.ozelAraclar);
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/ozel-araclar/egm_420x330_dekupe.png?ext=.png"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/ozel-araclar/cte_dekupe_420x330.png?ext=.png"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/ozel-araclar/kizilay_dekupe_440x330.png?ext=.png"));
        BaseTest.driver.quit();


    }
}
