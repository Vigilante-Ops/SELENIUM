package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowseMultipleWindowHandle
{
    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String parent=webDriver.getWindowHandle();
        Thread.sleep(6000);
        webDriver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
        webDriver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
        webDriver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        webDriver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();


        //get windowHandles
        Set<String> handles= webDriver.getWindowHandles();
        Iterator<String> its= handles.iterator();
        while (its.hasNext())
        {
            String window=its.next();
            webDriver.switchTo().window(window);
            System.out.println(webDriver.getCurrentUrl());
            webDriver.close();
            if(!window.equalsIgnoreCase(parent))
            {
                webDriver.close();
            }
        }

    }
}
