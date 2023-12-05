package org.SeleniumProject;

import org.openqa.selenium.WebDriver;

public class QuitvsClose
{
    public static void main(String[] args) {
        WebDriverUtils utils=new WebDriverUtils();
        WebDriver webDriver= utils.initWebDriver("chrome");

        webDriver.get("https://www.google.in/");
        webDriver.close();

        webDriver=utils.initWebDriver("chrome");
        webDriver.get("https://www.google.in/");
        System.out.println(webDriver.getTitle());

        //System.out.println(webDriver.getTitle());
        //webDriver.manage().window().fullscreen();
        //webDriver.manage().deleteAllCookies();
        // System.out.println(webDriver.getCurrentUrl());
        //System.out.println(webDriver.getPageSource());

    }
}
