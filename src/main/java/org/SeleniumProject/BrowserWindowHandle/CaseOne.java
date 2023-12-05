package org.SeleniumProject.BrowserWindowHandle;

import org.SeleniumProject.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CaseOne
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverSetup.setupChrome();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String parent= driver.getWindowHandle();
        Thread.sleep(6000);
        By linkedin=By.xpath("//a[contains(@href,'linkedin')]");
        By facebook=By.xpath("//a[contains(@href,'facebook')]");
        By twitter=By.xpath("//a[contains(@href,'twitter')]");
        By youtube=By.xpath("//a[contains(@href,'youtube')]");
        driver.findElement(linkedin).click();
        driver.findElement(facebook).click();
        driver.findElement(twitter).click();
        driver.findElement(youtube).click();

        Set<String> handles= driver.getWindowHandles();
        List<String> windowIdList=new ArrayList<>(handles);
        System.out.println(windowIdList.size());
        for(String windowId:windowIdList)
        {

            if (windowId.equalsIgnoreCase(parent))
            {

                System.out.println(driver.getTitle());
            }
            else
            {
                driver.switchTo().window(windowId);
                System.out.println(driver.getTitle());
                Thread.sleep(3000);
                driver.close();
            }

        }
        driver.quit();
    }
}
