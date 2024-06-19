package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuAlertTests extends BaseTest {

    @Test
    public void contextClickAlertTest(){
        var contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.rightClickHotSpot();
        String text = "You selected a context menu";
        assertEquals(contextMenuPage.alert_getMessage(),text,"The alert message is incorrect");
        contextMenuPage.alert_clickAccept();
    }
}
