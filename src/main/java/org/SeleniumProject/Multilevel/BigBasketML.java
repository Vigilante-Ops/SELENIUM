package org.SeleniumProject.Multilevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketML
{
    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new FirefoxDriver();
        webDriver.get("https://bigbasket.com");
        webDriver.manage().deleteAllCookies();
        Actions act=new Actions(webDriver);

        webDriver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bclm:']")).click();
        Thread.sleep(2000);
        act.moveToElement(webDriver.findElement(By.xpath("(//a[text()='Beverages'])[2]"))).perform();
        Thread.sleep(2000);
        act.moveToElement(webDriver.findElement(By.xpath("//a[text()='Tea']"))).perform();
        Thread.sleep(4000);
        act.moveToElement(webDriver.findElement(By.xpath("//a[text()='Leaf & Dust Tea']"))).click().perform();

        //press f8 for pause
        //40min


    }
}
