package org.SeleniumProject.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickNSenkeys
{
    private static WebDriver webDriver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        WebElement fname= webDriver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        Actions sct=new Actions(webDriver);
        sct.sendKeys(fname,"Aman").perform();
    }
}
