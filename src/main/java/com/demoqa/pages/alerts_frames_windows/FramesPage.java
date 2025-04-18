package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.Browser;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[contains(text(),'Frames')]");
    private By iFrameSmallbox = By.xpath("//div[@id='frame2Wrapper']/iframe");



    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }


    private void switchToBigBox() {
        switchToFrameString(iFrameBigBox);
    }


    private void switchToSmallBox(){
    //    switchToFrameIndex(2);
        switchToFrameElement(find(iFrameSmallbox));
    }

    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }


    public String getTextInSmallFrame() {
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;

    }

















}
