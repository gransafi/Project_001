package com.Pages;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class disapearingElement extends basePage{

    By disapear = By.xpath ("//a[normalize-space()='Disappearing Elements']");
    public disapearingElement(WebDriver driver) {
        super (driver);
    }
    public boolean getDisapearingElement(){
        doseClick (disapear);
        List<WebElement> list = driver.findElements (By.tagName ("a"));
        list.size ();
        System.out.println (list.size ());
        for (WebElement element:list){
            String src = element.getAttribute ("href");
            System.out.println (src);

            try {
                URL url = new URL (src);
                URLConnection urlConnection = url.openConnection ();
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setConnectTimeout (4000);
                urlConnection.connect ();
                if (httpURLConnection.getResponseCode () == 200) {
                    System.out.println (src + ":::" + httpURLConnection.getResponseCode () + ":::" + httpURLConnection.getResponseMessage ());
                } else {
                    System.out.println (src + ":::" + httpURLConnection.getResponseCode () + ":::" + httpURLConnection.getResponseMessage ());
                }
            } catch (Exception e){
                System.err.println (src);
            }

        }
return true;
    }
}
