package forgotPassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.RecoveryEmailSentPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testForgotPassword(){
        var forgotPasswordPage = homePage.clickForgotPassword();

        forgotPasswordPage.setEmail("simonmosqueda@gmail.com");
        RecoveryEmailSentPage recoveryEmailSentPage  = forgotPasswordPage.clickRetrivePasswordButton();
        assertTrue(recoveryEmailSentPage.getResultMessage().contains("Internal Server Error"),"Result message Incorrect");
    }

}
