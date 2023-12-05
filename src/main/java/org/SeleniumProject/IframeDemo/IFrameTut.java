package org.SeleniumProject.IframeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTut
{
    private static WebDriver webDriver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://selectorshub.com/iframe-scenario/");
        WebElement frame1= webDriver.findElement(By.xpath("//iframe[@id='pact1']"));
        webDriver.switchTo().frame(frame1);
        webDriver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("A");
        webDriver.switchTo().defaultContent();
        //webDriver.switchTo().parentFrame();
        System.out.println(webDriver.findElement(By.xpath("//h3[text()='Memory Test']")).getText());
    }
}
