package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HeadLessBrowser
{
    private static WebDriver webDriver=null;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
       // co.addArguments("headless");
       co.addArguments("incognito");
        System.setProperty("webdriver.chrome.driver","D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver(co);
        webDriver.get("https://www.google.com");
        webDriver.findElement(By.tagName("textarea")).sendKeys("naveen automation");
        Thread.sleep(4000);
        List<WebElement> dropdown=  webDriver.findElements(By.xpath("//div[@jsname='erkvQe']/div/ul/li"));

        for (WebElement els:dropdown)
        {
            System.out.println(els.getText());
        }
    }
}
