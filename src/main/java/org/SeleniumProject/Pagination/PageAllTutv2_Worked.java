package org.SeleniumProject.Pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class PageAllTutv2_Worked
{

    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://selectorshub.com/xpath-practice-page/");
        String country="Denmark";
        List<WebElement> elements=webDriver.findElements(By.xpath("//td[text()='"+country+"']"));


        while (true)
        {
            if (elements.size()>0)
            {
                int i=0;
                while (i<elements.size())
                {
                    Thread.sleep(2000);
                    webDriver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(elements.get(i))).click();
                    Thread.sleep(2000);
                    i++;
                }
                if(!webDriver.findElement(By.xpath("//a[text()='Next']")).getAttribute("class").contains("disabled"))
                {
                    webDriver.findElement(By.xpath("//a[text()='Next']")).click();
                    Thread.sleep(4000);

                    elements=webDriver.findElements(By.xpath("//td[text()='"+country+"']"));
                }
                else
                {
                    break;
                }


            }
            else
            {
                if(!webDriver.findElement(By.xpath("//a[text()='Next']")).getAttribute("class").contains("disabled"))
                {
                    webDriver.findElement(By.xpath("//a[text()='Next']")).click();
                    Thread.sleep(4000);


                    elements=webDriver.findElements(By.xpath("//td[text()='"+country+"']"));


                }
                else
                {
                    break;
                }
            }

        }
    }
}
