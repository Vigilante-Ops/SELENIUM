package org.SeleniumProject.Pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;
/*  for (WebElement e:elements)
     {
       WebElement singleElement=  webDriver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(e));
       singleElement.click();

         Thread.sleep(2000);
     }*/
public class PaginationAllTut
{
    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://selectorshub.com/xpath-practice-page/");
        Thread.sleep(3000);
        List<WebElement> elements=webDriver.findElements(By.xpath("//td[text()='Denmark']"));

        int i=0;
        int size=elements.size();
        while (i<size || !webDriver.findElement(By.xpath("//a[text()='Next']")).getAttribute("class").contains("disabled"))
        {
            System.out.println(elements.get(i).getText());
            webDriver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(elements.get(i))).click();
            i++;
            Thread.sleep(2000);
            if(i==size &&
                    !webDriver.findElement(By.xpath("//a[text()='Next']")).getAttribute("class").contains("disabled"))
            {
                webDriver.findElement(By.xpath("//a[text()='Next']")).click();
                Thread.sleep(4000);
                elements=webDriver.findElements(By.xpath("//td[text()='Denmark']"));
                size=elements.size();
                i=0;
            }

        }

    }
}
