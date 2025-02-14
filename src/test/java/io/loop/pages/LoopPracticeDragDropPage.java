package io.loop.pages;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoopPracticeDragDropPage {

    public LoopPracticeDragDropPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement smallCircle;

    @FindBy(id = "droptarget")
    public WebElement bigCircle;

    LoopPracticeDragDropPage loopPracticeDragDropPage;
    Actions actions;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        actions = new Actions(Driver.getDriver());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void drag_small_here_test() {
        String expected = "Drag the small circle here.";
        String actual = loopPracticeDragDropPage.bigCircle.getText();

        assertEquals(actual, expected, "Actual does not match the expected");


    }

    @Test
    public void drop_here_test() {

        actions.moveToElement(loopPracticeDragDropPage.smallCircle)
                .clickAndHold()
                .moveByOffset(100,100)
                .pause(3000)
                .perform();
        assertEquals(loopPracticeDragDropPage.bigCircle.getText(), "Drop here." );
    }
    @Test
    public void drop_here(){

        actions.moveToElement(loopPracticeDragDropPage.smallCircle)
                .clickAndHold()
                .moveByOffset(0,-200)
                .pause(3000)
                .perform();
        assertEquals(loopPracticeDragDropPage.bigCircle.getText(), "Now drop..." );

    }
    @Test
    public void drag_and_drop_anywhere() {

        actions.moveToElement(smallCircle)
                .clickAndHold()
                .moveByOffset(100,100)
                .release()
                .pause(3000)
                .perform();
        assertEquals(loopPracticeDragDropPage.bigCircle.getText(), "Try again!" );
    }
}
/*
    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. validate expected default text appears on big circle
    Expected = "Drag the small circle here."

    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. validate "Drop here." text appears on big circle

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Move it on top of the big circle
    5. validate “Now drop…” text appears on big circ

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Dropped anywhere outside of big circle
    5. validate “Try again!” text appears on big circle
     */