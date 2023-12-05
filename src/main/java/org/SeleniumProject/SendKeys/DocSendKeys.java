package org.SeleniumProject.SendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DocSendKeys {
    private static WebDriver webDriver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        WebElement emailElement = webDriver.findElement(By.xpath("//input[@name='email']"));
        emailElement.sendKeys("DEMO");
        Actions act = new Actions(webDriver);
        act.keyDown(emailElement, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();//select all
        act.keyDown(emailElement, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();//copy
        WebElement searchElement = webDriver.findElement(By.xpath("//input[@name='search']"));
        act.keyDown(searchElement, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();//paste


    }
}
