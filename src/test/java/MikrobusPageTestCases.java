import DriverManager.BaseTest;
import Pages.HomePage;
import Pages.MikrobusSayfasi;
import Pages.OtobusSayfasi;
import Pages.SearchResultsPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Set;

public class MikrobusPageTestCases extends BaseTest {

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
    public void mikrobusSayfasi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();
        homePage.mikrobus.click();
        homePage.centro.click();


        BaseTest.waitFor(3);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/centro-dizel/otokar-centro-d-web1-1920X700.jpg?ext=.jpg"));
        Actions actions = new Actions(BaseTest.driver);

        // System.out.println(mikrobusSayfasi.yakitTipi.getText());

        actions.moveToElement(mikrobusSayfasi.yakitTipi).perform();
        Assert.assertTrue(mikrobusSayfasi.yakitTipi.isDisplayed());
        Assert.assertTrue(mikrobusSayfasi.kazandiranMikrobus.isDisplayed());
        Assert.assertTrue(mikrobusSayfasi.maksimumGuc.isDisplayed());
        Assert.assertTrue(mikrobusSayfasi.maksimumTork.isDisplayed());
        BaseTest.waitFor(3);
        actions.moveToElement(mikrobusSayfasi.kazandiranMikrobus).perform();
        BaseTest.waitFor(3);
        BaseTest.clickByJS(mikrobusSayfasi.kazandiranMikrobus);
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/centro-dizel/otokar-centro-d-web4-706x508.jpg?ext=.jpg"));
        BaseTest.clickByJS(mikrobusSayfasi.yollarinmodernYuzu);
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/centro-dizel/otokar-centro-d-web3-706x508.jpg?ext=.jpg"));
        actions.moveToElement(homePage.mikrobus).perform();
        BaseTest.clickByJS(homePage.mikrobus);
        homePage.eCentro.click();
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/CENTRO1-1920x700.jpg?ext=.jpg"));
        actions.moveToElement(mikrobusSayfasi.yakitTipi).perform();
        BaseTest.waitFor(1);
        Assert.assertTrue(mikrobusSayfasi.yakitTipi.isDisplayed());
        Assert.assertTrue(mikrobusSayfasi.maksimumGuc.isDisplayed());
        Assert.assertTrue(mikrobusSayfasi.maksimumTork.isDisplayed());
        BaseTest.clickByJS(mikrobusSayfasi.sessizVeCevreci);
        BaseTest.waitFor(1);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/CENTRO4-706x508-px.jpg?ext=.jpg"));
        BaseTest.clickByJS(mikrobusSayfasi.konfor);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/CENTRO3-706x508-px.jpg?ext=.jpg"));
        BaseTest.clickByJS(mikrobusSayfasi.maziyeSelam);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/ecentro-1076829956-796x650.jpg?ext=.jpg"));
        BaseTest.clickByJS(mikrobusSayfasi.galeri);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/otokar-elektrikliler-web-2022-centro-796x650-1.jpg?ext=.jpg\""));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/otokar-elektrikliler-web-2022-centro-796x650-2.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/otokar-elektrikliler-web-2022-centro-796x650-3.jpg?ext=.jpg"));

        BaseTest.driver.quit();

    }

    @Test(priority = 2)
    public void aracBrosuruCentro() {

        sayfayaGiris();
        BaseTest.waitFor(3);


        homePage.cookiesAccept.click();
        homePage.mikrobus.click();
        homePage.centro.click();
        BaseTest.waitFor(3);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(mikrobusSayfasi.aracBrosuru).perform();
        BaseTest.clickByJS(mikrobusSayfasi.aracBrosuru);

        BaseTest.waitFor(3);
        String aracbrosuru = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles1 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles1) {
            if (!each.equals(aracbrosuru)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/centro-mikrobus-euro6-ks92tb-23-onizleme_1.pdf"));
        BaseTest.driver.quit();

    }

    @Test(priority = 3)
    public void fiyatListesiCentro() {
        sayfayaGiris();
        BaseTest.waitFor(3);


        homePage.cookiesAccept.click();
        homePage.mikrobus.click();
        homePage.centro.click();
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(mikrobusSayfasi.fiyatListesi).perform();
        BaseTest.clickByJS(mikrobusSayfasi.fiyatListesi);
        BaseTest.waitFor(3);
        String fiyatlistesi = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles1 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles1) {
            if (!each.equals(fiyatlistesi)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));
        BaseTest.driver.quit();



    }

    @Test(priority = 4)
    public void aracBrosuruEcentro() {
        sayfayaGiris();
        BaseTest.waitFor(3);


        homePage.cookiesAccept.click();
        homePage.mikrobus.click();
        homePage.eCentro.click();
        BaseTest.waitFor(3);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(mikrobusSayfasi.aracBrosuru).perform();
        BaseTest.clickByJS(mikrobusSayfasi.aracBrosuru);
        BaseTest.waitFor(3);
        String aracbrosuru = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles1 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles1) {
            if (!each.equals(aracbrosuru)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/brosur/otokar-sehir-ici-otobusler-dergi-a4-2023-onizleme.pdf"));
        BaseTest.driver.quit();
    }

    @Test(priority = 5)
    public void fiyatListesiEcentro() {
        sayfayaGiris();
        BaseTest.waitFor(3);


        homePage.cookiesAccept.click();
        homePage.mikrobus.click();
        homePage.eCentro.click();
        BaseTest.waitFor(3);
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(mikrobusSayfasi.fiyatListesi).perform();
        BaseTest.clickByJS(mikrobusSayfasi.fiyatListesi);
        BaseTest.waitFor(3);
        String fiyatlistesi = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles1 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles1) {
            if (!each.equals(fiyatlistesi)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/otobus-fiyat-listesi-36.pdf"));
        BaseTest.driver.quit();
    }

}
