package org.SeleniumProject.ShadowDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMTut
{
    private static WebDriver webDriver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://selectorshub.com/iframe-in-shadow-dom/");
        JavascriptExecutor js=(JavascriptExecutor) webDriver;
        WebElement element= (WebElement) js.
                executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
        element.sendKeys("hey");

    }
}
