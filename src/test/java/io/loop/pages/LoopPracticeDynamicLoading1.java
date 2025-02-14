package io.loop.pages;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

public class LoopPracticeDynamicLoading1 {
    public LoopPracticeDynamicLoading1() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(@href,'loading/1')]")
    public WebElement dynamicLoading1;
    @FindBy(xpath = "//button[contains(text(),'Start')]")
    public WebElement startButton;

    @FindBy(id = "loading")
    public WebElement loadingBar;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "pwd")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[contains(@class,'alert')]")
    public WebElement alert;

}
/*
    1. go to https://loopcamp.vercel.app/dynamic_loading/1.html
    2. click start
    3. wait loading bar disappears
    4. validate username is displayed
    5. enter username tomsmith
    6. enter password incorrectpassword
    7. click submit button
    8. validate "Your password is invalid!" is displayed
     */