package utile;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;

public class BaseTest {


    public WebDriver driver, driver2; // driver = null
    private ExtentTest extentTest;
    private ScreenshotUtils screenshotUtils;

    @BeforeClass
    public void setupClass()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        screenshotUtils = new ScreenshotUtils(driver);
        driver.get("http://apptest.go.ro:9999/login");
    }

    @AfterClass
    public void tearDown()
    {
       // if(driver != null)
           // driver.quit(); // inchide browseru pt a nu se incarca memoria
    }

@AfterMethod
    public void afterMethod(ITestResult result)
    {
        if(result.getStatus() ==ITestResult.FAILURE)
        {
            captureAndSaveFailureScreenshot(result.getMethod().getMethodName());
        }
        if(result.getStatus() == ITestResult.FAILURE)
        {
            extentTest.log(Status.FAIL, MarkupHelper.createLabel("Test case Failed: " + result.getName(), ExtentColor.RED));
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS)
        {
            extentTest.log(Status.PASS, MarkupHelper.createLabel("Test case Passed: " + result.getName(), ExtentColor.GREEN));
        }
        else
        {
            extentTest.log(Status.SKIP, MarkupHelper.createLabel("Test case Skipped: " + result.getName(), ExtentColor.YELLOW));
        }
    }

    public void initTest(String testName)
    {
        extentTest = ReportManager.createTest(testName);
    }

    private void captureAndSaveFailureScreenshot(String testName)
    {
        //Facem un folder nou, daca nu exista
        File screenshotDirectory = new File("Screenshots");
        if(!screenshotDirectory.exists())
        {
            screenshotDirectory.mkdir();
        }

        System.out.println("New commit- example and practice, on new branch (2)");
 // capture and save screenshot

        screenshotUtils.captureAndSaveScreenshots(testName);
    }
}
