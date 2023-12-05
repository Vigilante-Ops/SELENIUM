package org.SeleniumProject.Revision.CSS_Selector_Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementTut
{
    private static WebDriver webDriver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://google.com/");
        WebElement element= webDriver.findElement(By.xpath("//img[@class='lnXdpd']"));
        System.out.println(element.getSize());
        webDriver.get("https://yahoo.com/");
        webDriver.navigate().back();
        System.out.println(element.getSize());








    }
}
