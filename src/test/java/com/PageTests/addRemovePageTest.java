package com.PageTests;
import com.Pages.addRemovePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addRemovePageTest extends baseTest{

    @Test(priority = 1)
    public void verifyAddRemoveLinkTest(){
        addRemovePage removeLink = page.getInstance (addRemovePage.class).getAddRemoveLink ();
        Assert.assertNotNull (removeLink);
    }
    @Test(priority = 2)
    public void verifyHeaderOfAddRemovePageTest(){
        String head =page.getInstance (addRemovePage.class).getAddRemoveLink ().validateHeaderOfAddRemovePage ();
        System.out.println (head);
        Assert.assertEquals (head,"Add/Remove Elements");
    }
    @Test(priority = 3)
    public void verifyAddLinkTest() {
        page.getInstance (addRemovePage.class).getAddRemoveLink ().validateAddLink ();
        Assert.assertNull (page.getInstance (addRemovePage.class).validateAddLink ());
    }

}
