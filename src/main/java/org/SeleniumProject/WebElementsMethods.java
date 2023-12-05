package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class WebElementsMethods
{
    private static WebDriver wb;
    public static void main(String[] args) throws InterruptedException {
        wb=new FirefoxDriver();
        wb.get("https://google.com");
       // boolean isdisplay=wb.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).isDisplayed();
        //System.out.println(isdisplay);

        List<WebElement> elements=wb.findElements(By.tagName("a"));
        List<WebElement> imgs=wb.findElements(By.tagName("img"));
        List<WebElement> inputs=wb.findElements(By.tagName("input"));
        int count=0;
        for(WebElement wbs:inputs)
        {
            if(wbs.getAttribute("placeholder").length()>0)
            {
                count++;
            }
        }
        System.out.println(count);

/*        for(WebElement wbs:elements)
        {
            if (!wbs.getText().isBlank())
            {
                System.out.println(wbs.getText());


            }
        }*/


    }

}
