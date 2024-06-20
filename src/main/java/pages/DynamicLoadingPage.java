package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By link_Example1 = By.cssSelector("a[href='/dynamic_loading/1']");
    private By link_Example2 = By.cssSelector("a[href='/dynamic_loading/2']");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page clickNewTabExample2(){
        WebElement link2 = driver.findElement(link_Example2);
        Actions actions = new Actions(driver);
        actions.moveToElement(link2).keyDown(Keys.CONTROL).click().perform();
        return new DynamicLoadingExample2Page(driver);
    }

}
