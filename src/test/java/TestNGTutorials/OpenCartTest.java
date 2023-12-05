package TestNGTutorials;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest
{

    @Test
    @Parameters({"url"})
    public void doLogin(String url)
    {

        webDriver.get(url);
        System.out.println(webDriver.getTitle());

    }
}
