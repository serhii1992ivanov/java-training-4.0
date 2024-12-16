package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    // TODO define username, password, and login WebElements using @FindBy
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = ".fa")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        // Initialize WebElements
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String text) {
        // TODO set username
        usernameField.sendKeys(text);
    }

    public void setPassword(String text) {
        // TODO set password
        passwordField.sendKeys(text);
    }

    public MainPage clickLogin() {
        // TODO click logout return instance of MainPage
        loginButton.click();
        return new MainPage(driver);
    }
}