package io.loop.test.day09;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T3_JSExecutor_scroll {

    @Test
    public void nordstrom_scroll() {
        Driver.getDriver().get("https://loopcamp.vercel.app//");

        WebElement element = Driver.getDriver().findElement(By.xpath("//a[@href='https://www.loopcamp.io/']\n"));
        Actions actions = new Actions(Driver.getDriver());

        actions.scrollToElement(element).perform();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true)", element);
        js.executeScript("arguments[0].click();", element);
        js.executeScript("window.scroll(0,5000)", element);

    }
}
/*
Go to https://www.nordstromrack.com/
Scroll down
Generate random email and enter into sign up box
Click on sign up
Verify "you are in" is displayed
*/