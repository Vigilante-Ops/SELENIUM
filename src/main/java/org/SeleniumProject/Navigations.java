package org.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations
{

    private static WebDriver webDriver=null;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");
//        webDriver.navigate().to("https://www.yahoo.in");
//        webDriver.navigate().back();
//        Thread.sleep(4000);
//        webDriver.navigate().forward();
         Thread.sleep(4000);
          webDriver.navigate().refresh();
    }
}
