package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class entryAd extends basePage{

    By entryLink = By.xpath ("//a[normalize-space()='Entry Ad']");
    By textW = By.xpath ("//p[normalize-space()='Close']");


    public entryAd(WebDriver driver){
        super(driver);
    }

    public boolean getEntryAd() {
        doseClick (entryLink);
        try {
            driver.getWindowHandle ();
            WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds (10));
            WebElement until = wait.until (ExpectedConditions.presenceOfElementLocated ((textW)));
            until.click ();
        } catch (AssertionError e){
            e.getCause ();
        }
        return true;
    }
}
