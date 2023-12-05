package TestNGTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo
{
    private static WebDriver webDriver;

    @BeforeTest
    public void initialize()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
    }

    public void doLogin(String firstName,String lastName)
    {
        webDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        webDriver.findElement(By.xpath("//input[@name='email']")).sendKeys(firstName);
        webDriver.findElement(By.xpath("//input[@name='password']")).sendKeys(lastName);
        webDriver.findElement(By.xpath("//input[@type='submit']")).click();

    }
    @Test(dataProvider = "inputDataProvider")
    public void LoginTest(String firstName,String lastName,String designation)
    {
        System.out.println(firstName+" "+lastName+" "+designation);
    }

    @DataProvider
    public Object[][] inputDataProvider()
    {
         return new Object[][]{
                 {"dixitaman8@gmail.com","aman","desg1"},
                 {"gpdiicc","gpdixit","desg2"}
         };
    }
}
