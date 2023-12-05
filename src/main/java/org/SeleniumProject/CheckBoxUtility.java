package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxUtility
{
    private static WebDriver wb;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        wb=new ChromeDriver();
        wb.get("https://classic.freecrm.com/");
        wb.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("aman99");
        wb.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("adxt1999");
        wb.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Keys.ENTER);
        wb.switchTo().frame("mainpanel");
        wb.findElement(By.xpath("//a[@title='Contacts']")).click();
        knowCompanyName("Ayush Agarwal");

        //IMPORTANT driver.linktext() accept exact text diaplayed not in DOM one.

    }

    private static void clickOnCheckBox(String name)
    {
      wb.findElement(By.xpath("//a[contains(text(),'"+name+"')]/../preceding-sibling::td/input[@type='checkbox']")).click();
    }
    private static void knowCompanyName(String name)
    {
        System.out.println(wb.findElement(By.xpath("//a[contains(text(),'"+name+"')]/../following-sibling::td/a")).getText());

    }
}
