package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowseMultiWindowTask
{
    private static WebDriver webDriver;
    private static String tomove="";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String parent=webDriver.getWindowHandle();
        Thread.sleep(4000);
        webDriver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
        Set<String> handle1=webDriver.getWindowHandles();
        Iterator<String> it1= handle1.iterator();
        it1.next();
        tomove=it1.next();
        webDriver.switchTo().window(tomove);
        System.out.println(webDriver.getCurrentUrl());
        webDriver.close();
        webDriver.switchTo().window(parent);
        System.out.println(webDriver.getCurrentUrl());

        webDriver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
        Set<String> handle2=webDriver.getWindowHandles();
        Iterator<String> it2= handle2.iterator();
        it2.next();
        tomove=it2.next();
        webDriver.switchTo().window(tomove);
        System.out.println(webDriver.getCurrentUrl());
        webDriver.close();
        webDriver.switchTo().window(parent);
        System.out.println(webDriver.getCurrentUrl());


       /* webDriver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        webDriver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();*/


    }
}
