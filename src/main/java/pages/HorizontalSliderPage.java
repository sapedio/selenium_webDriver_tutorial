package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By horizontalSlider = By.tagName("input");
    private By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveHorizontalSlider(){
        driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String findRangeResult(){
        return driver.findElement(range).getText();
    }

}
