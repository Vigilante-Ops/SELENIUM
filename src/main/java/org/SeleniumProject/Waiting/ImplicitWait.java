package org.SeleniumProject.Waiting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait
{
    private static WebDriver webDriver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver=new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        webDriver.findElement(By.id("input-email")).sendKeys("dixitaman8");
        webDriver.findElement(By.id("input-password")).sendKeys("aman");

    }
}
