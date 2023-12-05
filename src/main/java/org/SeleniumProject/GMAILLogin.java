package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GMAILLogin
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setExperimentalOption("useAutomationExtension",false);
        webDriver=new ChromeDriver(chromeOptions);
        webDriver.get("https://gmail.com");
        WebElement email= webDriver.findElement(By.cssSelector("input[type='email']"));
        email.click();
        email.sendKeys("homiesdixit");
        email.sendKeys(Keys.ENTER);
    }
}
