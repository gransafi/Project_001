package com.PageTests;

import com.Pages.contextMenu;
import org.testng.annotations.Test;

public class contextMenuTest extends baseTest{

    @Test(priority = 1)
    public void verifyContextMenuTest(){
        page.getInstance (contextMenu.class).getContextMenuLink ();
    }
}

