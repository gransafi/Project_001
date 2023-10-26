package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown extends basePage{
    By dropdown = By.xpath ("//a[normalize-space()='Dropdown']");
    public dropdown(WebDriver driver) {
        super (driver);
    }
    public boolean getDropDown(){
        doseClick (dropdown);
        Select select = new Select (driver.findElement (By.id ("dropdown")));
        select.selectByIndex (2);

        return true;
    }
}
