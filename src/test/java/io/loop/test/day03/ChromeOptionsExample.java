package io.loop.test.day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
    public static void main(String[] args) {

        // create an object of chrome options
        ChromeOptions options = new ChromeOptions();

        // add argument to that option
        options.addArguments("--start-maximized");

        // start chrome with that option
        WebDriver driver = new ChromeDriver(options);

        // navigate
        driver.get("https//:www.google.com");
    }
}
