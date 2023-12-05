package org.SeleniumProject.Pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PaginationTut
{
    private static WebDriver webDriver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://selectorshub.com/xpath-practice-page/");

        while (true)
        {
            if (webDriver.findElements(By.xpath("//table[@id='tablepress-1']//td[@class='column-5' and text()='India']")).size()>0)
            {
                webDriver.findElement(By.xpath("//table[@id='tablepress-1']//td[@class='column-5' and text()='India']/preceding-sibling::td/input[@type='checkbox']")).click();
                break;

            }
            else
            {
                webDriver.findElement(By.xpath("//a[text()='Next']")).click();
            }

        }


    }
}
