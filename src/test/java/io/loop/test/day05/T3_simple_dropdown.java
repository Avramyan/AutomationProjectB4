package io.loop.test.day05;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class T3_simple_dropdown {
    WebDriver driver;
    String expected = "Please select an option";
    String actual;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
//        driver.close();
    }
    @Test
    public void dropDownTest() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement dropdownElem = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropdown = new Select(dropdownElem);
        actual = dropdown.getFirstSelectedOption().getText();
        assertEquals(actual, expected, "Actual doe not match expected");

    }
}
/*
    1. Open Chrome browse
    2. Go to http://the-internet.herokuapp.com/dropdown
    3. Verify “Dropdown list” default selected value is correct - Expected: “Please select an option”

 */