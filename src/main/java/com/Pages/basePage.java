package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class basePage extends parentPage{

    public basePage(WebDriver driver) {
        super (driver);
    }

    public void doseClick(By locator){
        driver.findElement (locator).click ();

    }
    public void doseSendKey(By locator, String text){
        driver.findElement (locator).sendKeys (text);
    }
    public String doseGetText(By locator){
      return driver.findElement (locator).getText ();

    }
}
