package io.loop.test.day05;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T000_staleElementExeption {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();
        WebElement delete = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));

        if (delete.isDisplayed()) {
            System.out.println("Delete button is displayed");
        } else {
            System.out.println("Delete button is not displayed");
        }
        delete.click();

        try {
            delete.isDisplayed();
        } catch (StaleElementReferenceException s) {
            System.out.println("Exception handled");
            System.out.println("Element is not displayed");
        }


    }
}

        /*1. Open Chrome browser
          2. Go to http://the-internet.herokuapp.com/add_remove_elements/
          3. Click to “Add Element” button
          4. Verify “Delete” button is displayed after clicking.
          5. Click to “Delete” button.
          6. Verify “Delete” button is NOT displayed after clicking.
          USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

         */