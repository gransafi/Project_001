package com.Pages;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop extends basePage{
    By dragDrop = By.xpath ("//a[normalize-space()='Drag and Drop']");
    public dragAndDrop(WebDriver driver) {
        super (driver);
    }
    public void getDragAndDrop(){
        doseClick (dragDrop);
        Actions actions = new Actions (driver);
        WebElement surceElement = driver.findElement (By.xpath ("//div[@id='column-a']"));
        WebElement targetElement = driver.findElement (By.xpath ("//div[@id='column-b']"));
        actions.clickAndHold (surceElement)
                .moveToElement (targetElement)
                .release ()
                .build ()
                .perform ();

    }
}
