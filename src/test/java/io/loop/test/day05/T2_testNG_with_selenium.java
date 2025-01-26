package io.loop.test.day05;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T2_testNG_with_selenium {
    WebDriver driver;
    String expected;
    String actual;
@BeforeMethod
public void setUp() {
    driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
    driver.manage().window().maximize();
}
    @Test
    public void googleTitle(){
    driver.get("https://www.google.com");
    expected = "Google";
        actual = driver.getTitle();
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
    assertEquals(actual, expected, "Actual: " + actual + " Does not match Expected: " + expected);
    }

    @Test
    public void docuportTitle() {
        driver.get(DocuportConstants.DOCUPORT_TEST);
        expected = "Docuport";
        actual = driver.getTitle();

        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());

        assertEquals(actual, expected, "Actual: " + actual + " Does not match Expected: " + expected);

    }

}
