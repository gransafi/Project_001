package com.PageTests;

import com.Pages.dynamicLoading;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dynamicLoadingTest extends baseTest {

    @Test(priority = 1)
    public void verifyDynamicLoadingTest(){
      Assert.assertTrue ( page.getInstance (dynamicLoading.class).getDynamicLoading ());

    }
}
