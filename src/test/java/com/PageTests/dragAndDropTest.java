package com.PageTests;

import com.Pages.dragAndDrop;
import org.testng.annotations.Test;

public class dragAndDropTest extends baseTest{
    @Test(priority = 1)
    public void verifyDragAndDropTest(){
        page.getInstance (dragAndDrop.class).getDragAndDrop ();
    }
}
