package io.loop.test.day07;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class T1_window extends TestBase {

    @Test
    public void example1() {
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Assert.assertEquals(driver.getTitle(), "The Internet", "Actual does not match expected");

        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement clickHere = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHere.click();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://loopcamp.io");
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("http://amazon.com");
        String originalWindow = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            System.out.println("each = " + each);
            driver.switchTo().window(each);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        System.out.println(driver.getTitle());
        }

        driver.switchTo().window(originalWindow);
    }

}
    /*
    1. Open a chrome browser
    2. Go to : http://the-internet.herokuapp.com/windows
    3. Assert: Title is “The Internet”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”
     */