package org.SeleniumProject.Revision.CSS_Selector_Tutorial.Events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class MixImplicitExplicit
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        WebElement text=webDriver.findElement(By.xpath("//h2[text()='lmnop']"));
        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(20));

    }
}
