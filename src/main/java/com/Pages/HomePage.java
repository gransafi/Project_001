package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends basePage{
    By headerName = By.xpath ("//h1[@class='heading']");

    public HomePage(WebDriver driver) {
        super (driver);
    }
    public String getTitleOfHomePage(){
        return driver.getTitle ();
    }
    public String  getHeaderNameOfHomePage(){
       return doseGetText (headerName);

    }

}
