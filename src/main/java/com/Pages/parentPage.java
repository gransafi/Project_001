package com.Pages;
import org.openqa.selenium.WebDriver;

public class parentPage {
    // this is parent page all other pages are extended to parent page.
    public WebDriver driver;

    public parentPage(WebDriver driver) {
        this.driver = driver;
    }

    public <Tpage extends basePage> Tpage getInstance(Class<Tpage> tpageClass){
        try {
            return tpageClass.getDeclaredConstructor (WebDriver.class).newInstance (this.driver);
        } catch (Exception e){
            e.printStackTrace ();
        }
        return null;
    }
}
