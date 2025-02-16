package io.loop.test.day10;

import com.google.j2objc.annotations.Weak;
import io.loop.pages.LoopPracticeDynamicLoading7;
import io.loop.test.utilities.BrowserUtils;
import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class T2_explicit_wait {

LoopPracticeDynamicLoading7 loopPracticeDynamicLoading7;
WebDriverWait wait;

@BeforeMethod
    public void beforeMethod() {
    loopPracticeDynamicLoading7 = new LoopPracticeDynamicLoading7();
    Driver.getDriver().get(ConfigurationReader.getProperties("loop.practice") );
}

@AfterMethod
    public void afterMethod() {
    Driver.closeDriver();
}
@Test
    public void t2_explicit_wait() {
    BrowserUtils.loopLinkClick("Dynamic Loading");
    loopPracticeDynamicLoading7.getDynamicLoading7.click();
    wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    wait.until(ExpectedConditions.titleIs("Dynamic title"));
    assertTrue(loopPracticeDynamicLoading7.doneMessage.isDisplayed());
    assertTrue(loopPracticeDynamicLoading7.image.isDisplayed());
}
}
