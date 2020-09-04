package com.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest
{
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeEach
    public void before()
    {
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
    }

    @AfterEach
    public void teardown()
    {
        driver.quit();
    }
}
