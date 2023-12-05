package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SVGElements
{
    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://petdiseasealerts.org/forecast-map#/");
        //   //*[local-name()='svg' and @id='map-svg']/*[name()='g']/*[name()='g']
        //  //*[local-name()='svg' and @id='map-svg']/*[name()='g']/*[name()='g']/*[name()='g']

       /* Thread.sleep(5000);
        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
        List<WebElement> elementList=webDriver.
                findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']/*[name()='g']/*[name()='g']/*[name()='g']"));
        System.out.println(elementList.size());
        for(WebElement element:elementList)
        {
            System.out.println(element.getAttribute("id"));
        }*/
        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
        String xpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']/*[name()='g']";
        Thread.sleep(4000);
        Actions actions=new Actions(webDriver);


        List<WebElement> elementList=
                webDriver.findElements(By.xpath(xpath));
        for(WebElement web:elementList)
        {
            if(web.getAttribute("id").equalsIgnoreCase("florida"))
            {
               int x=  web.getSize().getWidth();
               int y=web.getSize().getHeight();
                System.out.println(x+"::"+y);
                actions.moveToElement(web,(x/2)-40,0).click().perform();
                break;
            }
        }


    }

    }
