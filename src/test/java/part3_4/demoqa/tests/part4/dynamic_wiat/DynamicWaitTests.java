package part3_4.demoqa.tests.part4.dynamic_wiat;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class DynamicWaitTests extends BaseTest {

    @Test
    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText,
        "actual & expected text do not match");
    }
}
