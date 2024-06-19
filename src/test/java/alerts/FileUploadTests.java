package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUploadPage();
        uploadPage.uploadFile("C:\\Users\\Simon\\IdeaProjects\\selenium_webdriver_java\\webDriver_java\\resources\\chromedriver.exe");
        String fileName = "chromedriver.exe";
        assertEquals(uploadPage.getUploadedFileName(),fileName,"Uploaded file name is incorrect");
    }
}
