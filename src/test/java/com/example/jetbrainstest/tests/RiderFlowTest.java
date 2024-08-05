package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.RiderFlowPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderFlowTest {

    private WebDriver driver;
    RiderFlowPage rfp;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jetbrains.com/");
        rfp = new RiderFlowPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка кнопки Watch")
    public void DeveloperTools() {
        rfp.clickCookieAcceptButton();
        rfp.clickElementDeveloperTools();
        rfp.clickElementRiderFlow();
        rfp.clickWatchButton();

        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.jetbrains.com/riderflow/download/#section=unity-asset-store", currentUrl, "Адрес != Watch");
    }

    @Test
    @DisplayName("Проверка оглавления Rider Flow")
    public void content() {
        rfp.clickCookieAcceptButton();
        rfp.clickElementDeveloperTools();
        rfp.clickElementRiderFlow();
//
        assertEquals("RiderFlow for Unity  ", rfp.contentRiderFlow(), "Неправильный текст оглавления");
    }
}