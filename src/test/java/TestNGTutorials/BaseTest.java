package TestNGTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.URL;

public class BaseTest
{

    protected WebDriver webDriver;
    @BeforeTest
    @Parameters({"browserName"})
    public void initialize(String browserName) throws Exception {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
//            webDriver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),new ChromeOptions());
            webDriver=new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            webDriver=new FirefoxDriver();
        }
        else {
            throw new Exception("Browser invalid");
        }


    }

    @AfterTest
    public void QuitBrowser()
    {
        webDriver.quit();
    }

}
