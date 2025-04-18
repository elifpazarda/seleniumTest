package part3_4.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText, "actual and expected messages do not match");
        acceptAlert();
    }

    @Test
    public void testConfirmationAlert() {
        String expectedConfirmationResult = "You selected Cancel";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "you did not selected canceled");
    }

    @Test
    public void testPromtAlert() {
        String alertText = "Selenium With Java";
        String expectedResult = "You entered " + alertText;

        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickPromtalertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertsPage.getpPromtAlertResult();
        Assert.assertEquals(actualResult, expectedResult,
                "Actual & Expected Result Do Not Match");
    }


}
