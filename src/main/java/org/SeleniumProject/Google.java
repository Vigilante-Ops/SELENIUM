package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Google
{
    private static WebDriver webDriver=null;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://www.google.com");

        //Approach 1
//        WebElement element= webDriver.findElement(By.id("SIvCob"));
//        List<WebElement> elementList =element.findElements(By.tagName("a"));
//        for (WebElement e: elementList)
//        {
//            System.out.println(e.getText());
//        }
        //Approach 2
//         List<WebElement> elementList= webDriver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//         for (WebElement e:elementList)
//         {
//             System.out.println(e.getText());
//         }

        //Footer links
        /*WebElement element= webDriver.findElement(By.xpath("//div[@jscontroller='NzU6V']"));
        List<WebElement> elms=element.findElements(By.tagName("a"));
        for (WebElement f:elms)
        {
            if (!f.getText().isBlank())
            System.out.println(f.getText());
        }*/
        webDriver.findElement(By.tagName("textarea")).sendKeys("naveen automation");
        Thread.sleep(4000);
        List<WebElement> dropdown=  webDriver.findElements(By.xpath("//div[@jsname='erkvQe']/div/ul/li"));

        for (WebElement els:dropdown)
        {
            System.out.println(els.getText());
        }
    }
}
