package DriverManager;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public Properties properties = new Properties();
    public InputStream inputStream;

    public BaseTest(){
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod(alwaysRun = true)
    public WebDriver setUpDriver() throws IOException {

        String propname = "config.properties";
        inputStream = getClass().getClassLoader().getResourceAsStream(propname);
        properties.load(inputStream);

        if (driver == null) {
            switch (properties.getProperty("browsername")) {
                case "chrome":
                    driver = new ChromeDriver();
                    driver.manage().deleteAllCookies();
                    driver.manage().window().maximize();
                    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    driver.manage().deleteAllCookies();
                    driver.manage().window().maximize();
                    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    driver.manage().deleteAllCookies();
                    driver.manage().window().maximize();
                    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    break;

                case "safari":
                    driver = new SafariDriver();
                    driver.manage().deleteAllCookies();
                    driver.manage().window().maximize();
                    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    break;
            }
        }
        return driver;
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    public void loadPage() {
        driver.get("https://defense.otokar.com.tr");
    }

    public void waitForVisibility(WebElement e) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void click(WebElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void type(WebElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }


}
