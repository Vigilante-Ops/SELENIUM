package org.SeleniumProject.BrowserWindowHandle;

import org.SeleniumProject.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class BrowserWindowHandleTut {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverSetup.setupChrome();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String parent= driver.getWindowHandle();
        Thread.sleep(4000);
        By linkedin=By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']");
        driver.findElement(linkedin).click();

        Set<String> handles= driver.getWindowHandles();
        Iterator<String> its= handles.iterator();

        its.next();
        String child=its.next();
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());












    }
}
