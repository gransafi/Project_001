package com.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class basicAuth extends basePage{

    By Auth = By.xpath ("//a[normalize-space()='Basic Auth']");
    By textN = By.xpath ("//p[contains(text(),'Congratulations! You must have the proper credenti')]");
    public basicAuth(WebDriver driver) {
        super (driver);
    }

    public void validateAuthLink(){
        doseClick (Auth);
//        we have to give user and password after'https://' to get access to the page.
        driver.get ("https://admin:admin@the-internet.herokuapp.com/basic_auth");
       String text = doseGetText (textN);
        System.out.println (text);

    }
}

