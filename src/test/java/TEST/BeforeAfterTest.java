package TEST;

import FUN.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.time.Duration;

public class BeforeAfterTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUP(){

        //Define Webdriver
        driver = new FirefoxDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Wait driver to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        //Go to URL
        baseURL = "https://www.google.com/";
        driver.get(baseURL);

    }

    @AfterTest
    public void endTest() throws IOException {
        //Take screenshot of page
        String screenShotName = getClass().getName();
        Tools.screenshot(driver, screenShotName);
        //Close the driver
        driver.quit();

    }


}