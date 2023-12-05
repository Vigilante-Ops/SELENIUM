package TestNGTutorials;

import org.testng.annotations.Test;

public class InvocationCount
{
    @Test(invocationCount = 10)
    public void testMethod()
    {
        System.out.println("testmethod");
    }
}
