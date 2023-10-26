package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addRemovePage extends basePage {

    By addRemove = By.xpath ("//a[normalize-space()='Add/Remove Elements']");
    By header = By.xpath ("//h3[normalize-space()='Add/Remove Elements']");
    By Add = By.cssSelector ("button");
    By Remove = By.cssSelector (".added-manually");

    public addRemovePage(WebDriver driver) {
        super (driver);
    }
    public addRemovePage getAddRemoveLink(){
        doseClick (addRemove);
        return getInstance (addRemovePage.class);
    }
    public String validateHeaderOfAddRemovePage(){
        String text = doseGetText (header);
        return text;
    }
    public Object validateAddLink(){
        doseClick (Add);
        doseClick (Remove);
        return null;
    }


}
