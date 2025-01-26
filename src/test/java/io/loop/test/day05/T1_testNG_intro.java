package io.loop.test.day05;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class T1_testNG_intro {
    @Test(priority = 1)
    public void test2() {
        System.out.println("test 2 is running");
        String expexted = "Diana";
        String actual = expexted;
        assertEquals(actual, expexted, "FAILED TEST 2");
    }

    @Test (priority = 2)
    public void test1() {
        System.out.println("test 1 is running");
        String actual = "Feygruz";
        String expected = "Dendyr";
//        Assert.assertEquals(actual, expected, "Fail message");
        assertEquals(actual, expected, "Fail message");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Before method running");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("After method running");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("Before class running");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("After class running");
    }

}
