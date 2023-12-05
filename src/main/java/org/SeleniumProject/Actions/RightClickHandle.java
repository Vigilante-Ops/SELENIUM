package org.SeleniumProject.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle
{
    private static WebDriver webDriver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement element= webDriver.findElement(By.xpath("//span[contains(text(),'right')]"));
        Actions act=new Actions(webDriver);
        act.contextClick(element).perform();
        //REMEMBER RIGHT CLICK N CONTEXT CLICK IS SAME.
    }
}
