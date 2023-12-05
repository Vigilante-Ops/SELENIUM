package org.SeleniumProject.BrowserWindowHandle;

import org.SeleniumProject.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class CaseTwo
{
    private static WebDriver driver;
     static String parent=null;
    public static void main(String[] args) throws InterruptedException {
         driver = WebDriverSetup.setupChrome();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         parent= driver.getWindowHandle();
        Thread.sleep(6000);
        By linkedin=By.xpath("//a[contains(@href,'linkedin')]");
        By facebook=By.xpath("//a[contains(@href,'facebook')]");
        By twitter=By.xpath("//a[contains(@href,'twitter')]");
        By youtube=By.xpath("//a[contains(@href,'youtube')]");
        driver.findElement(linkedin).click();
        handlePlusPlus();
        driver.findElement(facebook).click();
        handlePlusPlus();
        driver.findElement(twitter).click();
        handlePlusPlus();
        driver.findElement(youtube).click();
        handlePlusPlus();



    }

    private static void handlePlusPlus() throws InterruptedException {
        Thread.sleep(3000);
       Set<String> handles= driver.getWindowHandles();
       Iterator<String> its =handles.iterator();
       its.next();
       driver.switchTo().window(its.next());
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parent);

    }




}
