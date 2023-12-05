package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLocator
{
    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        /*InvalidSelectorException
        webDriver.findElement(By.xpath("input[@@id=''']"));*/

       /* NoSuchElementException
        webDriver.findElement(By.xpath("input[@id='aman']"));*/



    }
}
