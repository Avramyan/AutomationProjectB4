/*
    TASK
- create list of expected values for single user
- put all info of user in a list of Strings
- create a method that return all fields as list of strings for one user and  do validation with a singe assertion
 */
package io.loop.test.day08;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T0_pizza_order {

    @Test
    public void order() {
        String givenName = "Samuel Jackson";
        List<String> samuelExpInfo = new ArrayList<>(Arrays.asList("Samuel Jackson", "Italian", "3", "12/21/2021", "13, Owl st.", "Starberry, UT", "US", "53665", "MasterCard", "555743242342", "03/25"));

        Assert.assertEquals(givenUserInfo(givenName), samuelExpInfo, "Actual does NOT match expected");
        System.out.println("ACTUAL INFO = " + givenUserInfo(givenName));
        System.out.println("Expected INFO = " + samuelExpInfo);
    }

    public static List<String> givenUserInfo(String givenName) {
        Driver.getDriver().get("https://loopcamp.vercel.app/web-tables.html");
        WebElement table = Driver.getDriver().findElement(By.xpath("//table[@class='SampleTable']"));
        List<WebElement> givenCells = table.findElements(By.xpath(".//tr[td[text()='" + givenName + "']]//td"));
        List<String> samuelInfo = new ArrayList<>();


        for (int i = 1; i < givenCells.size() - 1; i++) {


            samuelInfo.add(givenCells.get(i).getText());

        }

        return samuelInfo;
    }
}





/*
package io.loop.test.day09;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.PizzaOrderWebTableUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T0_pizza_order extends TestBase {
    @Test
    public void order() {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Samuel Jackson";
        String expectedPizzaType = "Italian";
        String actualPizzaType = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "pizzaType");
        System.out.println("actualPizzaType = " + actualPizzaType);
        Assert.assertEquals(actualPizzaType, expectedPizzaType);
    }
}

 */