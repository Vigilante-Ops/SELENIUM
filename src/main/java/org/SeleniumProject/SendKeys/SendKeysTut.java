package org.SeleniumProject.SendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysTut
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver=new ChromeDriver();
        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        WebElement email= webDriver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("dixitaman8@gmail.com");
        Actions act=new Actions(webDriver);
        act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        act.keyDown(email,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        WebElement search= webDriver.findElement(By.xpath("//input[@name='search']"));
        act.keyDown(search,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();







    }
}
