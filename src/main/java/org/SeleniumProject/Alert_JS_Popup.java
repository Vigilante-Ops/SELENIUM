package org.SeleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Alert_JS_Popup
{
    private static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver=new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/javascript_alerts");


/*        webDriver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert a= webDriver.switchTo().alert();
        System.out.println(a.getText());
        Thread.sleep(3000);
        a.accept();*/

/*        webDriver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert a=webDriver.switchTo().alert();
        //a.accept();
        a.dismiss();*/


      /*  webDriver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert a=webDriver.switchTo().alert();
        a.sendKeys("lmaaaaaaao");
        a.accept();*/

    }
}
