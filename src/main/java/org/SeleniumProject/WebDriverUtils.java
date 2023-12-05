package org.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtils
{
    private WebDriver webDriver=null;
    public WebDriver initWebDriver(String browserName)
    {

        switch (browserName.toLowerCase())
        {
            case "chrome":
                System.setProperty("webdriver.chrome.driver","D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
                webDriver=new ChromeDriver();
                break;
            case "firefox":
                webDriver=new FirefoxDriver();
                break;
            case "edge":
                webDriver=new EdgeDriver();
                break;

            default:
                System.out.println("ERROR");
                break;

        }
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        return webDriver;
    }

    public void launchUrl(String url)
    {
        if (url==null)
        {
            System.out.println("URL is null");
        }
        if (url.indexOf("https")==0)
        {
            webDriver.get(url);
        }
    }

    public String getTitle()
    {
        return webDriver.getTitle();
    }
    public String getURL()
    {
        return webDriver.getCurrentUrl();
    }
    public void closeBrowser()
    {
        if (webDriver!=null)
        {
            webDriver.close();
        }
    }
}
