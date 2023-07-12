import DriverManager.BaseTest;
import Pages.HomePage;
import Pages.MikrobusSayfasi;
import Pages.OtobusSayfasi;
import Pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Set;

public class OtobusSehirIciPageTestCases extends BaseTest {
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
    public void otobusSayfasi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/kentlf-dekupe-506x337.png?ext=.png"));

        homePage.eKent.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent/kirmizi-kent-e-1920X700-2.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent/kirmizi-kent-e-1920X700-4.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent/kirmizi-kent-e-1920x730.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent_1/otokar-elektrikliler-web-2022-ekent-1920x700.jpg?ext=.jpg"));
        otobusSayfasi.galeriOtobus.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent/kirmizi-kent-e-1920X700-4.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent_1/otokar-elektrikliler-web-2022-ekent-796x650-1.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent_1/otokar-elektrikliler-web-2022-ekent-796x650-2.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent_1/otokar-elektrikliler-web-2022-ekent-796x650-3.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent/kirmizi-kent-e-1920X700-2.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent/kirmizi-kent-e-1920X700-3.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();
        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.eKentKoruklu);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent-koruklu/otokar-elektrikliler-web-2022-ekentc-1920x700.jpg?ext=.jpg"));
        mikrobusSayfasi.konfor.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent-koruklu/otokar-elektrikliler-web-2022-ekentc-796x650-1.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.yogunCalismaSartlarinaUygun);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent-koruklu/otokar-elektrikliler-web-2022-ekentc-796x650-3.jpg?ext=.jpg"));
        BaseTest.clickByJS(mikrobusSayfasi.galeri);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent-koruklu/otokar-elektrikliler-web-2022-ekentc-796x650-1.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent-koruklu/otokar-elektrikliler-web-2022-ekentc-796x650-2.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent-koruklu/otokar-elektrikliler-web-2022-ekentc-796x650-3.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(homePage.kentCNG);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dogal-gazli/kent-dg/kent-dg-shutterstock-1920-730.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(homePage.kentXL);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-xl/Kent-XL-1920x730px-1.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-xl/Kent-XL-1920x730px-2.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-xl/Kent-XL-1920x730px-3_1.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.dusukIsletmeGiderleri);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-xl/Kent-XL-706x580px-4_1.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.ustDuzeyGuvenlik);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-xl/Kent-XL-706x580px-5.jpg?ext=.jpg"));
        BaseTest.clickByJS(otobusSayfasi.yuksekYolcuKapasitesi);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-xl/Kent-XL-706x580px-3_1.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(homePage.kentLF);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-lf/kent-lf-shutterstock-1920-730.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(homePage.kentLFKoruklu);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-lf-koruklu/kent-koruklu-shutterstock-1920-730.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(homePage.kentCNGKoruklu);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-lf-koruklu/kent-lf-cng-koruklu-1920-(1).jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(homePage.territoU);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/territo-u/Territo-U-1920x730px.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(homePage.kentU);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-u/Kent-U-banner_1920x1000-px-web.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(homePage.dorukLE);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/doruk-le/doruk-le-shutterstock-1920-730.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(homePage.sultanLF);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/sultan-lf/sultan-lf-shutterstock-1920-730.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(homePage.sultanCity);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/sultan-city/sultan-city-desktop-2.jpg?ext=.jpg"));
        BaseTest.driver.navigate().back();

        BaseTest.clickByJS(otobusSayfasi.uzunluk);
        BaseTest.clickByJS(otobusSayfasi.uzunlukIlkButon);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/sultan-lf/sultan-lf-shutterstock-2-452-370.jpg?ext=.jpg"));

        BaseTest.clickByJS(otobusSayfasi.uzunlukIlkButon);
        BaseTest.clickByJS(otobusSayfasi.yakit);
        BaseTest.clickByJS(otobusSayfasi.dizel);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-xl/Kent-XL-706x580px-2-listing.jpg?ext=.jpg"));
        BaseTest.driver.quit();
    }

    @Test(priority = 2)
    public void eKentFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.eKent);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));

        BaseTest.driver.quit();
    }

    @Test(priority = 3)
    public void eKentKorukluAracBrosuru() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.eKentKoruklu);
        BaseTest.clickByJS(mikrobusSayfasi.aracBrosuru);

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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/otokar-sehir-ici-otobusler-dergi-a4-2023-onizleme.pdf"));

        BaseTest.driver.quit();

    }
    @Test(priority = 4)
    public void eKentkorukluFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);

        BaseTest.clickByJS(homePage.eKentKoruklu);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));

        BaseTest.driver.quit();
    }

    @Test(priority = 5)
    public void kentCNGAracBrosuru() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.kentCNG);
        BaseTest.clickByJS(otobusSayfasi.kentCNGBrosur);

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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/kent-cng-2022-ks74tg-22-onizleme.pdf"));

        BaseTest.driver.quit();

    }
    @Test(priority = 6)
    public void kentCNGFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.kentCNG);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));

        BaseTest.driver.quit();
    }
    @Test(priority = 7)
    public void kentXLAracBrosuru() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.kentXL);
        BaseTest.clickByJS(otobusSayfasi.kentXLBrosur);

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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/Kent-XL-KS90TA-21-onizleme.pdf"));

        BaseTest.driver.quit();

    }

    @Test(priority = 8)
    public void kentXLFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.kentXL);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));

        BaseTest.driver.quit();
    }
    @Test(priority = 9)
    public void kentLFAracBrosuru() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.kentLF);
        BaseTest.clickByJS(otobusSayfasi.kentLFBrosur);

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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/Kent-LF-EURO6-KS70TN-21-onizleme.pdf"));

        BaseTest.driver.quit();

    }
    @Test(priority = 10)
    public void kentLFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.kentLF);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));

        BaseTest.driver.quit();
    }
    @Test(priority = 11)
    public void kentLFKorukluAracBrosuru() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.kentLFKoruklu);
        BaseTest.clickByJS(otobusSayfasi.kentLFKorukluBrosur);

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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/kent-lf-koruklu-euro6-ks82th-22-onizleme.pdf"));

        BaseTest.driver.quit();

    }

    @Test(priority = 12)
    public void kentLFKorukluFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.kentLFKoruklu);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari"));

        BaseTest.driver.quit();
    }
    @Test(priority = 13)
    public void kentCNGKorukluBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.kentCNGKoruklu);
        BaseTest.clickByJS(otobusSayfasi.kentCNGKorukluBrosur);

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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/kent-cng-koruklu-2022-ks89tc-22-onizleme.pdf"));

        BaseTest.driver.quit();

    }
    @Test(priority = 14)
    public void kentCNGKorukluFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.kentCNGKoruklu);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));

        BaseTest.driver.quit();
    }

    @Test(priority = 15)
    public void territoUBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.territoU);
        BaseTest.clickByJS(otobusSayfasi.territoUBrosur);

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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/Territo-U-EURO6-KS91TA-21-onizleme_1.pdf"));

        BaseTest.driver.quit();

    }
    @Test(priority = 16)
    public void territoUFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.territoU);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));

        BaseTest.driver.quit();
    }
    @Test(priority = 17)
    public void kentUBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/Kent-U-YESIL-EURO6-KS72TJ-20-onizleme.pdf"));
        BaseTest.driver.quit();

    }
    @Test(priority = 18)
    public void kentUFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));
        BaseTest.driver.quit();
    }
    @Test(priority = 19)
    public void dorukLEBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.dorukLE);
        BaseTest.clickByJS(otobusSayfasi.dorukLEBrosur);

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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/DORUK-LE-EURO6-KS68TI-20-onizleme-new.pdf"));
        BaseTest.driver.quit();

    }
    @Test(priority = 20)
    public void dorukLEFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.dorukLE);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));
        BaseTest.driver.quit();
    }
    @Test(priority = 21)
    public void sultanLFBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.sultanLF);
        BaseTest.clickByJS(otobusSayfasi.sultanLFBrosur);

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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/SULTAN-LF-EURO6-KS84TE-20-onizleme-new.pdf"));
        BaseTest.driver.quit();

    }
    @Test(priority = 22)
    public void sultanLFFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.sultanLF);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));
        BaseTest.driver.quit();
    }
    @Test(priority = 23)
    public void sultanCityBrosur() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.sultanCity);
        BaseTest.clickByJS(otobusSayfasi.sultanCityBrosur);

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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/sultan-city-euro6-ks64tm-23-onizleme.pdf"));
        BaseTest.driver.quit();

    }
    @Test(priority = 24)
    public void sultanCityFiyatListesi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(1);
        BaseTest.clickByJS(homePage.otobus);
        homePage.sehirIci.click();
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.sultanCity);
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
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));
        BaseTest.driver.quit();
    }

}
