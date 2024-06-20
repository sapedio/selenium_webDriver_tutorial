package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchWindows(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testControlClickNewTab(){
        var buttonPage = homePage.clickDynamicLoading().clickNewTabExample2();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(),"Start button is not displayed");
    }
}
