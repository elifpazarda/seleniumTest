package part3_4.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {
    @Test
    public void testModalDialog() {
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogsPage = afwPage.clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertFalse(actualText.contains("small modal"),
                "\n the message does not contain 'small modal'\n");
        modalDialogsPage.clickCloseButton();
    }
}
