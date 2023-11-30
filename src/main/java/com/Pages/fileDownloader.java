package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fileDownloader extends basePage{

    public fileDownloader(WebDriver driver) {
        super (driver);
    }
    By fileN = By.xpath ("//a[normalize-space()='File Download']");
    By fileLink = By.xpath ("//a[normalize-space()='Selenium.docx']");

    public Boolean getFileDownloader(){
        doseClick (fileN);
        doseClick (fileLink);
       return true;
    }
}
