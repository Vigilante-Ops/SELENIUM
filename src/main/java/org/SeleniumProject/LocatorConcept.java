package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorConcept
{
    private static WebDriver wb;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
         wb=new ChromeDriver();
         wb.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        //By.Id is locator
        //wb.findElement(By.id("input-email"));
        //By.nane is locator
        //wb.findElement(By.name("email")).sendKeys("dixitaman8");
        //By.className is locator
       // wb.findElement(By.className("form-control")).sendKeys("dixitaman8");
        By email=By.xpath("//*[@id=\"input-email\"]");
        By password=By.xpath("//*[@id=\"input-password\"]");
        By submitButton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
        /*sendKeysC(email,"dixitaman8");
        sendKeysC(password,"adxt1999");
        clickMethod(submitButton);*/
        //By css=By.cssSelector("#input-email");
        //wb.findElement(By.linkText("Register")).click();
        //List<WebElement> tags= wb.findElements(By.tagName("a"));
        wb.findElement(By.tagName("h2")).getText();


    }

    public static WebElement getWebElement(By locator)
    {
        return wb.findElement(locator);
    }
    public static void sendKeysC(By locator,String keys)
    {
        getWebElement(locator).sendKeys(keys);
    }
    public static void clickMethod(By locator)
    {
        getWebElement(locator).click();
    }
}
