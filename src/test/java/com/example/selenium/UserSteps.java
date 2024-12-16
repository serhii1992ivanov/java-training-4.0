package com.example.selenium;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class UserSteps {
    private final WebDriver driver;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public UserSteps login(String username, String password) {
        //Initialize LoginPage, call setUsername, setPassword, and click login methods

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        MainPage mainPage = loginPage.clickLogin();

        //Assert title implementation
        String expectedTitle = "Secure Area";
        assertEquals(mainPage.getTitle(), expectedTitle, "Title does not match after login.");

        return this;
    }

    public void logout() {
        //Call logout method implementation
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLogout();
    }
}