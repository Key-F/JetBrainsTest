package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.resharper.ReSharperPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReSharperTest extends BaseTest {
    private ReSharperPage reSharperPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();

        getDriver().get("https://www.jetbrains.com/resharper/");
        reSharperPage = new ReSharperPage(getDriver());
    }

    @Test
    @DisplayName("отображение кнопки Download")
    public void clickOnDownloadButton() {
        assertTrue(reSharperPage.downloadButtonDisplay(), "Кнопка Download не отображается.");
    }

    @Test
    @DisplayName("Проверка Placeholder в поле Email")
    public void checkEmailFieldPlaceholder() {
        assertEquals(reSharperPage.checkEmailFieldPlaceholder(), "Email", "Placeholder не соответствует полю.");
    }
}
