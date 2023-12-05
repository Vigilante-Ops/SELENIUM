package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FetchFromFooter
{
    private static WebDriver wb;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        wb=new ChromeDriver();
        wb.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        WebElement w=wb.findElement(By.tagName("aside"));
        List<WebElement> elementList= w.findElements(By.tagName("a"));
       for (WebElement e:elementList)
       {
           System.out.println(e.getText());
       }

    }
}
