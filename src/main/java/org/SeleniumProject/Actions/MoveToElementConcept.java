package org.SeleniumProject.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class MoveToElementConcept
{
    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://www.amazon.in/");
        WebElement element= webDriver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
        Actions act=new Actions(webDriver);
        act.moveToElement(element).build().perform();
        Thread.sleep(4000);
        webDriver.findElement(By.xpath("//span[text()='తెలుగు']")).click();
    }
}
