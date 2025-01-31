package io.loop.test.day07;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.BrowserUtils;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.Set;

public class T3_window_titles extends TestBase {
    @Test
    public void testWindowTitles() {
        driver.get("http://google.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://amazon.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://the-flow.ru");

        System.out.println(driver.getTitle());

        Set<String> windowTitles = driver.getWindowHandles();
        for (String windowTitle : windowTitles) {
            driver.switchTo().window(windowTitle);
            if (driver.getTitle().contains("Amazon")) {
                break;
            }
        }

        BrowserUtils.switchWindowAndValidate(driver,"google.com","Google");
        System.out.println(driver.getTitle());
        BrowserUtils.switcTohWindow(driver,"amazon.com");
        System.out.println(driver.getTitle());
    }
}

