package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.MyExtension;
import com.example.jetbrainstest.pages.RiderFlowPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)

public class RiderFlowTest extends BaseTest {

    RiderFlowPage rfp;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/");
        rfp = new RiderFlowPage(getDriver());
    }

    @Test
    @DisplayName("Проверка кнопки Download")
    public void DeveloperTools() {
        rfp.clickCookieAcceptButton();
        rfp.clickElementDeveloperTools();
        rfp.clickElementRiderFlow();
        rfp.clickDownloadButton();

        String currentUrl = getDriver().getCurrentUrl();
        assertEquals("https://www.jetbrains.com/riderflow/download/#section=unity-asset-store", currentUrl, "Адрес != Download");
    }

    @Test
    @DisplayName("Проверка оглавления Rider Flow")
    public void content() {
        rfp.clickCookieAcceptButton();
        rfp.clickElementDeveloperTools();
        rfp.clickElementRiderFlow();

        assertEquals("RiderFlow for Unity  ", rfp.contentRiderFlow(), "Неправильный текст оглавления");
    }

    @Test
    @DisplayName("Проверка активности кнопки Download")
    public void downloadButton() {
        rfp.clickCookieAcceptButton();
        rfp.clickElementDeveloperTools();
        rfp.clickElementRiderFlow();

        assertTrue(rfp.checkDownloadButton(), "Кнопка не активна");
    }
}