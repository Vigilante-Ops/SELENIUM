package TestNGTutorials;

import org.testng.annotations.*;

public class LoginPageTest
{

    @BeforeSuite
    public void DBConnection()
    {
        System.out.println("DBConnection");

    }

    @BeforeTest
    public void createUser()
    {
        System.out.println("createUser");

    }

    @BeforeClass
    public void launchBrowser()
    {
        System.out.println("launchBrowser");

    }
    @BeforeMethod
    public void typeURL()
    {
        System.out.println("typeURL");

    }

    @Test
    public void workTest0()
    {
        System.out.println("main Test 0");
    }
    @Test
    public void workTest1()
    {
        System.out.println("main Test 1");
    }
    @Test
    public void workTest2()
    {
        System.out.println("main Test 2");
    }

    @AfterMethod
    public void logout()
    {
        System.out.println("logout");

    }

    @AfterClass
    public void closeBrowser()
    {
        System.out.println("closeBrowser");

    }

    @AfterTest
    public void deleteUser()
    {
        System.out.println("deleteUser");

    }
    @AfterSuite
    public void dbClose()
    {
        System.out.println("dbClose");

    }


}
