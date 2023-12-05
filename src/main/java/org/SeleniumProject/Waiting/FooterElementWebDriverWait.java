package org.SeleniumProject.Waiting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FooterElementWebDriverWait
{
    private static WebDriver webDriver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://www.freshworks.com/");
        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(10));
        By footerlinks= By.xpath("//footer[@class='sc-6293d692-0 dBdSZt']//div[@class='sc-ace17a57-0 hFnGrz']/nav//a");
        List<WebElement> footer= wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footerlinks));
        System.out.println(footer.size());



    }
}
