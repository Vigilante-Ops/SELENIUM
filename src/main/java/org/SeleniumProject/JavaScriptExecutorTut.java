package org.SeleniumProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTut
{
    private static WebDriver webDriver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://amazon.in");
        JavascriptExecutor js =(JavascriptExecutor) webDriver;
        String script="window.scrollTo(0,document.body.scrollHeight)";
        js.executeScript(script);
    }
}
