package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage {
    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        // step 1 : get the current "main" window handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("main window id: " + currentHandle + "\n");


        // step 2 : get all window handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("# of Open windows: " + allHandles.size());

        for (String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st window ID: " + handle);
            } else {
                switchToWindow(handle);
                System.out.println("2nd window ID: " + handle);
            }
        }
        // step 3 : switch to the new window using the window handle



    }
}
