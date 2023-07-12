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

public class TestMadde extends BaseTest {
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
    @Test
    public void otokarCerezAydinlatmaMetni() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        Actions actions = new Actions(BaseTest.driver);
        BaseTest.clickByJS(homePage.aramaButonu);
        BaseTest.waitFor(3);
        BaseTest.clickByJS(homePage.arama);

        homePage.arama.sendKeys("Atlas",Keys.ENTER);
        Assert.assertTrue(homePage.aramaSonuclari.getText().contains("Arama Sonuçları"));

    }


}
