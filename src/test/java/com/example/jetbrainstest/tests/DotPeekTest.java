package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.ScreenshotExtension;
import com.example.jetbrainstest.pages.DotPeekPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(ScreenshotExtension.class)
public class DotPeekTest extends BaseTest {

    private DotPeekPage DotPeekPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/decompiler/");
        DotPeekPage = new DotPeekPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка скачивания активна")
    public void buttonCheck() {
        assertTrue(DotPeekPage.checkDownloadButtonIsClickable(), "Button is not ready!");
    }
}