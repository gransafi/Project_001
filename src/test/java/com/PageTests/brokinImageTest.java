package com.PageTests;

import com.Pages.brokinImage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class brokinImageTest extends baseTest{

//    @Test(priority = 1)
//    public void validateBrokinImgText(){
//      String text =  page.getInstance (brokinImage.class).getbrokinImgText ();
//        System.out.println (text);
//        Assert.assertEquals (text,"Broken Images");
//    }
    @Test(priority = 2)
    public void validateBrokinImgLinkTest() {
       Assert.assertTrue ( page.getInstance (brokinImage.class).getBrokingImgLink ());


    }

}


