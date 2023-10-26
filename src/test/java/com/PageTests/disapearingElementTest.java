package com.PageTests;

import com.Pages.disapearingElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class disapearingElementTest extends baseTest{

    @Test(priority = 1)
    public void verifyDisapearingElementTest(){

        Assert.assertTrue (page.getInstance (disapearingElement.class).getDisapearingElement ());
    }
}
