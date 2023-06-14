package listeners;
import DriverManager.BaseTest;
import Reports.ExtentReport;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

import static Reports.ExtentReport.getTest;


public class TestListener implements ITestListener {
    public void onTestFailure(ITestResult result) {
        if (result.getThrowable() != null) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            result.getThrowable().printStackTrace(pw);
            System.out.println(sw.toString());
        }
        BaseTest base = new BaseTest();
        //File file = base.getDriver().getScreenshotAs(OutputType.FILE);
        File file = ((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.FILE);

        byte[] encoded = null;
        try {
            encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        HashMap<String, String> params = new HashMap<String, String>();
        params = (HashMap<String, String>) result.getTestContext().getCurrentXmlTest().getAllParameters();


        String imagePath = "Screenshots" + File.separator + params.get("platformName") + "_" + params.get("platformVersion")
                + "_" + params.get("deviceName") + File.separator + result.getTestClass().getRealClass().getSimpleName()
                + File.separator + result.getName() + ".png";

        String completeImagePath = System.getProperty("user.dir") + File.separator + imagePath;

        try {
            FileUtils.copyFile(file, new File(imagePath));
            Reporter.log("This is the screenshot of the failed test");
            Reporter.log("<a href='" + completeImagePath + "'> <img src='" + completeImagePath + "' height='800' width='400'/> </a>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        try {
//            ExtentReport.getTest().fail("Test Failed",
//                    MediaEntityBuilder.createScreenCaptureFromPath(completeImagePath).build());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        try {
            getTest().fail("Test Failed",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(new String(encoded, StandardCharsets.US_ASCII)).build());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        getTest().fail(result.getThrowable());
        //getTest().log(Status.FAIL, getTest().addScreenCaptureFromPath(completeImagePath) + " Test başarısız.");
    }

    @Override
    public void onTestStart(ITestResult result) {
        BaseTest base = new BaseTest();
        ExtentReport.startTest(result.getName(), result.getMethod().getDescription())
                .assignAuthor("Barış");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        getTest().log(Status.PASS, "Test başarılı.");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        getTest().log(Status.SKIP, "Test geçildi.");
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.getReporter().flush();
    }
}
