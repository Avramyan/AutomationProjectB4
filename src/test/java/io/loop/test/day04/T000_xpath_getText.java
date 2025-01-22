package io.loop.test.day04;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T000_xpath_getText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);

        //click on forgot password
        WebElement forgotPassword = driver.findElement(By.xpath("//a[@class='body-2 text-decoration-none primary--text']"));
        forgotPassword.click();

        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(DocuportConstants.RESET_PASSWORD_URL)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        WebElement validateMessage = driver.findElement(By.xpath
                ("//div[contains(text(),'email')]") );
        String actualEmail = validateMessage.getText();
        if (actualEmail.equals(DocuportConstants.RESET_PASSWORD_MESSAGE) ) {
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
        }

        WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@id, 'input')]"));
        emailInputBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);

        WebElement cancelButton = driver.findElement(By.xpath("//span[contains(.,'Send')]") );
        WebElement sendButton = driver.findElement(By.xpath("//span[normalize-space()='Send']" ));

        if (cancelButton.isDisplayed()) {
            System.out.println("Passed");
        }else {
            System.out.println("Fail");
        }
        if (sendButton.isDisplayed()) {
            System.out.println("Passed");
        }else {
            System.out.println("Fail");
        }

        sendButton.click();
        Thread.sleep(3000);

        WebElement successMessage = driver.findElement(By.xpath("//span[@class='body-1']"));

        Thread.sleep(10000);
        System.out.println(successMessage.getText());

        try{
            System.out.println(successMessage.getText());
        }catch (StaleElementReferenceException e){
            System.out.println("not there anymore");
        }
    }
}
/*
    1. open chrome
    2. go to docuport
    3. click on forgot password
    4. validate url contains: reset-password
    5. validate - Enter the email address associated with yor account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate send button is displayed
    8. validate cancel button is displayed
    9. click send button
    10. validate - We've sent you an email with a link to reset your password. Please check your email
     */