package org.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandleTut
{
    private static WebDriver webDriver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://google.com");
        String parent=webDriver.getWindowHandle();
        webDriver.switchTo().newWindow(WindowType.WINDOW);
        webDriver.get("https://yahoo.com");
        System.out.println(webDriver.getCurrentUrl());
        webDriver.close();
        webDriver.switchTo().window(parent);
        System.out.println(webDriver.getCurrentUrl());


    }
}
