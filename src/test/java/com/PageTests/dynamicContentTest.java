package com.PageTests;

import com.Pages.dynamicContent;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dynamicContentTest extends baseTest{
    @Test(priority = 1)
    public void verifyDynamicContentTest(){
       Assert.assertTrue (page.getInstance (dynamicContent.class).getDynamicContentLink ());

    }

}
