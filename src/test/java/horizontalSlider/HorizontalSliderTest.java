package horizontalSlider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testMoveSliderTo4(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        for(int i = 0; i<8 ;i++){
            horizontalSliderPage.moveHorizontalSlider();
        }
        assertEquals(horizontalSliderPage.findRangeResult(),"4");
    }
}
