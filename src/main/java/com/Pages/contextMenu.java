package com.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class contextMenu extends basePage{
    By contextM = By.xpath ("//a[normalize-space()='Context Menu']");
    public contextMenu(WebDriver driver) {
        super (driver);
    }
    public void getContextMenuLink(){
        doseClick (contextM);
        Actions actions = new Actions (driver);
        WebElement element = driver.findElement (By.id ("hot-spot"));
        actions.contextClick (element).build ().perform ();
        Alert alert = driver.switchTo ().alert ();
        System.out.println (alert.getText ());
        alert.accept ();
    }
}
