package com.PageTests;

import com.Pages.entryAd;
import org.testng.Assert;
import org.testng.annotations.Test;

public class entryAdTest extends baseTest{

    @Test(priority = 1)
    public void verifyEntryAdTest() {
        Assert.assertTrue (page.getInstance (entryAd.class).getEntryAd ());
    }
}
