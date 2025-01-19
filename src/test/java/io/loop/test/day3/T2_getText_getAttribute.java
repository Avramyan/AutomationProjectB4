package io.loop.test.day3;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {
        //go to the URL https://loopcamp.vercel.app/registration_form.html
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();

        driver.navigate().to(LoopCampConstants.REGISTRATION_FORM_URL);

        // locate the element HEADER
        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        //Use getText method
        String actualHeaderForForm = headerForForm.getText();
        if (actualHeaderForForm.equals(LoopCampConstants.EXPECTED_HEADER_FOR_FORM)) {
            System.out.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", matches actual header: \"" + actualHeaderForForm + "\" => TEST PASSED");
        } else {
            System.err.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT MATCH actual header: \"" + actualHeaderForForm + "\" => TEST FAILED");
        }
        WebElement firstNamePlaceHolder = driver.findElement(By.name("firstname"));
        String actualFirstNamePlaceHolder = firstNamePlaceHolder.getAttribute("placeholder");

if (actualFirstNamePlaceHolder.equals(LoopCampConstants.EXPECTED_PLACEHOLDER_FIRSTNAME)){
    System.out.println("Expected placeholder matches with actual");

}else {
    System.err.println("Expected placeholder matches with actual. error");
}
    }
}


    /*
    go to url: https://loopcamp.vercel.app/registration_form.html
    verify header text expected:  Registration form
    verify placeholder attribute value for first name expected - first name
     */
