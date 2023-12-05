package org.SeleniumProject.Waiting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FetchURL
{
    private static WebDriver webDriver;

    public static void main(String[] args)
    {


        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(10));
        System.out.println(wait.until(ExpectedConditions.urlContains("naveen")));

    }
}
