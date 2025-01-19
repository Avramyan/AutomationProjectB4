package io.loop.test.day3;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_GetAttribute_CSS {
    public static void main(String[] args) {
        // GO TO URL
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);
        // locate the elem with css
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String docuport = logo.getDomAttribute("alt");
        System.out.println("docuport = " + docuport);
        if (DocuportConstants.LOGO_DOCUPORT.equals(docuport)) {
            System.out.println("expected matches with actual");

        }else{
            System.out.println("expected DOES NOT matches with actual");
            System.err.println("TEST FAILED");

        }


    }
}
/*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"
TODO:
    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */