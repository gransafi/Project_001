package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkBox extends basePage{

    By header = By.xpath ("//h3[normalize-space()='Checkboxes']");
    By boxName = By.xpath ("//input[1]");
    By checkBoxLink = By.xpath ("//a[normalize-space()='Checkboxes']");
    public checkBox(WebDriver driver) {
        super (driver);
    }
    public String getHeader(){
       return doseGetText (header);
    }
    public void getCheckBoxLink(){
        doseClick (checkBoxLink);
        doseClick (boxName);
    }
}
