package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;

    @BeforeClass
    public void setUp() {
        // Initialize a driver, open login URL, resize windows, and initialize steps
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Open login URL
        driver.get("https://the-internet.herokuapp.com/login");

        // Resize window
        driver.manage().window().setSize(new Dimension(840, 1027));

        // Initialize steps
        userSteps = new UserSteps(driver);
    }

    @AfterClass
    public void tearDown() {
        // TODO driver close and quit
        if (driver != null) {
            driver.close(); // Closes the current window
            driver.quit();  // Terminates the WebDriver session
        }
    }
}