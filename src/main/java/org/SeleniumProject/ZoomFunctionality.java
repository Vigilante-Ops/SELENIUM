package org.SeleniumProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZoomFunctionality
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver","D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver=new ChromeDriver();
        webDriver.get("https://google.com");

        //document.body.style.zoom
        JavascriptExecutor js=(JavascriptExecutor) webDriver;
        js.executeScript("document.body.style.zoom='150%'");

    }
}
