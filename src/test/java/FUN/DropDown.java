package FUN;

import POM.DemoQAPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class DropDown {

    public static void dropDown (WebDriver driver, WebDriverWait wait) throws InterruptedException, IOException {

        //Go to Interactions page
        driver.findElement(DemoQAPage.interactionButton).click();

        //Scroll down and click on button "Droppable"
        Tools.scrollMouse(driver, 200);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(DemoQAPage.droppableButton)));
        driver.findElement(DemoQAPage.droppableButton).click();

        //Define drag and drop boxes
        WebElement from = driver.findElement(DemoQAPage.dragMeBox);
        WebElement to  = driver.findElement(DemoQAPage.dropMeBox);

        //Perform Action drag and drop
        Tools.scrollMouse(driver, 200);
        Thread.sleep(1200);
        Actions move = new Actions(driver);
        move.dragAndDrop(from,to).perform();

        //Print text from dopedBoxFiled
        if (to.getText().equals("Dropped!")){
            System.out.println(to.getText());
        }
    }

}
