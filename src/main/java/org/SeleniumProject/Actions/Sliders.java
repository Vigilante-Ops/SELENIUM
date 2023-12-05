package org.SeleniumProject.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders
{
    private static WebDriver webDriver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("https://jqueryui.com/slider/");
        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement slider= webDriver.findElement(By.xpath("//div[@id='slider']"));
        slider.click();
        Actions act=new Actions(webDriver);
        int x=slider.getSize().getWidth();
        int y=slider.getSize().getHeight();
        System.out.println(x);
        //act.moveToElement(slider,(x/2)-100,0).click().perform();



    }
}
