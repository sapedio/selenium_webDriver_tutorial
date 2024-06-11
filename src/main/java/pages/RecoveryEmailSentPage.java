package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecoveryEmailSentPage {

    private WebDriver driver;
    private By resultMessage = By.tagName("h1");

    public RecoveryEmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getResultMessage(){
        return driver.findElement(resultMessage).getText();
    }


}
