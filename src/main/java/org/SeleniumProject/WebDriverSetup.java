package org.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetup
{
    private static WebDriver webDriver;

    public static WebDriver setupChrome()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        return webDriver=new ChromeDriver();
    }
}
