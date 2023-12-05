package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorTut
{
    private static WebDriver webDriver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

        webDriver=new ChromeDriver();
       /* webDriver.get("https://www.hostinger.in/tutorials/best-programming-languages-to-learn");
        WebElement element=webDriver.findElement(By.xpath("//a[contains(text(),'C++')]"));
        String top= webDriver.findElement(RelativeLocator.with(By.tagName("li")).above(element)).getText();
        System.out.println(top);
        String bottom= webDriver.findElement(RelativeLocator.with(By.tagName("li")).below(element)).getText();
        System.out.println(bottom);*/


        /*webDriver.get("https://www.aqi.in/in/dashboard/india");
        WebElement element=webDriver.findElement(By.xpath("//a[text()='Assam']"));
        String above= webDriver.findElement(RelativeLocator.with(By.tagName("a")).above(element)).getText();
        System.out.println(above);
        String right= webDriver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(element)).getText();
        System.out.println(right);*/


        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        WebElement element=webDriver.findElement(By.xpath("//input[@id='input-email']"));
        String above=webDriver.findElement(RelativeLocator.with(By.tagName("label")).above(element)).getText();
        System.out.println(above);
        String below=webDriver.findElement(RelativeLocator.with(By.tagName("label")).below(element)).getText();
        System.out.println(below);




    }
}
