package TestNGTutorials;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest
{


    @Test
    @Parameters({"url"})
    public void OpenGoogle(String url) throws InterruptedException {
        webDriver.get(url);
        System.out.println(webDriver.getTitle());
        Assert.fail();



    }
}
