package Pages;

import DriverManager.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchResultsPage extends BaseTest {

    @FindBy(xpath = "//input[contains(@value,'araç')]")
    WebElement searchFieldLct;
    @FindBy(css = ".short-info")
    WebElement resultNumberLct;
    @FindBy(css = ".btn.btn-general")
    WebElement showMoreLct;
    @FindBy(css = ".icon.icon-long-arrow-up")
    WebElement upBtnLct;
    @FindBy(css = ".section-title.no-bordered")
    WebElement borderText;



    public SearchResultsPage validatePageText(){
        String a = borderText.getText();
        Assert.assertEquals(a, "ARAMA SONUÇLARI");
        return this;
    }

    public SearchResultsPage validateURL() {
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String expected = "ara%C3%A7";
        Assert.assertTrue(URL.contains(expected));
        return this;
    }

    public SearchResultsPage isDisplayedTextEqualToSearchedText() {
        String a = searchFieldLct.getAttribute("value");
        Assert.assertEquals(a, "araç");

        String b = resultNumberLct.getText().trim();
        System.out.println(b);
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(b);

        if (matcher.find()) {
            int result = Integer.parseInt(matcher.group());
            Assert.assertEquals(result, 55);
            return this;
        }
        return null;
    }

    public SearchResultsPage validateTotalDisplayedItems() {
        List<WebElement> listItems = wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("a.list-link"), 55));
        Assert.assertEquals(listItems.size(), 55);
        return this;
    }

    public SearchResultsPage clickShowMoreButton() throws InterruptedException {
        click(showMoreLct);

        while (showMoreLct.isDisplayed()) {
            showMoreLct.click();
            scrollDown();
            Thread.sleep(1500);
        }
        validateTotalDisplayedItems();
        return this;
    }


    public SearchResultsPage clickUpButton() {
        //getting the current location focus on the page
        long beforeScrollPosition = (Long) ((JavascriptExecutor) driver).executeScript("return window.pageYOffset;");
        click(upBtnLct);
        //getting the current location but after pressing up button on the page, validating that it actually works
        long afterScrollPosition = ((Number) ((JavascriptExecutor) driver).executeScript("return window.pageYOffset;")).longValue();
        Assert.assertTrue(beforeScrollPosition > afterScrollPosition);
        return this;
    }


}
