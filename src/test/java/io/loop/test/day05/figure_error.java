//package io.loop.test.day05;
//
//import io.loop.test.utilities.GeneralConstants;
//import io.loop.test.utilities.WebDriverUtil;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class T5_multi_dropdown {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUpMethod() {
//        driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/select-menu");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @AfterMethod
//    public void tearDownMethod() {
//
//        driver.quit();
//
//
//    }
//
//    @Test
//    public void multiSelect() throws InterruptedException {
//        Select dropdown = new Select(driver.findElement(By.xpath("select[@id='cars']")));
//        Assert.assertTrue(dropdown.isMultiple(), "Dropdown should be multiple");
//        dropdown.selectByIndex(0);
//        Thread.sleep(3000);
//
//
//
//    }
//}
//       /*
//    1. Open Chrome browser
//    2. Go to https://demoqa.com/select-menu
//    3. Select all the options from multiple select dropdown.
//    4. Print out all selected values.
//    5. Deselect all values.
//     */