package part3_4.demoqa.tests.part4.screenshot;

import com.demoqa.pages.HomePage;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class CaptureFailedScreenShotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor() {
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
