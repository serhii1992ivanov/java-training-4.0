package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    // TODO define title and logout WebElements using @FindBy
    @FindBy(css = "h2") // Assuming the title is in an <h2> tag
    private WebElement title;

    @FindBy(css = ".icon-2x") // Assuming this is the locator for the logout button
    private WebElement logoutButton;

    public MainPage(WebDriver driver) {
        super(driver);
        // Initialize WebElements
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        // TODO return title text
        return title.getText();
    }

    public void clickLogout() {
        // TODO click logout and return MainPage
        logoutButton.click();
    }
}