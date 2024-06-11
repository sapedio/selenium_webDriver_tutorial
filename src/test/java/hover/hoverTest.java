package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class hoverTest extends BaseTest {

    @Test
    public void testHoverUser1(){
        var hoverPage = homePage.clickHover();
        var caption = hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(caption.getTittle(),"name: user1", "Caption title is incorrect");
        assertEquals(caption.getLinkText(),"View profile", "Link text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link is incorrect");

    }
}
