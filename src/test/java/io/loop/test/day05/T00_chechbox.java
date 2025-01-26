package io.loop.test.day05;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T00_chechbox {
    public static void main(String[] args) {

//        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
//        driver.manage().window().maximize();
//        driver.get("http://the-internet.herokuapp.com/checkboxes");
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox' and following-sibling::input]"));
//        checkbox1.click();
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement checkbox1 = driver.findElement(By.xpath("//input/following-sibling::text()[contains(.,'checkbox 1')]/preceding-sibling::input"));
        if (!(checkbox1.isSelected())) {
            System.out.println("checkbox1 is not Selected");
        } else {
            System.out.println("checkbox1 is Selected");
        }
        checkbox1.click();
        if (!(checkbox1.isSelected())) {
            System.out.println("checkbox1 is not Selected");
        } else {
            System.out.println("checkbox1 is Selected");
        }

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox' and preceding-sibling::input]"));
        if (!(checkbox2.isSelected())) {
            System.out.println("checkbox2 is not Selected");

        } else {
            System.out.println("checkbox2 is Selected");
        }
        checkbox2.click();

        //input[@type='checkbox' and following-sibling::text()[contains(., ' checkbox 1')]]
    }
}
      /*
        1. Go to http://the-internet.herokuapp.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected.

         */
