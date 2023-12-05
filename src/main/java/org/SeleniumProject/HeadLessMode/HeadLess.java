package org.SeleniumProject.HeadLessMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        //headless
/*        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        webDriver=new ChromeDriver(options);
        webDriver.get("https://google.com");
        System.out.println(webDriver.getTitle());*/


        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        webDriver=new ChromeDriver(options);
        webDriver.get("https://google.com");




    }
}
