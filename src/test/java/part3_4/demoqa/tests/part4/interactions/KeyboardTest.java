package part3_4.demoqa.tests.part4.interactions;

import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textboxPage = homePage.goToElements().clickTextBox();
    }

}








