package TEST;

import FUN.DropDown;
import FUN.GoogleSearch;
import org.testng.annotations.Test;

import java.io.IOException;

public class DragDropTest extends BeforeAfterTest{

    @Test
    public void dragDropTest() throws InterruptedException, IOException {

        GoogleSearch.googleSearch(driver, wait);
        DropDown.dropDown(driver, wait);


    }

}
