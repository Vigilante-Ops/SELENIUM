package org.SeleniumProject.Scroller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollerToSpecificElement
{
    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new FirefoxDriver();
        webDriver.get("https://amazon.in");
        Thread.sleep(4000);
        WebElement ele= webDriver.findElement(By.xpath("//h2[text()='Trending deals']"));

        JavascriptExecutor js=(JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView(true);",ele);
    }
}
