package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTut
{
    private static WebDriver webDriver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("http://www.londonfreelance.org/courses/frames/index.html");
        webDriver.switchTo().frame("main");
        System.out.println(webDriver.findElement(By.tagName("h2")).getText());
        webDriver.switchTo().defaultContent();


    }
}
