package com.Pages;
import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Iterator;


public class test {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver ().setup ();
        WebDriver driver = new ChromeDriver ();

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (20));
        driver.get ("https://the-internet.herokuapp.com/");
        driver.findElement (By.xpath ("//a[normalize-space()='Exit Intent']")).click ();
        driver.getTitle ();
        Actions actions = new Actions (driver);
        WebElement parent = driver.findElement (By.xpath ("// meta[@name='viewport']"));
        actions.moveToElement (parent).perform ();
//        Alert alert = driver.switchTo ().alert ();
//        WebElement element = driver.findElement (By.xpath ("//p[normalize-space()='Close']"));
//        alert.dismiss ();



        Thread.sleep (5000);

    }
}
//    Actions builder = new Actions(driver);
//builder.keyDown(Keys.CONTROL)
//        .click(someElement)
//        .moveByOffset(10, 25)
//        .click(someOtherElement)
//        .keyUp(Keys.CONTROL)
//        .build()
//        .perform();

//      driver.get ("https://the-internet.herokuapp.com/");
//              driver.findElement (By.xpath ("//a[normalize-space()='Entry Ad']")).click ();
////        window pop up solution....
//              Set<String> handles = driver.getWindowHandles ();
//        Iterator<String> iterator = handles.iterator ();
//        String nextP = iterator.next ();
//        System.out.println (nextP);
//        System.out.println (nextP);
//        String child = iterator.next ();
//        System.out.println (child);
//        driver.switchTo ().window (child);
//        System.out.println (driver.getTitle ());
//        driver.close ();
//        driver.switchTo ().window (nextP);
//        System.out.println (driver.getTitle ());
//        driver.close ();