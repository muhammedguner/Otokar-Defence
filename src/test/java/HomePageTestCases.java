import DriverManager.BaseTest;
import Pages.HomePage;
import Pages.MikrobusSayfasi;
import Pages.OtobusSayfasi;
import Pages.SearchResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.sql.DriverManager;
import java.util.Set;

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
        mikrobusSayfasi = new MikrobusSayfasi();
        otobusSayfasi = new OtobusSayfasi();
        baseTest = new BaseTest();


    }

    @Test(priority = 1)
    public void otokarTicari() {

        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(3);
        //ReusableMethods.waitFor(5);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/OTOKAR-ATLAS-4YIL-GARANTI-WEB-1920x1000.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/news/kent-cng-web-banner-1920x1080.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/news/ekent-mogosoaia-1920x1000.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/banner-gorsel/kent-xl-banner-2_1.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/banner-gorsel/otokar-lider22-web-160123-1920x1000.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/news/e-kent-c-nisan22-1920x1000-px.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/banner-gorsel/otokar-giga1-web-160123-1920x1000.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/banner-gorsel/otokar-atlas-1920x1000.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/pdf/fiyat-listesi/czechia_usti_vectio-1920x1000-px.jpg?ext=.jpg"));
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/banner-gorsel/ATLAS-3D-WEB-GORSELLER-1920x1000.jpg?ext=.jpg"));
        BaseTest.waitFor(2);

        homePage.slider1.click();

        Actions actions = new Actions(BaseTest.driver);
        // actions.moveToElement(otokarAnasayfa.otobusleriKesfet).perform();
        BaseTest.scrollIntoViewJS(homePage.otobusleriKesfet);
        BaseTest.waitFor(2);
        Assert.assertEquals("Otobüsleri Keşfet",homePage.otobusleriKesfet.getText());
        BaseTest.waitFor(2);

        // ReusableMethods.scrollIntoView(otokarAnasayfa.sehirIci1);
        //otokarAnasayfa.sehirIci1.click();
        // Assert.assertEquals("Şehir İçi",otokarAnasayfa.sehirIci1.getText());
        // ReusableMethods.waitFor(2);
        actions.moveToElement(homePage.sliderButton1).perform();
        BaseTest.waitFor(2);

        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent/kirmizi-kent-e-706X508.png?ext=.png"));
        BaseTest.waitFor(2);
        Assert.assertEquals("e-KENT",homePage.eKent.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/elektrikli/e-kent-koruklu/otokar-elektrikliler-web-2022-ekentc-706x508.jpg?ext=.jpg"));
        Assert.assertEquals("e-KENT KÖRÜKLÜ",homePage.eKentKoruklu.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dogal-gazli/kent-dg/kent-cng-420x300-copy.jpg?ext=.jpg"));
        Assert.assertEquals("KENT CNG",homePage.kentCNG.getText());

        homePage.sliderButton1e1.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-xl/Kent-XL-706x580px-2-listing.jpg?ext=.jpg"));
        Assert.assertEquals("KENT XL",homePage.kentXL.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-lf/kent-lf-shutterstock-452-370.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        Assert.assertEquals("KENT LF",homePage.kentLF.getText());
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-lf-koruklu/kent-koruklu-shutterstock-452-370.jpg?ext=.jpg"));
        Assert.assertEquals("KENT LF KÖRÜKLÜ",homePage.kentLFKoruklu.getText());

        homePage.sliderButton1e2.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-lf-koruklu/kent-lf-koruklu-cng-450-300.jpg?ext=.jpg"));
        Assert.assertEquals("KENT CNG KÖRÜKLÜ",homePage.kentCNGKoruklu.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/territo-u/Territo-U-706x580px.jpg?ext=.jpg"));
      //  Assert.assertEquals("Territo U",homePage.territoU.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/kent-u/Kent-U-banner_320x320-px-2.jpg?ext=.jpg"));


        homePage.sliderButton1e3.click();

        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/doruk-le/doruk-le-shuttrestock-452-370.jpg?ext=.jpg"));
        // Assert.assertEquals("DORUK LE",homePage.dorukLE.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/sultan-lf/sultan-lf-shutterstock-2-452-370.jpg?ext=.jpg"));
        //Assert.assertEquals("SULTAN LF",homePage.sultanLF.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/sehir-ici/dizel/sultan-lf/sultan-lf-shutterstock-2-452-370.jpg?ext=.jpg"));
        // Assert.assertEquals("SULTAN CITY",homePage.sultanCity.getText());
        BaseTest.waitFor(2);

        actions.sendKeys(Keys.ARROW_UP).perform();
        actions.sendKeys(Keys.ARROW_UP).perform();
        actions.sendKeys(Keys.ARROW_UP).perform();
        BaseTest.waitFor(2);
        //  ReusableMethods.scrollIntoViewJS(otokarAnasayfa.turizmVeServis);

        BaseTest.clickByJS(homePage.turizmVeServis);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/doruk-t/doruk-t-shutterstock-452-370.jpg?ext=.jpg"));
        BaseTest.waitFor(2);
        // Assert.assertEquals("DORUK T",otokarAnasayfa.dorukT.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-giga/siltan-giga-2027643170-420x300-px.jpg?ext=.jpg"));
        // Assert.assertEquals("SULTAN GİGA",homePage.sultanGiga.getText());
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/elektrikli/sultan-mega/Sultan-Mega-shutterstock_1918448141_420x300-px.jpg?ext=.jpg"));
        // Assert.assertEquals("SULTAN MEGA",homePage.sultanMega.getText());

        //homePage.sliderButton1e4.click();
        BaseTest.clickByJS(homePage.sliderButton1e4);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/sultan-maxi/sultan-maxi-d.jpg?ext=.jpg"));
        // Assert.assertEquals("SULTAN MAXI",homePage.sultanMaxi.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-comfort/sultan-confort-420x300.jpg?ext=.jpg"));
        // Assert.assertEquals("SULTAN COMFORT",homePage.sultanComfort.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/kent-u/kent-u-turizm-servis-otobusu-1-420-300.jpg?ext=.jpg"));
        // Assert.assertEquals("KENT U",homePage.kentU2.getText());
        BaseTest.waitFor(2);

        homePage.sliderButton1e5.click();
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-comfort/sultan-confort-420x300.jpg?ext=.jpg"));
        //Assert.assertEquals("SULTAN COMFORT",homePage.sultanComfort2.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dizel/kent-u/kent-u-turizm-servis-otobusu-1-420-300.jpg?ext=.jpg"));
        //Assert.assertEquals("KENT U",homePage.kentU2.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/turizm-ve-servis/dogal-gazli/sultan-maxi-engelsiz/sultan-maxi-engelsiz.jpg?ext=.jpg"));
        // Assert.assertEquals("SULTAN MAXI ENGELSİZ",homePage.sultanMaxiEngelsiz.getText());

        BaseTest.clickByJS(homePage.ozelAraclar);
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/ozel-araclar/egm_420x330_dekupe.png?ext=.png"));
        BaseTest.waitFor(2);
        //Assert.assertEquals("Çevik Kuvvet Otobüsü",homePage.cevikKuvvetOtobusu.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/ozel-araclar/cte_dekupe_420x330.png?ext=.png"));
        // Assert.assertEquals("Tutuklu Nakil Aracı",homePage.tutukluNakilAraci.getText());
        Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/otobus/ozel-araclar/kizilay_dekupe_440x330.png?ext=.png"));
        // Assert.assertEquals("Gezici Sağlık Araçları",homePage.geziciSaglikAraci.getText());

        // actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
        actions.moveToElement(homePage.urunuIncele).perform();
        //Assert.assertTrue(BaseTest.driver.getPageSource().contains("/OtokarTicari/media/Otokar-Ticari/kamyon/Atlas-Kamyon-Banner-1440x700.jpg?ext=.jpg"));
        // ReusableMethods.waitFor(2);
        //Assert.assertEquals("ATLAS",Driver.getDriver().findElement(By.xpath("//*[.=\"ATLAS\"]")));
        //actions.moveToElement(BaseTest.driver.findElement(By.xpath("//*[@src=\"/OtokarTicari/media/Otokar-Ticari/blog/e-kent-c-nisan22-320x320-px.webp?ext=.webp\"]"))).perform();

        Assert.assertTrue(homePage.haberler.isDisplayed());
        homePage.haberler.click();
        // Assert.assertTrue(otokarAnasayfa.blog.isDisplayed());
        BaseTest.waitFor(2);
        homePage.blog.click();
        actions.moveToElement(homePage.musteriHattiDetayBilgi).perform();
        Assert.assertTrue(homePage.musteriHattiDetayBilgi.isDisplayed());
        actions.moveToElement(homePage.mobilUygulama).perform();
        Assert.assertTrue(homePage.mobilUygulama.isDisplayed());
        //  actions.moveToElement(otokarAnasayfa.otokarKurumsalButonu).perform();
        Assert.assertTrue(homePage.otokarKurumsalButonu.isDisplayed());
        Assert.assertTrue(homePage.musteriHatti.isDisplayed());
        Assert.assertTrue(homePage.facebookButonu.isDisplayed());
        Assert.assertTrue(homePage.twitterButonu.isDisplayed());
        Assert.assertTrue(homePage.linkedinButonu.isDisplayed());
        Assert.assertTrue(homePage.youtubeButonu.isDisplayed());
        Assert.assertTrue(homePage.kocButonu.isDisplayed());

        BaseTest.waitFor(2);
        actions.moveToElement(homePage.mikrobus).perform();
        BaseTest.clickByJS(homePage.mikrobus);
        Assert.assertTrue(homePage.centro.isDisplayed());
        Assert.assertTrue(homePage.eCentro.isDisplayed());

        BaseTest.clickByJS(homePage.otobus);
        Assert.assertTrue(homePage.sehirIci.isDisplayed());
        Assert.assertTrue(homePage.turizmVeServis1.isDisplayed());
        Assert.assertTrue(homePage.ozelAraclar1.isDisplayed());

        BaseTest.clickByJS(homePage.kamyon);
        Assert.assertTrue(homePage.atlas.isDisplayed());
        Assert.assertTrue(homePage.atlas3D.isDisplayed());
        Assert.assertTrue(homePage.yetkiliSaticilar.isDisplayed());
        Assert.assertTrue(homePage.servisBul.isDisplayed());



        BaseTest.driver.quit();

    }

    @Test(priority = 2)
    public void otokarFacebook() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(3);

        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(homePage.facebookButonu).perform();



        String ansayfaHandle= BaseTest.driver.getWindowHandle();


        BaseTest.clickByJS(homePage.facebookButonu);
        BaseTest.waitFor(3);
        String facebookbutonu = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles1 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles1) {
            if (!each.equals(facebookbutonu)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://www.facebook.com/OtokarTicariAraclar"));
        BaseTest.driver.quit();
    }

    @Test(priority = 3)
    public void otokarLinkedin() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(3);

        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(homePage.linkedinButonu).perform();

        HomePage.clickByJS(homePage.linkedinButonu);
        HomePage.waitFor(3);
        String linkedinbutonu = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(linkedinbutonu)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://www.linkedin.com/company/otokar/"));

        // Driver.getDriver().switchTo().window(linkedinbutonu);
        BaseTest.driver.quit();

    }

    @Test(priority = 4)
    public void otokarYoutube() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(3);

        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(homePage.youtubeButonu).perform();

        BaseTest.clickByJS(homePage.youtubeButonu);
        BaseTest.waitFor(3);
        String youtubebutonu = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(youtubebutonu)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://www.youtube.com/user/OtokarTr"));
        BaseTest.driver.quit();

    }

    @Test(priority = 5)
    public void otokarTwitter() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(3);

        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(homePage.twitterButonu).perform();

        BaseTest.clickByJS(homePage.twitterButonu);
        BaseTest.waitFor(3);
        String twitterbutonu = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(twitterbutonu)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        BaseTest.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://twitter.com/OtokarAS"));
        BaseTest.driver.quit();


    }

    @Test(priority = 6)
    public void otokarKoc() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(3);

        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(homePage.kocButonu).perform();
        BaseTest.clickByJS(homePage.kocButonu);
        BaseTest.waitFor(3);
        String kocbutonu = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(kocbutonu)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        //ReusableMethods.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://www.koc.com.tr/"));
        BaseTest.driver.quit();
    }

    @Test(priority = 7)
    public void otokarKurumsal() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(3);

        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(homePage.otokarKurumsalButonu).perform();

        BaseTest.clickByJS(homePage.otokarKurumsalButonu);
        BaseTest.waitFor(3);
        String otokarKurumsalbutonu = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(otokarKurumsalbutonu)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }
        // ReusableMethods.waitFor(2);
        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://www.otokar.com.tr/"));
        BaseTest.driver.quit();
    }
    @Test(priority = 7)
    public void otokarCerezAydinlatmaMetni() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(3);

        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(homePage.cerezAydinlatmametni).perform();

        BaseTest.clickByJS(homePage.cerezAydinlatmametni);
        BaseTest.waitFor(2);
        BaseTest.clickByJS(homePage.cerezIndirMetin);
        String otokarKurumsalbutonu = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(otokarKurumsalbutonu)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

       // Assert.assertTrue(BaseTest.driver.getCurrentUrl().
          //      contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/pdf/cerez-aydinlatma-metni_1.pdf"));
        BaseTest.driver.quit();
    }

    @Test(priority = 8)
    public void kisiselVerilerinKorunmasi() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(3);

        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(homePage.kisiselVeriler).perform();

        BaseTest.clickByJS(homePage.kisiselVeriler);
        BaseTest.waitFor(2);
        actions.moveToElement(homePage.kisiselVerilerIndir).perform();
        BaseTest.clickByJS(homePage.Indir);
        BaseTest.waitFor(2);
        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }

        Assert.assertTrue(BaseTest.driver.getCurrentUrl().
                contains("https://commercial.otokar.com.tr/OtokarTicari/media/Otokar-Ticari/kvk-dokumanlar/kisisel-verilerin-korunmasi-politikasi.pdf"));

    }


    @Test(priority = 9)
    public void veriSahibiFormu() {
        sayfayaGiris();
        BaseTest.waitFor(3);
        homePage.cookiesAccept.click();

        BaseTest.waitFor(3);

        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(homePage.kisiselVeriler).perform();

        BaseTest.clickByJS(homePage.kisiselVeriler);
        BaseTest.waitFor(2);
        actions.moveToElement(homePage.veriSahibiIndir).perform();
        BaseTest.clickByJS(homePage.Indir);
        BaseTest.waitFor(2);

        String pencere = BaseTest.driver.getWindowHandle();
        Set<String> allWindowHandles2 = BaseTest.driver.getWindowHandles();
        for (String each : allWindowHandles2) {
            if (!each.equals(pencere)){
                BaseTest.driver.switchTo().window(each);
                break;
            }
        }



    }
    @Test(priority = 10)
    public void aramaButonu() {
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
