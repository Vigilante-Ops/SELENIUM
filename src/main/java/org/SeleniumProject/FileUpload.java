package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload
{
    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver=new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(5000);
        webDriver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\amanv\\OneDrive\\Pictures\\Screenshots\\demo.png");
        webDriver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
    }
}
