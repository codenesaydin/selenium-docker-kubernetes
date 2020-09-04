package com.base;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverExtension implements BeforeEachCallback, AfterEachCallback, BeforeAllCallback, AfterAllCallback, TestWatcher
{
    public WebDriver driver;

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception
    {
        System.out.println("afterAll : " + Thread.currentThread().hashCode());
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception
    {
        System.out.println("afterEach: " + Thread.currentThread().hashCode());

        driver.close();
        driver.quit();
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception
    {
        System.out.println("beforeAll: " + Thread.currentThread().hashCode());
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");

        WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get("https://www.sahibinden.com/");

        System.out.println("beforeEach: " + Thread.currentThread().hashCode());
    }
}
