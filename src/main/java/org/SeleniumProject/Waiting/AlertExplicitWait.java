package org.SeleniumProject.Waiting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertExplicitWait
{
    private static WebDriver webDriver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/javascript_alerts");
       webDriver.findElement(By.xpath("(//button)[1]")).click();

        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(10));
        Alert a= wait.until(ExpectedConditions.alertIsPresent());
        a.accept();



    }
}
