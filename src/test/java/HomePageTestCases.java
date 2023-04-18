import DriverManager.BaseTest;
import Pages.HomePage;
import Pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class HomePageTestCases extends BaseTest {

    HomePage homePage;
    SearchResultsPage searchResultsPage;


    @BeforeMethod
    public void beforeMethod(Method m) {
        System.out.println("\n" + "********** Starting Test: " + m.getName() + " **********" + "\n");
        homePage = new HomePage();
        searchResultsPage = new SearchResultsPage();
    }

    @Test(priority = 1)
    public void validateHomePage(){

        loadPage();
        homePage.
                acceptCookies().
                clickArma().
                clickTulpar().
                clickHaberler().
                clickHamburgerBtn().
                clicktekerlekliZirhliAraclar();
    }

    @Test(priority = 2)
    public void validateSearchAndResultPages() throws InterruptedException {
        loadPage();
        homePage.
                acceptCookies();
        Assert.assertEquals(driver.getTitle(), properties.getProperty("title"));
        homePage.search("araç");

        searchResultsPage.
                validatePageText().
                validateURL().
                isDisplayedTextEqualToSearchedText().
                clickShowMoreButton().
                clickUpButton();
    }
}
