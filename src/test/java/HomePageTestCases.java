import DriverManager.BaseTest;
import Pages.HomePage;
import Pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.lang.reflect.Method;

public class HomePageTestCases extends BaseTest {

    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @BeforeMethod
    public void beforeTest(Method m) {
        System.out.println("\n" + "********** Starting Test: " + m.getName() + " **********" + "\n");
        homePage = new HomePage();
        searchResultsPage = new SearchResultsPage();
    }

    @Test
    public void firstTest() throws InterruptedException {
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
