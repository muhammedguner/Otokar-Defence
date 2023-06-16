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
import java.sql.DriverManager;

public class HomePageTestCases extends BaseTest {

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


    }

    @Test(priority = 1)
    public void otokarTicari() {
          sayfayaGiris();
          homePage.cookiesAccept.click();
          homePage.mikrobus.click();
          homePage.centro.click();


        BaseTest.waitFor(3);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/centro-dizel/otokar-centro-d-web1-1920X700.jpg?ext=.jpg"));
        Actions actions = new Actions(BaseTest.driver);

        System.out.println(mikrobusSayfasi.yakitTipi.getText());

       //actions.moveToElement(mikrobusSayfasi.yakitTipi).perform();
        //Assert.assertTrue(mikrobusSayfasi.yakitTipi.isDisplayed());
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
        mikrobusSayfasi.konfor.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/CENTRO3-706x508-px.jpg?ext=.jpg"));
        mikrobusSayfasi.maziyeSelam.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/ecentro-1076829956-796x650.jpg?ext=.jpg"));
        mikrobusSayfasi.galeri.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/otokar-elektrikliler-web-2022-centro-796x650-1.jpg?ext=.jpg\""));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/otokar-elektrikliler-web-2022-centro-796x650-2.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/minibus/e-centro/otokar-elektrikliler-web-2022-centro-796x650-3.jpg?ext=.jpg"));

        BaseTest.driver.quit();

    }

    @Test(priority = 2)
    public void test2() {
        sayfayaGiris();
        homePage.cookiesAccept.click();
    }
}
