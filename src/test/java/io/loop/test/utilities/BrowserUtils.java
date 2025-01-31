package io.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    /**
     * validate if driver switched to expected URL or title
     * @param driver
     * @param expectedURL
     * @param expectedTitle
     * implements assertion
     */
    public static void switchWindowAndValidate(WebDriver driver, String expectedURL, String expectedTitle) {
        expectedTitle = expectedTitle.toLowerCase();
        expectedURL = expectedURL.toLowerCase();

        // get all windowHandles, switch one by one each time check if the URL matches expected to stop
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
                if(driver.getCurrentUrl().toLowerCase().contains(expectedURL)) {
                    break;
                }
        }
        // after
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));


    }
    /**
     * @param driver
     * @param targetTitle
     * @author artemavramov
     */
    public static void switcTohWindow(WebDriver driver, String targetTitle) {
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
           driver.switchTo().window(handle);
           if(driver.getTitle().toLowerCase().contains(targetTitle)) {
               return;
           }
        }
        driver.switchTo().window(origin);
    }

}
