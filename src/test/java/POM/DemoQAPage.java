package POM;

import org.openqa.selenium.By;

public class DemoQAPage {

    public static By interactionButton = By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[5]/div[1]");
    public static By droppableButton = By.xpath("//div[5]/div/ul/li[4]");
    public static By dragMeBox = By.id("draggable");
    public static By dropMeBox = By.id("droppable");

    public static By widgetButton = By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[4]/div[1]/div[1]");
    public static By toolTipsButton = By.xpath("//div[@class='element-list collapse show']//ul[@class='menu-list']//li[@id='item-6']");
    public static By hoverMeToSeeButton = By.id("toolTipButton");
    public static By hoverMeToSeeTextField = By.id("toolTipTextField");
    public static By buttonToolTip = By.id("buttonToolTip");
    public static By texToolTip = By.id("textFieldToolTip");

}
