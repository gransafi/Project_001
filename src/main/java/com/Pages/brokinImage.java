package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class brokinImage extends basePage {
//    By borkinImgText = By.xpath ("//h3[text()='Broken Images']");
//    By borkinImg = By.xpath ("//a[normalize-space()='Broken Images']");

    public brokinImage(WebDriver driver) {
        super (driver);
    }

//    public String getbrokinImgText() {
//        return doseGetText (borkinImgText);
//    }

    public boolean getBrokingImgLink() {
      driver.findElement (By.xpath ("//a[normalize-space()='Broken Images']")).click ();

        List<WebElement> list = driver.findElements (By.tagName ("img"));
        for (WebElement imgList:list){
            String imgsrc = imgList.getAttribute ("src");
            System.out.println (imgsrc);
            try {
                URL url = new URL (imgsrc);
                URLConnection urlConnection = url.openConnection ();
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setConnectTimeout (5000);
                urlConnection.connect ();
                if (httpURLConnection.getResponseCode ()==200){
                    System.out.println (imgsrc+":::::"+httpURLConnection.getResponseCode ()+":::"+ httpURLConnection.getResponseMessage ());
                } else {
                    System.err.println (imgsrc+":::::"+httpURLConnection.getResponseCode ()+":::"+ httpURLConnection.getResponseMessage ());
                }
            } catch (Exception e){
                System.err.println (imgsrc);
            }

        }


        return true;
    }

}
