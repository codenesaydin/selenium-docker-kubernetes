package com.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest
{
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeEach
    public void before() throws MalformedURLException
    {
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 15);
        System.out.println(Thread.currentThread().hashCode());
    }

    @AfterEach
    public void teardown()
    {
        driver.quit();
    }
}
