package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frames_WindowsPage {

    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResultButton = By.id("confirmResult");
    private By promtAlertButton = By.id("promtButton");
    private By promtResult = By.id("promptResult");

    public String getpPromtAlertResult() {
        return find(promtResult).getText();
    }

    public void clickPromtalertButton() {
        click(promtAlertButton);
    }

    public void clickInformationAlertButton () {
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton() {
        click(confirmationAlertButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResultButton).getText();
    }
}
