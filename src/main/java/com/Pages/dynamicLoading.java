package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamicLoading extends basePage{

    By dynamicLoad = By.xpath ("//a[normalize-space()='Dynamic Loading']");
    By firstLind = By.linkText ("Example 1: Element on page that is hidden");
    By startButton = By.cssSelector ("button");
    By secondLink = By.linkText ("Example 2: Element rendered after the fact");
    By button2 = By.cssSelector ("button");
    public dynamicLoading(WebDriver driver) {
        super (driver);
    }

    public boolean getDynamicLoading() {
        doseClick (dynamicLoad);
        doseClick (firstLind);
        doseClick (startButton);
        driver.navigate ().back ();
        doseClick (secondLink);
        doseClick (button2);
        return true;
    }
}
