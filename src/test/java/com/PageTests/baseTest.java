package com.PageTests;

import com.Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class baseTest {

    public WebDriver driver;
    public parentPage page;

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUp( String browser) {
        if (browser.equals ("chrome")) {
            WebDriverManager.chromedriver ().setup ();
            driver = new ChromeDriver ();
        } else if (browser.equals ("ff")) {
            WebDriverManager.firefoxdriver ().setup ();
            driver = new FirefoxDriver ();
        } else{
            System.out.println ("No browser found");
    }
        page = new basePage (driver);
        driver.manage ().window ().maximize ();
        driver.manage ().deleteAllCookies ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (20));
        driver.get ("https://the-internet.herokuapp.com/");

    }


    @AfterMethod
    public void tearDown(){
        driver.quit ();
    }

}
