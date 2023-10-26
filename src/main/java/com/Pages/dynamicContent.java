package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamicContent extends basePage{
    By dynamicContent = By.xpath ("//a[normalize-space()='Dynamic Content']");
    By dynamicName = By.xpath ("//div[@id='content']/div[3]");
    public dynamicContent(WebDriver driver) {
        super (driver);
    }

    public boolean getDynamicContentLink(){
        doseClick (dynamicContent);
        doseGetText (dynamicName);
        System.out.println (doseGetText (dynamicName));
        return true;
    }
}
