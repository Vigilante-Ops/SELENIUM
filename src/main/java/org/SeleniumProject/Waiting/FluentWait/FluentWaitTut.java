package org.SeleniumProject.Waiting.FluentWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitTut
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver=new ChromeDriver();
        webDriver.get("https://google.com");

        Wait<WebDriver> wait=new FluentWait<WebDriver>(webDriver).pollingEvery(Duration.ofSeconds(3))
                .withMessage("The element is not found");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//textarea)[1]"))).sendKeys("hi");


    }
}
