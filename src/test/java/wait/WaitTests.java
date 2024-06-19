package wait;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage1 = homePage.clickDynamicLoading().clickExample1();
        loadingPage1.clickStartButton();
        assertEquals(loadingPage1.getLoadedText(),"Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilAppears(){
        var loadingPage2 = homePage.clickDynamicLoading().clickExample2();
        loadingPage2.clickStartButton();
        assertEquals(loadingPage2.getLoadedText(),"Hello World!","Loaded text is incorrect");
    }
}
