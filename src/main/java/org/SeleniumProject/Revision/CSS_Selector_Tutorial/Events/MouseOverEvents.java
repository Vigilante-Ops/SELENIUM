package org.SeleniumProject.Revision.CSS_Selector_Tutorial.Events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MouseOverEvents
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://www.spicejet.com/");
        webDriver.manage().window().maximize();
        //Actions actions=new Actions(webDriver);
        WebElement spiceClub=webDriver.findElement(By.xpath("//div[text()='SpiceClub']"));
        //actions.moveToElement(spiceClub).perform();
        //WebElement ProgressElement=webDriver.findElement(By.xpath("//div[text()='Our Program']"));
        //actions.moveToElement(ProgressElement).click().perform();
        /*WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Our Program']")));
      element.click();*/

        Actions act=new Actions(webDriver);
        act.moveToElement(spiceClub).perform();
    }
}
