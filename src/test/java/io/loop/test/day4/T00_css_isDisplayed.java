package io.loop.test.day4;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T00_css_isDisplayed {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");

        WebElement forgotPassword = driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println(forgotPassword.getText());

        if (forgotPassword.isDisplayed()) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
    }
}
   /*
    https://the-internet.herokuapp.com/forgot_password
     */