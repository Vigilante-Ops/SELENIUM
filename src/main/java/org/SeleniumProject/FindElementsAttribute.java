package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class FindElementsAttribute
{
    private static WebDriver wb;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        wb=new ChromeDriver();
        wb.get("https://classic.crmpro.com/");
        List<WebElement> elements=wb.findElements(By.tagName("p"));
        for (WebElement w:elements)
        {
            System.out.println(w.getText());
        }
    }
}
