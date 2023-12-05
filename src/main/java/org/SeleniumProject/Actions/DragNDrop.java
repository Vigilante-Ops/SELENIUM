package org.SeleniumProject.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop
{
    private static WebDriver webDriver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
        WebElement elementToDrag= webDriver.findElement(By.xpath("//img[@id='drag1']"));
        WebElement location=webDriver.findElement(By.xpath("//div[@id='div2']"));

        Actions act=new Actions(webDriver);
        //act.clickAndHold(elementToDrag).moveToElement(location).release().build().perform();
        //always use build+perform or only perform
        act.dragAndDrop(elementToDrag,location).perform();
    }
}
