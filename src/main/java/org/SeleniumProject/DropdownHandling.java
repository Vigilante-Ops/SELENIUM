package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandling
{
    private static WebDriver webDriver=null;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://www.orangehrm.com/en/contact-sales/");
        WebElement element= webDriver.findElement(By.id("Form_getForm_Country"));
        //Select select=new Select(element);
        //select.selectByIndex(5);
       // select.selectByValue("Argentina");
        //select.selectByVisibleText("Argentina");
       /* List<WebElement> options= select.getOptions();
        for (WebElement o:options)
        {
            System.out.println(o.getText());
        }*/

        System.out.println(element.findElements(By.tagName("option")).size());

    }
}
