package com.PageTests;

import com.Pages.fileDownloader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class fileDownloaderTest extends baseTest{
    @Test(priority = 1)
    public void verifyFileDownloaderTest(){
       Assert.assertTrue ( page.getInstance (fileDownloader.class).getFileDownloader ());
    }

}
