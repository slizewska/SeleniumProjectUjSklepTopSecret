package selenium.test.project.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import selenium.test.project.Utils.CustomPath;
import selenium.test.project.Utils.CustomScreenshot;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    protected static WebDriver driver;

    protected static CustomScreenshot customScreenshot;

    @BeforeSuite
    public void setUpSuite() {

        customScreenshot = new CustomScreenshot();

        System.setProperty("webdriver.gecko.driver",
                new CustomPath().getResourcesPath("geckodriver.exe"));

        driver = new FirefoxDriver();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://www.topsecret.pl/pl-PL/zaloguj");
    }

    @AfterMethod
    public void tearDownMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            customScreenshot.makeScreenshot(
                    driver,
                    new Date().getTime() + "_" + result.getMethod().getMethodName()
            );
        }
    }

    //Shutdown of browser
    @AfterSuite
    public void tearDownSuite() {
        driver.quit();
    }
}
