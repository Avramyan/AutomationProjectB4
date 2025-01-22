package io.loop.test.day04;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class T1_FindElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://www.nba.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        Thread.sleep(3000);
//
        List<WebElement> nbaLinks = driver.findElements(By.tagName("a"));
        System.out.println("nbaLinks.size() = " + nbaLinks.size());
        List<WebElement> nbaLinksXPath = driver.findElements(By.xpath("//a"));
        System.out.println("nbaLinksXPath = " + nbaLinksXPath);

        for (WebElement nbaLink : nbaLinks) {
            if (!(nbaLink.getText().isEmpty())) {
                System.out.println(nbaLink.getText());
                System.out.println(nbaLink.getDomAttribute("href"));


            }
                }
        for (int i = 0; i < nbaLinks.size(); i++) {
            if (!(nbaLinks.get(i).getText().isEmpty())) {
                System.out.println(i + ". " + nbaLinks.get(i).getText());
                System.out.println(nbaLinks.get(i).getDomAttribute("href"));
            }
        }
        WebElement element = driver.findElement(By.xpath("//button[@id='bx-close-inside-2876415-clone']"));
        element.click();

    }
}
   /*
        1- Open a chrome browser
        2- Go to: https://www.nba.com
        3- Locate all the links in the page.
         */