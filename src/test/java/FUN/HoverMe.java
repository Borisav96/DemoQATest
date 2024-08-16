package FUN;

import POM.DemoQAPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverMe {

    public static void hoverMe(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        //Navigate to Widget webpage
        System.out.println(driver.getCurrentUrl());
        driver.findElement(DemoQAPage.widgetButton).click();
        //Navigate to toolTipsButton webpage
        Tools.scrollMouse(driver, 400);
        driver.findElement(DemoQAPage.toolTipsButton).click();


        Tools.scrollMouse(driver, 200);
        Thread.sleep(1200);
        Actions hoverOver = new Actions(driver);

        //Action move mouse over button
        hoverOver.moveToElement(driver.findElement(DemoQAPage.hoverMeToSeeButton)).perform();

        //Wait for text to showup
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(DemoQAPage.buttonToolTip)));

        String buttonText = driver.findElement(DemoQAPage.buttonToolTip).getText();
        //Action move mouse over text
        hoverOver.moveToElement(driver.findElement(DemoQAPage.hoverMeToSeeTextField)).perform();
        //Wait for text to showup
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(DemoQAPage.texToolTip)));
        String textTextField = driver.findElement(DemoQAPage.texToolTip).getText();

        //Print popup message from site
        String finishText = buttonText + "\n" + textTextField;

        //Check if right message is printed
        if (finishText != null && finishText.trim().length() > 0) {
            System.out.println(finishText);
        }


    }

}
