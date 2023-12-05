package org.SeleniumProject.Revision.CSS_Selector_Tutorial.Syncs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SyncronisationInSelenium
{
    private static WebDriver webDriver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        //implicit wait, eplicit wait and dynamic wait are all dynamic wait
        //Thread.sleep() static wait
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }
}
