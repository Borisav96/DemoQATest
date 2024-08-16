package POM;

import org.openqa.selenium.By;

public class GooglePage {

    public static By searchTextBar = By.name("q");
    public static By searchResult = By.xpath("//h3[contains(.,'DEMOQA')]");


}
