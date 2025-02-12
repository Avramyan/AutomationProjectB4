package io.loop.test.day09;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_drag_drop {

    @Test
    public void dragDrop() {

        Driver.getDriver().get("https://demo.guru99.com/test/drag_drop.html");
        WebElement bank = Driver.getDriver().findElement(By.xpath("//li[@data-id='5']/a"));

        WebElement debitAcc = Driver.getDriver().findElement(By.xpath("//ol[@id='bank']"));

       Actions action = new Actions(Driver.getDriver());
       action.dragAndDrop(bank, debitAcc).build().perform();

       WebElement fiveK = Driver.getDriver().findElement(By.xpath("//a[text()=' 5000']"));
       WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7"));

       action.dragAndDrop(fiveK, debitAmount).perform();

       WebElement sales = Driver.getDriver().findElement(By.xpath("//a[text()=' SALES ']"));
       WebElement creditAcc = Driver.getDriver().findElement(By.xpath("//ol[@id='loan']"));

       action.dragAndDrop(sales, creditAcc).perform();

       WebElement creditAmount = Driver.getDriver().findElement(By.xpath("//ol[@id='amt8']/li\n"));

       action.dragAndDrop(fiveK,creditAmount).perform();

       WebElement successMessage = Driver.getDriver().findElement(By.xpath("//a[@class='button button-green' and contains(text(), 'Perfect!')]\n"));
       String successMessageText = successMessage.getText();
       Assert.assertEquals(successMessageText, "Perfect!");
    }
}
/*
    1- Open a chrome browser
    2- Go to: https://demo.guru99.com/test/drag_drop.html
    3- Drag “BANK” and drop into Account area under Debit Side
    4- Drag “5000” and drop into Amount area under Debit Side
    5- Drag “SALES” and drop into Account area under Credit Side
    6- Drag “5000” and drop into Amount area under Credit Side
    7- Validate “Perfect!” text displayed.
     */