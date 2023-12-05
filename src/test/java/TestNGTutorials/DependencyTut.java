package TestNGTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyTut
{
    @Test
    public void test_A()
    {
        System.out.println("A");
    }
    @Test(dependsOnMethods = "test_A")
    public void test_B()
    {
        System.out.println("B");
    }
    @Test(dependsOnMethods = "test_B")
    public void test_C()
    {
        System.out.println("C");
    }
}
