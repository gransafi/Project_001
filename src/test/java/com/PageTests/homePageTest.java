package com.PageTests;


import com.Pages.HomePage;
import com.Pages.addRemovePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homePageTest extends baseTest{

    @Test(priority = 1)
    public void verifyTitleOfHomePageTest(){
        String title = page.getInstance (HomePage.class).getTitleOfHomePage ();
        System.out.println (title);
        Assert.assertEquals (title,"The Internet");
    }
    @Test(priority = 2)
    public void verifyHeaderOfHomePageTest(){
     String headerN = page.getInstance (HomePage.class).getHeaderNameOfHomePage ();
        System.out.println (headerN);
        Assert.assertEquals (headerN,"Welcome to the-internet");
    }



}
