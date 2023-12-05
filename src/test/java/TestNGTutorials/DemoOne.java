package TestNGTutorials;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoOne
{
    @BeforeTest
    public void pre()
    {
        System.out.println("before test");
    }

    @Test
    public void current()
    {
        String actual="Aman";
        String expected="Aman";
        Assert.assertEquals(actual,expected);
    }

    @AfterTest
    public void post()
    {
        System.out.println("after test");
    }
}
