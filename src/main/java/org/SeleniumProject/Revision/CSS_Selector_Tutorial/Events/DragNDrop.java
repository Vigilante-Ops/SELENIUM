package org.SeleniumProject.Revision.CSS_Selector_Tutorial.Events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement sourceElement= webDriver.findElement(By.xpath("(//div[@id='products']//a)[2]"));
        WebElement destinationElement=webDriver.findElement(By.xpath("//ol[@id='amt7']"));
        Actions actions=new Actions(webDriver);
        //actions.dragAndDrop(sourceElement,destinationElement).perform();
        actions.clickAndHold(sourceElement).moveToElement(destinationElement).release().perform();

    }


    }

