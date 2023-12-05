package org.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector
{
    private static WebDriver wb;
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\000Starting new\\Selenium\\chrome-win64\\chromedriver.exe");
        wb = new ChromeDriver();
        wb.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        //for id #id in css selector
        //more efficient input#input-firstname
        //wb.findElement(By.cssSelector("#input-firstname")).sendKeys("Aman");

        //for class in css selector .class
        //for tag and class  tag.class  or more classes->    input.form-control.form-control.private-form__control.login-email
    //input.form-control.private-form__control.login-email#username

        //multiple attributes input[id='username'][type='email']
        //input#username[type='email'][class='form-control private-form__control login-email']
        //input#username[type='email'].form-control
        //contains input[placeholder*='First']
        //input[placeholder*='First'][id*='input']

        //starts-with
        //input[id^='use']

        //ends with input[id$='ame']



        //parent to child traversal
        //.col-sm-10>div>label>input[type='radio']
        //> for direct and space for indirect
        //text() and child to parent traversal dont work


        //input#username,input#password,button#ssoBtn,button#loginBtn

        //input.form-control.private-form__control:not(#username,#password)

        //select.dropdown>option:last-child       find 1st n last
        //note if you remove option it will fetch direct to that select element


        //select.dropdown>option:nth-of-type(2)


        //label[for='input-email']+input          forward sibling
        //label[for='input-email']~div          all fwd sibling
    }
}
