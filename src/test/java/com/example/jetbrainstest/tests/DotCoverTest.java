package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.DotCoverPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DotCoverTest extends BaseTest {

    private DotCoverPage DotCoverPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/dotcover/");
        DotCoverPage = new DotCoverPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Download' активна")
    public void checkDownload() {
        assertTrue(DotCoverPage.checkActivityOfDownload(), "Кнопка не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Pricing' активна")
    public void checkPricing() {
        assertTrue(DotCoverPage.checkActivityOfPricing(), "Кнопка 'Pricing' не активна");
    }

    @Test
    @DisplayName("Проверка наличия текста 'dotCover'")
    public void checkDotCover() {
        assertTrue(DotCoverPage.checkDotCoverEl(), "Текст dotCover не появился");
    }

    @Test
    @DisplayName("Проверка, что кнопка 'Discover all features' активна")
    public void checkFeatures() {
        assertTrue(DotCoverPage.checkActivityOfAllFeatures());
    }
}



