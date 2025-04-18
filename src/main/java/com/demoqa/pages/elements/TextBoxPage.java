package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class TextBoxPage extends ElementsPage {
    private By fullnameField = By.id("userName");

    public void setFullName(String name) {
        scrollToElementJS(fullnameField);
        Actions act = new Actions(driver);
        act.sendKeys(find(fullnameField), Keys.chord(name)).perform();

    }

}
