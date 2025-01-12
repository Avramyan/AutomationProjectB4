package io.loop.test.day3;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {


        WebDriver driver = WebDriverUtil.getDriver(DocuportConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.get(DocuportConstants.DOCUPORT_TEST);

        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.className("v-messages__message"));
        String actualErrorMessage = errorMessage.getText();

        if (actualErrorMessage.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)) {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualErrorMessage + " => TEST PASS");
        } else {
            System.err.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", DOES NOT MATCH actual error message: " + actualErrorMessage + " => TEST FAIL");
        }
        driver.quit();
    }

}

/*
 * go to docuport
 * enter username
 * do NOT enter password
 * click on login button
 * verify error message - please enter password
 */