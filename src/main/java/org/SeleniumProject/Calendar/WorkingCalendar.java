package org.SeleniumProject.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Month;
import java.util.List;

public class WorkingCalendar
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver=new ChromeDriver();
        webDriver.get("https://jqueryui.com/datepicker/");
        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//iframe")));
        webDriver.findElement(By.xpath("(//input[@type='text'])")).click();

       int appYear=0;
       int searchYear=1995;

       //Below code handles year
       while (true)
       {
          appYear=Integer.parseInt(webDriver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText());
           if(searchYear>appYear)
           {
               //right
               webDriver.findElement(By.xpath("//span[text()='Next']")).click();

           }
           else if (searchYear<appYear)
           {
            //left
               webDriver.findElement(By.xpath("//span[text()='Prev']")).click();

           }
           else
           {
               break;
           }

       }





        //Below code for month
        String month="April";
        int appMonth= 0;
        int monthSearch=Month.valueOf(month.toUpperCase()).getValue();
        while (true)
        {
            appMonth=Month.valueOf((webDriver.
                    findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText()).toUpperCase()).getValue();
            if(monthSearch>appMonth)
            {
                //right
                webDriver.findElement(By.xpath("//span[text()='Next']")).click();

            }
            else if (monthSearch<appMonth)
            {
                //left
                webDriver.findElement(By.xpath("//span[text()='Prev']")).click();

            }
            else
            {
                break;
            }

        }



        //Below code for date

        int dateSearch=10;
        List<WebElement> dates= webDriver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td/a"));

        for (WebElement date:dates)
        {
            if (Integer.parseInt(date.getText())==dateSearch)
            {
                date.click();
                break;
            }
        }

    }
}
