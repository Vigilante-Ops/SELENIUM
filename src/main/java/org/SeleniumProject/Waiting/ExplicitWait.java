package org.SeleniumProject.Waiting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait
{
    private static WebDriver webDriver;

    public static void main(String[] args)
    {


        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver=new ChromeDriver();
        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        By email=By.id("input-email");
        By password=By.id("input-password");

        getWaitedElement(email,10).sendKeys("dixitaman8");
        getElement(password).sendKeys("adct");


    }

    public static WebElement getElement(By locator)
    {
            return webDriver.findElement(locator);
    }
    public static WebElement getWaitedElement(By locator,int timeOut)
    {
        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public static WebElement getWaitedVisibilityElement(By locator,int timeOut)
    {
        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
