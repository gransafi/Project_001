package com.PageTests;

import com.Pages.checkBox;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkBoxTest extends baseTest{

    @Test(priority = 1)
    public void verifyCheckBoxLinkTest(){
        page.getInstance (checkBox.class).getCheckBoxLink ();
        String hb = page.getInstance (checkBox.class).getHeader ();
        Assert.assertEquals (hb,"Checkboxes");
    }
}
