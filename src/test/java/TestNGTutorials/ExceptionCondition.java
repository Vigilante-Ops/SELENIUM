package TestNGTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionCondition
{

    private static WebDriver webDriver;
    @Test(expectedExceptions =NoSuchElementException.class )
    public void virtualTest()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");

       webDriver=new ChromeDriver();
       webDriver.get("https://google.com");
       Boolean isGoogleImgDisplayed =webDriver.findElement(By.linkText("Aboutd")).isDisplayed();
        System.out.println(isGoogleImgDisplayed);
    }
}
