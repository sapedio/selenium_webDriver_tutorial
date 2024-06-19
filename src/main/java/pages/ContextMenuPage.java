package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By contextClickZone = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickHotSpot(){
        WebElement hotSpot = driver.findElement(contextClickZone);
        Actions actions = new Actions(driver);
        actions.moveToElement(hotSpot).contextClick().perform();
    }

    public String alert_getMessage(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickAccept(){
        driver.switchTo().alert().accept();
    }



}
