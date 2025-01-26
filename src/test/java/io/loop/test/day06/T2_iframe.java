package io.loop.test.day6;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class T2_iframe extends TestBase {

        /*
    1- Open a chrome browser
    2- Go to: https://loopcamp.vercel.app/iframe.html
    3- Clear text from comment body
    4- Type "Loop Academy" in comment body
    5- Verify "Loop Academy" text is written in comment body
    6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
     */


    @Test
    public void iframeTest(){
        driver.get("https://loopcamp.vercel.app/iframe.html");
        // WebElement someText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        // someText.getText();

        // WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")); // with xpath
        // driver.switchTo().frame(iframe);

        // driver.switchTo().frame("mce_0_ifr"); // bu id or name

        driver.switchTo().frame(0); //by index


        //WebElement someText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        //System.out.println("someText.getText() = " + someText.getText());

        WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
        textBox.clear();
        textBox.sendKeys("Loopcamp");
        assertEquals(textBox.getText(), "Loopcamp", "Actual is not matching expected");

        driver.switchTo().defaultContent();

        WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame')]"));
        assertTrue(header.isDisplayed(), "Header is NOT displayed");

    }

    @Test
    public void nestedFrame(){
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        List <WebElement> iframes;
        iframes = driver.findElements(By.xpath("//frame"));
        System.out.println("iframe size = " + iframes.size());
    }
}
