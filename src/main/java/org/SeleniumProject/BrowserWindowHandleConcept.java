package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindowHandleConcept
{
    private static WebDriver webDriver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        //target="_blank"
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(6000);
        webDriver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

        //get windows ids
        Set<String> handles= webDriver.getWindowHandles();
        Iterator<String> it= handles.iterator();
        String parent= it.next();
        String linkedin=it.next();


        //switch windows
        webDriver.switchTo().window(linkedin);
        System.out.println(webDriver.getTitle());
        webDriver.close();
        webDriver.switchTo().window(parent);
        System.out.println(webDriver.getTitle());



    }
}
