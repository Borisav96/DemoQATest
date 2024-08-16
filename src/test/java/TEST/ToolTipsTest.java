package TEST;

import FUN.GoogleSearch;
import FUN.HoverMe;
import POM.GooglePage;
import org.testng.annotations.Test;

public class ToolTipsTest extends BeforeAfterTest{

    @Test
    public void toolTipsTest() throws InterruptedException {

        String screenShotName = "DragDropTest.jpg";
        GoogleSearch.googleSearch(driver, wait);
        HoverMe.hoverMe(driver, wait);

    }

}
