package com.PageTests;

import com.Pages.dropdown;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropdownTest extends baseTest{

    @Test(priority = 1)
    public void verifyDropDownTest(){
       Assert.assertTrue ( page.getInstance (dropdown.class).getDropDown ());

    }
}
