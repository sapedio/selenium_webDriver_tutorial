package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public RecoveryEmailSentPage clickRetrivePasswordButton(){
        driver.findElement(By.id("form_submit")).click();
        return new RecoveryEmailSentPage(driver);
    }


}
