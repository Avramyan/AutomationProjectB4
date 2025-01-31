package io.loop.test.day07;

import io.loop.test.base.TestBase;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class T2_new_methods_window extends TestBase {

    @Test
    public void example1() {

        driver.get("http://google.com");
        //open new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://loopcamp.io");
//open new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://amazon.com");


    }

}