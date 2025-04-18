package part3_4.demoqa.tests.part3.javascript;

import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class JavaScriptTest extends BaseTest {
    @Test
    public void testScrollingToElement(){
        homePage.goToForms();
    }
}
