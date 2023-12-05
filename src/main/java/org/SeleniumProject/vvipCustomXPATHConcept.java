package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vvipCustomXPATHConcept
{

    private static WebDriver webDriver=null;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://facebook.com");
        //webDriver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("mac");
    //h2[text()='Returning Customer']
      //  webDriver.findElement(By.xpath("//h2[@class='_8eso' and text()='Facebook helps you connect and share with the people in your life.']"))
    //a[@href]
        //tag[contains(@attr,'val')]
        //tag[contains(text(),'val')]
        //a[starts-with(text(),'Amazon')]

            //indexing-capture group
        //(//input[@class='form-control'])[2]   or (//input[@class='form-control'])[position()=2]
        //(//input[@class='form-control'])[last()]       use last to point to last element from list
        //(((//div[contains(@class,'navFooterLinkCol')])[last()])//li)[last()]
        //If using className always use single class
        //If using class without contains or startwith provide all classes exactly
        //If using class with contains or startwith you can use single class also
        /*webDriver.
                findElement(By.xpath("(((//div[contains(@class,'navFooterLinkCol')])[last()])//li)[last()]/a")).
                click();*/
        //Traversing from child->parent->grand parents  //input[@id='input-email']/../..

        ////input[@id='input-email']/preceding-sibling::label
        //label[@for='input-email']/following-sibling::input
        webDriver.findElement(By.xpath("//div[@class='_6ltj']")).click();
        //a[contains(text(),'Ayush Agarwal')]/../preceding-sibling::td/input[@type='checkbox']
        //(//a[contains(text(),'Ayush Agarwal')]/../following-sibling::td)[last()-1]
    }
}
