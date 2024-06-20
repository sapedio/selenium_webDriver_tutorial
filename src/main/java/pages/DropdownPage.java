package pages;

import com.google.common.base.Strings;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);

    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void dropdownSetMultipleAttributes(){
        var jsExecutor = (JavascriptExecutor)driver;
        WebElement dropdownList = driver.findElement(dropdown);
        String script = "arguments[0].setAttribute('multiple','')";
        jsExecutor.executeScript(script,dropdownList);
    }

    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }


}
