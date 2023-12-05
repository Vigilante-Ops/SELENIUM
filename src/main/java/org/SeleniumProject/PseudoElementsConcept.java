package org.SeleniumProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementsConcept
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver=new ChromeDriver();
        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        JavascriptExecutor js=(JavascriptExecutor) webDriver;
        String script="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
        // String script="a=1; b=2; return(a+b);";
        String content= js.executeScript(script).toString();
        System.out.println(content);

    }
}
