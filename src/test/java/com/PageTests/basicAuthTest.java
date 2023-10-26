package com.PageTests;

import com.Pages.basicAuth;
import org.testng.annotations.Test;

public class basicAuthTest extends baseTest{

    @Test(priority = 1)
    public void verifyAuthLinkTest(){
        page.getInstance (basicAuth.class).validateAuthLink ();

    }

}
