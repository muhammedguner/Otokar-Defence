import DriverManager.BaseTest;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class HomePageTestCases extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void beforeTest(Method m) {
        System.out.println("\n" + "********** starting test: " + m.getName() + " **********" + "\n");
        homePage = new HomePage();
    }

    @Test
    public void firstTest() {
        loadPage();
        homePage.
                acceptCookies();
        Assert.assertEquals(driver.getTitle(),"Ana Sayfa | Otokar");

    }
}
