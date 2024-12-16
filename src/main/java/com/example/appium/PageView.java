package com.example.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageView {
    private final AppiumDriver driver;

    // Define textField WebElement using @FindBy annotations for iOS and Android
    @AndroidFindBy(id = "edit") // Replace with the actual Android ID
    private WebElement androidTextField;

    @iOSXCUITFindBy(accessibility = "IntegerA") // Replace with the actual Accessibility ID for iOS found via Appium Studio
    private WebElement iosTextField;

    public PageView(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getTextField() {
        // Return text from the textField element
        if (driver instanceof AndroidDriver) {
            return androidTextField.getText();
        } else if (driver instanceof IOSDriver) {
            return iosTextField.getText();
        }
        return null; // Return null if not recognized
    }

    public void setTextField(String text) {
        // Set text to the textField element
        if (driver instanceof AndroidDriver) {
            androidTextField.sendKeys(text);
        } else if (driver instanceof IOSDriver) {
            iosTextField.sendKeys(text);
        }
    }
}
