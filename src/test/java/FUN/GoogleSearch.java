package FUN;

import POM.GooglePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {

    public static void googleSearch (WebDriver driver, WebDriverWait wait){

        //Click on search bar on Google page and input "demoqa"
        driver.findElement(GooglePage.searchTextBar).sendKeys("demoqa");
        driver.findElement(GooglePage.searchTextBar).submit();
        //Wait for results to load, and click on first result
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[contains(.,'DEMOQA')]"))));
        driver.findElement(GooglePage.searchResult).click();

    }
}
