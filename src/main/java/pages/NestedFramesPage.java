package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrameName = "frame-top";
    private String leftFrameName = "frame-left";
    private String bottomFrameName = "frame-bottom";

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public void switchToTopFrame(){
        driver.switchTo().frame(topFrameName);
    }

    public void switchToLeftFrame(){
        driver.switchTo().frame(leftFrameName);
    }

    public void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrameName);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public String getLeftFrameText(){
        switchToTopFrame();
        switchToLeftFrame();
        String text = driver.findElement(By.tagName("body")).getText();
        switchToMainArea();
        switchToMainArea();
        return text;
    }

    public String getBottomFrameText(){
        switchToBottomFrame();
        String text = driver.findElement(By.tagName("body")).getText();
        switchToMainArea();
        return text;
    }

}
