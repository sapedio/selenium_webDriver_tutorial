package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class DropdownTest extends BaseTest {

    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }

    @Test
    public void testSelectBothOptions(){
        var dropdownPage = homePage.clickDropdown();

        String option1 = "Option 1";
        String option2 = "Option 2";
        dropdownPage.dropdownSetMultipleAttributes();
        dropdownPage.selectFromDropdown(option1);
        dropdownPage.selectFromDropdown(option2);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),2,"Incorrect number of selections");

    }
}
