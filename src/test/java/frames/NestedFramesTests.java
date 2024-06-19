package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTest {

    @Test
    public void testNestedFrames(){
        String leftText = "LEFT";
        String bottomText = "BOTTOM";

        var framesPage = homePage.clickFramesPage();
        var nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(),leftText,"Left frame text is incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(),bottomText,"Bottom frame text is incorrect");

    }
}
