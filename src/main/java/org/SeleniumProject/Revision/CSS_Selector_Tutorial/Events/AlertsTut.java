package org.SeleniumProject.Revision.CSS_Selector_Tutorial.Events;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class AlertsTut
{
    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
        webDriver.manage().window().maximize();

        //normal standard alert
       /*webDriver.findElement(By.xpath("//a[text()='See an example alert']")).click();
       Thread.sleep(5000);
        webDriver.switchTo().alert().accept();*/
        WebElement element= webDriver.findElement(By.xpath("//h2[@id='confirm']"));
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView();",element);


       WebElement samplelink= webDriver.findElement(By.linkText("See a sample confirm"));

        Actions actions=new Actions(webDriver);
        Thread.sleep(6000);
        actions.moveToElement(samplelink).click().perform();
        Thread.sleep(4000);
        webDriver.switchTo().alert().accept();







    }
}

