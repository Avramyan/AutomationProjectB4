package io.loop.test.day05;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T6_HTML_dropdown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDownMethod() {
        // driver.close();
    }

    @Test
    public void htmlDropdown(){
        WebElement username = driver.findElement(By.xpath("//input[@id='input-14']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='input-15']"));
        WebElement signIn = driver.findElement(By.className("v-btn__content"));
        username.sendKeys(DocuportConstants.USERNAME_CLIENT);
        password.sendKeys("Group1");
        signIn.click();
        WebElement dropdown = driver.findElement(By.xpath("//input[@id='input-86']"));
        dropdown.click();
        WebElement dropdown2 = driver.findElement(By.xpath("//span[contains(text(),'FeyruzTheBest5')]"));
        dropdown2.click();
    }
}