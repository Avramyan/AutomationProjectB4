package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        // Setting up the web driver
//        WebDriverManager.chromedriver().setup();

        // create the instance of the driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();

        //navigate to page
        driver.navigate().to("file:///Users/artemavramov/Desktop/HTML/MyFirstHTML.html");
        Thread.sleep(3000);
        driver.get("https://www.nba.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.quit();
    }
}
