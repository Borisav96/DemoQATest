package FUN;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Tools {

    public static void screenshot (WebDriver driver, String fileName) throws IOException {
        //Take screenshot of the page and save on Desktop
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\Boris\\Desktop\\" + fileName + ".jpg"));
    }

    public static void scrollMouse (WebDriver driver, int Number){
        //Mouse scroll down on page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + Number + ")", "");

    }

}
