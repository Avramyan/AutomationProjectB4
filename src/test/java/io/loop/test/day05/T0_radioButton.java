package io.loop.test.day05;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class T0_radioButton {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/radio-buttons.html");
        //selenium 3 wait
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //selenium 4
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement red = driver.findElement(By.xpath("//input[@id='red']"));
        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));
        WebElement blue = driver.findElement(By.xpath("//input[@id='blue']"));

        //is selected
        System.out.println("red.isSelected() BEFORE CLICK = " + red.isSelected());
        red.click();
        System.out.println("red.isSelected() AFTER CLICK = " + red.isSelected());

        green.click();
        System.out.println("green.isSelected() AFTER CLICK = " + green.isSelected());
        //is enabled
        System.out.println("red.isEnabled() = " + red.isEnabled());

        System.out.println("green.isEnabled() = " + green.isEnabled());
        System.out.println("blue.isEnabled() = " + blue.isEnabled());
    }
}
   /*
        https://loopcamp.vercel.app/radio-buttons.html
        wait implicitly 10 seconds
        is selected
        is enabled
         */