package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;



public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public Properties properties = new Properties();
    public InputStream inputStream;

    public BaseTest() {
        PageFactory.initElements(driver, this);
    }

    @Parameters("browser")
    @BeforeMethod
    public WebDriver setUpDriver(String browser) throws IOException {

        String propname = "config.properties";
        inputStream = getClass().getClassLoader().getResourceAsStream(propname);
        properties.load(inputStream);

        if (driver == null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
            }
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;

    }

    @AfterMethod
    public void quitDriver() {
        driver.manage().deleteAllCookies();
         driver.quit();
        driver = null;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void loadPage() {
        driver.get(properties.getProperty("url"));
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

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }


}
