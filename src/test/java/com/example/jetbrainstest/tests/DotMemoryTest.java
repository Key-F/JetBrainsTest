package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.dotmemory.DotMemoryPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DotMemoryTest extends BaseTest {

    private DotMemoryPage DotMemoryPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/dotmemory/");
        DotMemoryPage = new DotMemoryPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка скачивания активна")
    public void buttonCheck() {
        assertTrue(DotMemoryPage.checkDownloadButton(), "Кнопка скачивания не активна");
    }
}